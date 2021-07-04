package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_as400_pcml_sdk.openlegacy.Oactcs6X;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Oactcs6XTest extends AbstractRpcEntityTest<Oactcs6X> {

    @Autowired
    public Oactcs6XTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void oactcs6XTestUseCaseTest_1() {
        String oactcs6XTestInput = "mock/Oactcs6XTest/test_oactcs6XTest_usecase_1.input.json";
        String oactcs6XTestOutput = "mock/Oactcs6XTest/test_oactcs6XTest_usecase_1.output.json";
        super.baseTest(oactcs6XTestInput, oactcs6XTestOutput, Oactcs6X.class);
    }

//    @Test
    public void oactcs6XTestUseCaseTest_2() {
        String oactcs6XTestInput = "mock/Oactcs6XTest/test_oactcs6XTest_usecase_2.input.json";
        String oactcs6XTestOutput = "mock/Oactcs6XTest/test_oactcs6XTest_usecase_2.output.json";
        super.baseTest(oactcs6XTestInput, oactcs6XTestOutput, Oactcs6X.class);
    }
}
