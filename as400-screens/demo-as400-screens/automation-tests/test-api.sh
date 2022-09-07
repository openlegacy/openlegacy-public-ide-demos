# newman run AS400-Screens.postman_collection.json -e as400-screens.postman_environment.json
echo "running as400 screen test-api script"

main_path=$PWD
project_path=as400-screens/demo-as400-screens

cd $main_path/$project_path/sample-projects/as400-5250-sdk
mvn -s $main_path/settings.xml clean install -DskipTests 
echo "finished sdk run"
cd $main_path/$project_path/sample-projects/as400-5250-api
mvn -s $main_path/settings.xml clean spring-boot:run -DskipTests > $main_path/$project_path/e2eLogs.txt 2>&1 &
# sleep 30
timeout 120 sh -c 'until nc -z $0 $1; do sleep 1; done' localhost 8080
echo "finished api run"
newman run $main_path/$project_path/automation-tests/api-test/AS400-Screens.postman_collection.json -e $main_path/$project_path/automation-tests/api-test/as400-screens.postman_environment.json
status=$? 
echo "the status of as400 screen newman test: " $status

npx kill-port 8080
