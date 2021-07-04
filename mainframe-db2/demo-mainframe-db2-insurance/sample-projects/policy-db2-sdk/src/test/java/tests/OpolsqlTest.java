package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_db2_sdk.openlegacy.Opolsql;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class OpolsqlTest extends AbstractRpcEntityTest<Opolsql> {

    @Autowired
    public OpolsqlTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void opolsqlTestUseCaseTest_1() {
        String opolsqlTestInput = "mock/OpolsqlTest/test_opolsqlTest_usecase_1.input.json";
        String opolsqlTestOutput = "mock/OpolsqlTest/test_opolsqlTest_usecase_1.output.json";
        super.baseTest(opolsqlTestInput, opolsqlTestOutput, Opolsql.class);
    }

//    @Test
    public void opolsqlTestUseCaseTest_2() {
        String opolsqlTestInput = "mock/OpolsqlTest/test_opolsqlTest_usecase_2.input.json";
        String opolsqlTestOutput = "mock/OpolsqlTest/test_opolsqlTest_usecase_2.output.json";
        super.baseTest(opolsqlTestInput, opolsqlTestOutput, Opolsql.class);
    }
}
