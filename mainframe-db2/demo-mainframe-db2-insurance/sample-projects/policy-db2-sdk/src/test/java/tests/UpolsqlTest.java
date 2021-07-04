package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_db2_sdk.openlegacy.Upolsql;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UpolsqlTest extends AbstractRpcEntityTest<Upolsql> {

    @Autowired
    public UpolsqlTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void upolsqlTestUseCaseTest_1() {
        String upolsqlTestInput = "mock/UpolsqlTest/test_upolsqlTest_usecase_1.input.json";
        String upolsqlTestOutput = "mock/UpolsqlTest/test_upolsqlTest_usecase_1.output.json";
        super.baseTest(upolsqlTestInput, upolsqlTestOutput, Upolsql.class);
    }

//    @Test
    public void upolsqlTestUseCaseTest_2() {
        String upolsqlTestInput = "mock/UpolsqlTest/test_upolsqlTest_usecase_2.input.json";
        String upolsqlTestOutput = "mock/UpolsqlTest/test_upolsqlTest_usecase_2.output.json";
        super.baseTest(upolsqlTestInput, upolsqlTestOutput, Upolsql.class);
    }
}
