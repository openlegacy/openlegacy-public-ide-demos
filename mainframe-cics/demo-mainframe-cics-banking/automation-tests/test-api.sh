echo "running account banking test-api script"

main_path=$PWD
project_path=mainframe-cics/demo-mainframe-cics-banking

cd $main_path/$project_path/sample-projects/account-cics-sdk
mvn -s $main_path/settings.xml clean install -DskipTests 
echo "finished sdk run"
cd $main_path/$project_path/sample-projects/account-cics-api
mvn -s $main_path/settings.xml clean spring-boot:run -DskipTests > $main_path/$project_path/e2eLogs.txt 2>&1 &
# sleep 30
timeout 120 sh -c 'until nc -z $0 $1; do sleep 1; done' localhost 8080
echo "finished api run"
newman run $main_path/$project_path/automation-tests/api-test/account-cics-api.postman_collection.json
status=$? 
echo "the status of account banking newman: " $status

npx kill-port 8080
