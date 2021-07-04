package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_oracle_sdk.openlegacy.GetAllCustomerBankAccounts;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GetAllCustomerBankAccountsTest extends AbstractRpcEntityTest<GetAllCustomerBankAccounts> {

    @Autowired
    public GetAllCustomerBankAccountsTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void getAllCustomerBankAccountsTestUseCaseTest_1() {
        String getAllCustomerBankAccountsTestInput = "mock/GetAllCustomerBankAccountsTest/test_getAllCustomerBankAccountsTest_usecase_1.input.json";
        String getAllCustomerBankAccountsTestOutput = "mock/GetAllCustomerBankAccountsTest/test_getAllCustomerBankAccountsTest_usecase_1.output.json";
        super.baseTest(getAllCustomerBankAccountsTestInput, getAllCustomerBankAccountsTestOutput, GetAllCustomerBankAccounts.class);
    }

    @Test
    public void getAllCustomerBankAccountsTestUseCaseTest_2() {
        String getAllCustomerBankAccountsTestInput = "mock/GetAllCustomerBankAccountsTest/test_getAllCustomerBankAccountsTest_usecase_2.input.json";
        String getAllCustomerBankAccountsTestOutput = "mock/GetAllCustomerBankAccountsTest/test_getAllCustomerBankAccountsTest_usecase_2.output.json";
        super.baseTest(getAllCustomerBankAccountsTestInput, getAllCustomerBankAccountsTestOutput, GetAllCustomerBankAccounts.class);
    }
}
