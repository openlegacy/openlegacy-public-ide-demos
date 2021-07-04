package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_oracle_sdk.openlegacy.UpdateAccount;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UpdateAccountTest extends AbstractRpcEntityTest<UpdateAccount> {

    @Autowired
    public UpdateAccountTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void updateAccountTestUseCaseTest_1() {
        String updateAccountTestInput = "mock/UpdateAccountTest/test_updateAccountTest_usecase_1.input.json";
        String updateAccountTestOutput = "mock/UpdateAccountTest/test_updateAccountTest_usecase_1.output.json";
        super.baseTest(updateAccountTestInput, updateAccountTestOutput, UpdateAccount.class);
    }

//    @Test
    public void updateAccountTestUseCaseTest_2() {
        String updateAccountTestInput = "mock/UpdateAccountTest/test_updateAccountTest_usecase_2.input.json";
        String updateAccountTestOutput = "mock/UpdateAccountTest/test_updateAccountTest_usecase_2.output.json";
        super.baseTest(updateAccountTestInput, updateAccountTestOutput, UpdateAccount.class);
    }
}
