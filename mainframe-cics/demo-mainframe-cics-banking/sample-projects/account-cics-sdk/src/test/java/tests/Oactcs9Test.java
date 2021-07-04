package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_cics_sdk.openlegacy.Oactcs9;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Oactcs9Test extends AbstractRpcEntityTest<Oactcs9> {

    @Autowired
    public Oactcs9Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void oactcs9TestUseCaseTest_1() {
        String oactcs9TestInput = "mock/Oactcs9Test/test_oactcs9Test_usecase_1.input.json";
        String oactcs9TestOutput = "mock/Oactcs9Test/test_oactcs9Test_usecase_1.output.json";
        super.baseTest(oactcs9TestInput, oactcs9TestOutput, Oactcs9.class);
    }

//    @Test
    public void oactcs9TestUseCaseTest_2() {
        String oactcs9TestInput = "mock/Oactcs9Test/test_oactcs9Test_usecase_2.input.json";
        String oactcs9TestOutput = "mock/Oactcs9Test/test_oactcs9Test_usecase_2.output.json";
        super.baseTest(oactcs9TestInput, oactcs9TestOutput, Oactcs9.class);
    }
}
