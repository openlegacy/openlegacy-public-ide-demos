package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_oracle_sdk.openlegacy.OpenAccount;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class OpenAccountTest extends AbstractRpcEntityTest<OpenAccount> {

    @Autowired
    public OpenAccountTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void openAccountTestUseCaseTest_1() {
        String openAccountTestInput = "mock/OpenAccountTest/test_openAccountTest_usecase_1.input.json";
        String openAccountTestOutput = "mock/OpenAccountTest/test_openAccountTest_usecase_1.output.json";
        super.baseTest(openAccountTestInput, openAccountTestOutput, OpenAccount.class);
    }

//    @Test
    public void openAccountTestUseCaseTest_2() {
        String openAccountTestInput = "mock/OpenAccountTest/test_openAccountTest_usecase_2.input.json";
        String openAccountTestOutput = "mock/OpenAccountTest/test_openAccountTest_usecase_2.output.json";
        super.baseTest(openAccountTestInput, openAccountTestOutput, OpenAccount.class);
    }
}
