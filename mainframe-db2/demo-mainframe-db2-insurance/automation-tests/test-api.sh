echo "running db2 insurance test-api script"

main_path=$PWD
project_path=mainframe-db2/demo-mainframe-db2-insurance

cd $main_path/$project_path/sample-projects/policy-db2-sdk
mvn -s $main_path/settings.xml clean install -DskipTests 
echo "finished sdk run"
cd $main_path/$project_path/sample-projects/policy-db2-api
mvn -s $main_path/settings.xml clean spring-boot:run -DskipTests > $main_path/$project_path/e2eLogs.txt 2>&1 &
# sleep 30
timeout 120 sh -c 'until nc -z $0 $1; do sleep 1; done' localhost 8080
echo "finished api run"
newman run $main_path/$project_path/automation-tests/api-test/policy-db2-api.postman_collection.json
status=$? 
echo "the status of db2 insurance newman: " $status

npx kill-port 8080
