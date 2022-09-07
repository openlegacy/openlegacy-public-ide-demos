echo "running mf screens test-api script"

main_path=$PWD
project_path=mainframe-screens/demo-mf-screens

cd $main_path/$project_path/sample-projects/mf-screens-sdk
mvn -s $main_path/settings.xml clean install -DskipTests 
echo "finished sdk run"
cd $main_path/$project_path/sample-projects/mf-screens-api
mvn -s $main_path/settings.xml clean spring-boot:run -DskipTests > $main_path/$project_path/e2eLogs.txt 2>&1 &
# sleep 30
timeout 120 sh -c 'until nc -z $0 $1; do sleep 1; done' localhost 8080
echo "finished api run"
newman run $main_path/$project_path/automation-tests/api-test/MF-Screens.postman_collection.json -e $main_path/$project_path/automation-tests/api-test/mf-screens.postman_environment.json
status=$? 
echo "the status of mf screens newman test: " $status

npx kill-port 8080
