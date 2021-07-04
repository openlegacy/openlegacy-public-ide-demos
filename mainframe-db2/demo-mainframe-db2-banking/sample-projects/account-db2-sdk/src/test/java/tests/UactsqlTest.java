package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_db2_sdk.openlegacy.Uactsql;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UactsqlTest extends AbstractRpcEntityTest<Uactsql> {

    @Autowired
    public UactsqlTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void uactsqlTestUseCaseTest_1() {
        String uactsqlTestInput = "mock/UactsqlTest/test_uactsqlTest_usecase_1.input.json";
        String uactsqlTestOutput = "mock/UactsqlTest/test_uactsqlTest_usecase_1.output.json";
        super.baseTest(uactsqlTestInput, uactsqlTestOutput, Uactsql.class);
    }

//    @Test
    public void uactsqlTestUseCaseTest_2() {
        String uactsqlTestInput = "mock/UactsqlTest/test_uactsqlTest_usecase_2.input.json";
        String uactsqlTestOutput = "mock/UactsqlTest/test_uactsqlTest_usecase_2.output.json";
        super.baseTest(uactsqlTestInput, uactsqlTestOutput, Uactsql.class);
    }
}
