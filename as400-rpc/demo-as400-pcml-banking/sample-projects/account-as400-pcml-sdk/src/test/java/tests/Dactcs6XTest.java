package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_as400_pcml_sdk.openlegacy.Dactcs6X;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Dactcs6XTest extends AbstractRpcEntityTest<Dactcs6X> {

    @Autowired
    public Dactcs6XTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void dactcs6XTestUseCaseTest_1() {
        String dactcs6XTestInput = "mock/Dactcs6XTest/test_dactcs6XTest_usecase_1.input.json";
        String dactcs6XTestOutput = "mock/Dactcs6XTest/test_dactcs6XTest_usecase_1.output.json";
        super.baseTest(dactcs6XTestInput, dactcs6XTestOutput, Dactcs6X.class);
    }

//    @Test
    public void dactcs6XTestUseCaseTest_2() {
        String dactcs6XTestInput = "mock/Dactcs6XTest/test_dactcs6XTest_usecase_2.input.json";
        String dactcs6XTestOutput = "mock/Dactcs6XTest/test_dactcs6XTest_usecase_2.output.json";
        super.baseTest(dactcs6XTestInput, dactcs6XTestOutput, Dactcs6X.class);
    }
}
