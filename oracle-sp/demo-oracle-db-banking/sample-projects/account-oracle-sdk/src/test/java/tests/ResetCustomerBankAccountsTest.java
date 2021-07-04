package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_oracle_sdk.openlegacy.ResetCustomerBankAccounts;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ResetCustomerBankAccountsTest extends AbstractRpcEntityTest<ResetCustomerBankAccounts> {

    @Autowired
    public ResetCustomerBankAccountsTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void resetCustomerBankAccountsTestUseCaseTest_1() {
        String resetCustomerBankAccountsTestInput = "mock/ResetCustomerBankAccountsTest/test_resetCustomerBankAccountsTest_usecase_1.input.json";
        String resetCustomerBankAccountsTestOutput = "mock/ResetCustomerBankAccountsTest/test_resetCustomerBankAccountsTest_usecase_1.output.json";
        super.baseTest(resetCustomerBankAccountsTestInput, resetCustomerBankAccountsTestOutput, ResetCustomerBankAccounts.class);
    }

    @Test
    public void resetCustomerBankAccountsTestUseCaseTest_2() {
        String resetCustomerBankAccountsTestInput = "mock/ResetCustomerBankAccountsTest/test_resetCustomerBankAccountsTest_usecase_2.input.json";
        String resetCustomerBankAccountsTestOutput = "mock/ResetCustomerBankAccountsTest/test_resetCustomerBankAccountsTest_usecase_2.output.json";
        super.baseTest(resetCustomerBankAccountsTestInput, resetCustomerBankAccountsTestOutput, ResetCustomerBankAccounts.class);
    }
}
