package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_db2_sdk.openlegacy.Oactsql;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class OactsqlTest extends AbstractRpcEntityTest<Oactsql> {

    @Autowired
    public OactsqlTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void oactsqlTestUseCaseTest_1() {
        String oactsqlTestInput = "mock/OactsqlTest/test_oactsqlTest_usecase_1.input.json";
        String oactsqlTestOutput = "mock/OactsqlTest/test_oactsqlTest_usecase_1.output.json";
        super.baseTest(oactsqlTestInput, oactsqlTestOutput, Oactsql.class);
    }

//    @Test
    public void oactsqlTestUseCaseTest_2() {
        String oactsqlTestInput = "mock/OactsqlTest/test_oactsqlTest_usecase_2.input.json";
        String oactsqlTestOutput = "mock/OactsqlTest/test_oactsqlTest_usecase_2.output.json";
        super.baseTest(oactsqlTestInput, oactsqlTestOutput, Oactsql.class);
    }
}
