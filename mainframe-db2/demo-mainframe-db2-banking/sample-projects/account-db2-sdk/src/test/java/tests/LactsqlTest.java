package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_db2_sdk.openlegacy.Lactsql;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class LactsqlTest extends AbstractRpcEntityTest<Lactsql> {

    @Autowired
    public LactsqlTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void lactsqlTestUseCaseTest_1() {
        String lactsqlTestInput = "mock/LactsqlTest/test_lactsqlTest_usecase_1.input.json";
        String lactsqlTestOutput = "mock/LactsqlTest/test_lactsqlTest_usecase_1.output.json";
        super.baseTest(lactsqlTestInput, lactsqlTestOutput, Lactsql.class);
    }

//    @Test
    public void lactsqlTestUseCaseTest_2() {
        String lactsqlTestInput = "mock/LactsqlTest/test_lactsqlTest_usecase_2.input.json";
        String lactsqlTestOutput = "mock/LactsqlTest/test_lactsqlTest_usecase_2.output.json";
        super.baseTest(lactsqlTestInput, lactsqlTestOutput, Lactsql.class);
    }
}
