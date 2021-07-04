package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_db2_sdk.openlegacy.Gactsql;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GactsqlTest extends AbstractRpcEntityTest<Gactsql> {

    @Autowired
    public GactsqlTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void gactsqlTestUseCaseTest_1() {
        String gactsqlTestInput = "mock/GactsqlTest/test_gactsqlTest_usecase_1.input.json";
        String gactsqlTestOutput = "mock/GactsqlTest/test_gactsqlTest_usecase_1.output.json";
        super.baseTest(gactsqlTestInput, gactsqlTestOutput, Gactsql.class);
    }

//    @Test
    public void gactsqlTestUseCaseTest_2() {
        String gactsqlTestInput = "mock/GactsqlTest/test_gactsqlTest_usecase_2.input.json";
        String gactsqlTestOutput = "mock/GactsqlTest/test_gactsqlTest_usecase_2.output.json";
        super.baseTest(gactsqlTestInput, gactsqlTestOutput, Gactsql.class);
    }
}
