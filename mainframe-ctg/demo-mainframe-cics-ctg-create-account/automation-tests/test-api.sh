newman run Mainframe-CICS-TG-Create-Account.postman_collection.json -e mainframe-ctg-create-account.postman_environment.json
# newman run Mainframe-CICS-TG.postman_collection.json -e mainframe-cics-tg.postman_environment.json
echo "running mf cics ctg account test-api script"

main_path=$PWD
project_path=mainframe-ctg/demo-mainframe-cics-ctg-create-account

cd $main_path/$project_path/sample-projects/mainframe-ctg-sdk
mvn -s $main_path/settings.xml clean install -DskipTests 
echo "finished sdk run"
cd $main_path/$project_path/sample-projects/mainframe-ctg-api
mvn -s $main_path/settings.xml clean spring-boot:run -DskipTests > $main_path/$project_path/e2eLogs.txt 2>&1 &
# sleep 30
timeout 120 sh -c 'until nc -z $0 $1; do sleep 1; done' localhost 8080
echo "finished api run"
newman run $main_path/$project_path/automation-tests/api-test/Mainframe-CICS-TG-Create-Account.postman_collection.json -e $main_path/$project_path/automation-tests/api-test/mainframe-ctg-create-account.postman_environment.json
status=$? 
echo "the status of mf cics ctg account newman test: " $status

npx kill-port 8080
