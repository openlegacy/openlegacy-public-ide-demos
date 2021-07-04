echo "running insurance as400 cobol test-api script"

echo $PWD

ls -l

main_path=$PWD
project_path=as400-rpc/demo-insurance-as400-cobol

cd $project_path/sample-projects/policy-as400-cobol-sdk
mvn -s $main_path/settings.xml clean install -DskipTests
echo "finished sdk run"
cd $main_path/$project_path/sample-projects/policy-as400-cobol-rpc-api
mvn -s $main_path/settings.xml clean spring-boot:run -DskipTests > $main_path/$project_path/e2eLogs.txt 2>&1 &
sleep 30
echo "finished api run"
newman run $main_path/$project_path/automation-tests/api-test/policy-as400-cobol-api.postman_collection.json
status=$? 
echo "the status of as400 cobol insurance newman test: " $status

# npx kill-port 8080


# echo "status code is: "$status
# if [ $status -eq "1" ] ; then
#     echo "Test failure, doing exit 1 now !"
#     exit 1
# else
# 	echo "All tests succeeded doing exit 0 now !"
# 	exit 0
# fi

