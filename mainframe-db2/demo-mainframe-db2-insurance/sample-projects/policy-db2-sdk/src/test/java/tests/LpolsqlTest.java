package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_db2_sdk.openlegacy.Lpolsql;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class LpolsqlTest extends AbstractRpcEntityTest<Lpolsql> {

    @Autowired
    public LpolsqlTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void lpolsqlTestUseCaseTest_1() {
        String lpolsqlTestInput = "mock/LpolsqlTest/test_lpolsqlTest_usecase_1.input.json";
        String lpolsqlTestOutput = "mock/LpolsqlTest/test_lpolsqlTest_usecase_1.output.json";
        super.baseTest(lpolsqlTestInput, lpolsqlTestOutput, Lpolsql.class);
    }

//    @Test
    public void lpolsqlTestUseCaseTest_2() {
        String lpolsqlTestInput = "mock/LpolsqlTest/test_lpolsqlTest_usecase_2.input.json";
        String lpolsqlTestOutput = "mock/LpolsqlTest/test_lpolsqlTest_usecase_2.output.json";
        super.baseTest(lpolsqlTestInput, lpolsqlTestOutput, Lpolsql.class);
    }
}
