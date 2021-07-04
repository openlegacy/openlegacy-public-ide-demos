package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_db2_sdk.openlegacy.Rpolsql;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class RpolsqlTest extends AbstractRpcEntityTest<Rpolsql> {

    @Autowired
    public RpolsqlTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void rpolsqlTestUseCaseTest_1() {
        String rpolsqlTestInput = "mock/RpolsqlTest/test_rpolsqlTest_usecase_1.input.json";
        String rpolsqlTestOutput = "mock/RpolsqlTest/test_rpolsqlTest_usecase_1.output.json";
        super.baseTest(rpolsqlTestInput, rpolsqlTestOutput, Rpolsql.class);
    }

//    @Test
    public void rpolsqlTestUseCaseTest_2() {
        String rpolsqlTestInput = "mock/RpolsqlTest/test_rpolsqlTest_usecase_2.input.json";
        String rpolsqlTestOutput = "mock/RpolsqlTest/test_rpolsqlTest_usecase_2.output.json";
        super.baseTest(rpolsqlTestInput, rpolsqlTestOutput, Rpolsql.class);
    }
}
