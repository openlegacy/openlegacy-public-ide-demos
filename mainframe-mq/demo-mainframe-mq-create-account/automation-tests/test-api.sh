echo "running mf mq account test-api script"

main_path=$PWD
project_path=mainframe-mq/demo-mainframe-mq-create-account

cd $main_path/$project_path/sample-projects/mainframe-mq-sdk
mvn -s $main_path/settings.xml clean install -DskipTests 
echo "finished sdk run"
cd $main_path/$project_path/sample-projects/mainframe-mq-api
mvn -s $main_path/settings.xml clean spring-boot:run -DskipTests > $main_path/$project_path/e2eLogs.txt 2>&1 &
# sleep 30
timeout 120 sh -c 'until nc -z $0 $1; do sleep 1; done' localhost 8080
echo "finished api run"
newman run $main_path/$project_path/automation-tests/api-test/Mainframe-MQ-Create-Account.postman_collection.json -e $main_path/$project_path/automation-tests/api-test/mainframe-mq-create-account.postman_environment.json
status=$? 
echo "the status of mf mq account newman test: " $status

npx kill-port 8080
