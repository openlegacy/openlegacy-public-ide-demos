package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_db2_sdk.openlegacy.Dpolsql;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DpolsqlTest extends AbstractRpcEntityTest<Dpolsql> {

    @Autowired
    public DpolsqlTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void dpolsqlTestUseCaseTest_1() {
        String dpolsqlTestInput = "mock/DpolsqlTest/test_dpolsqlTest_usecase_1.input.json";
        String dpolsqlTestOutput = "mock/DpolsqlTest/test_dpolsqlTest_usecase_1.output.json";
        super.baseTest(dpolsqlTestInput, dpolsqlTestOutput, Dpolsql.class);
    }

//    @Test
    public void dpolsqlTestUseCaseTest_2() {
        String dpolsqlTestInput = "mock/DpolsqlTest/test_dpolsqlTest_usecase_2.input.json";
        String dpolsqlTestOutput = "mock/DpolsqlTest/test_dpolsqlTest_usecase_2.output.json";
        super.baseTest(dpolsqlTestInput, dpolsqlTestOutput, Dpolsql.class);
    }
}
