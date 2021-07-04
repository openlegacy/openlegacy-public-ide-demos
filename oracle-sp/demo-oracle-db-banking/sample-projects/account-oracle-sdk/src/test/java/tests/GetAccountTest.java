package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_oracle_sdk.openlegacy.GetAccount;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GetAccountTest extends AbstractRpcEntityTest<GetAccount> {

    @Autowired
    public GetAccountTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void getAccountTestUseCaseTest_1() {
        String getAccountTestInput = "mock/GetAccountTest/test_getAccountTest_usecase_1.input.json";
        String getAccountTestOutput = "mock/GetAccountTest/test_getAccountTest_usecase_1.output.json";
        super.baseTest(getAccountTestInput, getAccountTestOutput, GetAccount.class);
    }

//    @Test
    public void getAccountTestUseCaseTest_2() {
        String getAccountTestInput = "mock/GetAccountTest/test_getAccountTest_usecase_2.input.json";
        String getAccountTestOutput = "mock/GetAccountTest/test_getAccountTest_usecase_2.output.json";
        super.baseTest(getAccountTestInput, getAccountTestOutput, GetAccount.class);
    }
}
