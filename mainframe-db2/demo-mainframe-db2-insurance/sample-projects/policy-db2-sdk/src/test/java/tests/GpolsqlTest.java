package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_db2_sdk.openlegacy.Gpolsql;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GpolsqlTest extends AbstractRpcEntityTest<Gpolsql> {

    @Autowired
    public GpolsqlTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void gpolsqlTestUseCaseTest_1() {
        String gpolsqlTestInput = "mock/GpolsqlTest/test_gpolsqlTest_usecase_1.input.json";
        String gpolsqlTestOutput = "mock/GpolsqlTest/test_gpolsqlTest_usecase_1.output.json";
        super.baseTest(gpolsqlTestInput, gpolsqlTestOutput, Gpolsql.class);
    }

//    @Test
    public void gpolsqlTestUseCaseTest_2() {
        String gpolsqlTestInput = "mock/GpolsqlTest/test_gpolsqlTest_usecase_2.input.json";
        String gpolsqlTestOutput = "mock/GpolsqlTest/test_gpolsqlTest_usecase_2.output.json";
        super.baseTest(gpolsqlTestInput, gpolsqlTestOutput, Gpolsql.class);
    }
}
