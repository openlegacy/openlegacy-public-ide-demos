package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_oracle_sdk.openlegacy.DeleteAccount;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DeleteAccountTest extends AbstractRpcEntityTest<DeleteAccount> {

    @Autowired
    public DeleteAccountTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void deleteAccountTestUseCaseTest_1() {
        String deleteAccountTestInput = "mock/DeleteAccountTest/test_deleteAccountTest_usecase_1.input.json";
        String deleteAccountTestOutput = "mock/DeleteAccountTest/test_deleteAccountTest_usecase_1.output.json";
        super.baseTest(deleteAccountTestInput, deleteAccountTestOutput, DeleteAccount.class);
    }

//    @Test
    public void deleteAccountTestUseCaseTest_2() {
        String deleteAccountTestInput = "mock/DeleteAccountTest/test_deleteAccountTest_usecase_2.input.json";
        String deleteAccountTestOutput = "mock/DeleteAccountTest/test_deleteAccountTest_usecase_2.output.json";
        super.baseTest(deleteAccountTestInput, deleteAccountTestOutput, DeleteAccount.class);
    }
}
