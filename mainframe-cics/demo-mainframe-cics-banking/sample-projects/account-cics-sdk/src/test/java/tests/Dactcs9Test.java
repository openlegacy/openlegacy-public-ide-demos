package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_cics_sdk.openlegacy.Dactcs9;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Dactcs9Test extends AbstractRpcEntityTest<Dactcs9> {

    @Autowired
    public Dactcs9Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void dactcs9TestUseCaseTest_1() {
        String dactcs9TestInput = "mock/Dactcs9Test/test_dactcs9Test_usecase_1.input.json";
        String dactcs9TestOutput = "mock/Dactcs9Test/test_dactcs9Test_usecase_1.output.json";
        super.baseTest(dactcs9TestInput, dactcs9TestOutput, Dactcs9.class);
    }

//    @Test
    public void dactcs9TestUseCaseTest_2() {
        String dactcs9TestInput = "mock/Dactcs9Test/test_dactcs9Test_usecase_2.input.json";
        String dactcs9TestOutput = "mock/Dactcs9Test/test_dactcs9Test_usecase_2.output.json";
        super.baseTest(dactcs9TestInput, dactcs9TestOutput, Dactcs9.class);
    }
}
