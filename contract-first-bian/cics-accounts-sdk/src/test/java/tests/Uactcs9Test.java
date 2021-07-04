package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.cics_accounts_sdk.openlegacy.Uactcs9;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Uactcs9Test extends AbstractRpcEntityTest<Uactcs9> {

    @Autowired
    public Uactcs9Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void uactcs9TestUseCaseTest_1() {
        String uactcs9TestInput = "mock/Uactcs9Test/test_uactcs9Test_usecase_1.input.json";
        String uactcs9TestOutput = "mock/Uactcs9Test/test_uactcs9Test_usecase_1.output.json";
        super.baseTest(uactcs9TestInput, uactcs9TestOutput, Uactcs9.class);
    }

   // @Test
    public void uactcs9TestUseCaseTest_2() {
        String uactcs9TestInput = "mock/Uactcs9Test/test_uactcs9Test_usecase_2.input.json";
        String uactcs9TestOutput = "mock/Uactcs9Test/test_uactcs9Test_usecase_2.output.json";
        super.baseTest(uactcs9TestInput, uactcs9TestOutput, Uactcs9.class);
    }
}
