package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_as400_pcml_sdk.openlegacy.Uactcs6X;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Uactcs6XTest extends AbstractRpcEntityTest<Uactcs6X> {

    @Autowired
    public Uactcs6XTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void uactcs6XTestUseCaseTest_1() {
        String uactcs6XTestInput = "mock/Uactcs6XTest/test_uactcs6XTest_usecase_1.input.json";
        String uactcs6XTestOutput = "mock/Uactcs6XTest/test_uactcs6XTest_usecase_1.output.json";
        super.baseTest(uactcs6XTestInput, uactcs6XTestOutput, Uactcs6X.class);
    }

//    @Test
    public void uactcs6XTestUseCaseTest_2() {
        String uactcs6XTestInput = "mock/Uactcs6XTest/test_uactcs6XTest_usecase_2.input.json";
        String uactcs6XTestOutput = "mock/Uactcs6XTest/test_uactcs6XTest_usecase_2.output.json";
        super.baseTest(uactcs6XTestInput, uactcs6XTestOutput, Uactcs6X.class);
    }
}
