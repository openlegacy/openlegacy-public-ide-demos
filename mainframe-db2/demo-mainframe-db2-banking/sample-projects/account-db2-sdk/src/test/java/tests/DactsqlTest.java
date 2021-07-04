package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_db2_sdk.openlegacy.Dactsql;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DactsqlTest extends AbstractRpcEntityTest<Dactsql> {

    @Autowired
    public DactsqlTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void dactsqlTestUseCaseTest_1() {
        String dactsqlTestInput = "mock/DactsqlTest/test_dactsqlTest_usecase_1.input.json";
        String dactsqlTestOutput = "mock/DactsqlTest/test_dactsqlTest_usecase_1.output.json";
        super.baseTest(dactsqlTestInput, dactsqlTestOutput, Dactsql.class);
    }

//    @Test
    public void dactsqlTestUseCaseTest_2() {
        String dactsqlTestInput = "mock/DactsqlTest/test_dactsqlTest_usecase_2.input.json";
        String dactsqlTestOutput = "mock/DactsqlTest/test_dactsqlTest_usecase_2.output.json";
        super.baseTest(dactsqlTestInput, dactsqlTestOutput, Dactsql.class);
    }
}
