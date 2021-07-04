package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_as400_pcml_sdk.openlegacy.Gactcs6X;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Gactcs6XTest extends AbstractRpcEntityTest<Gactcs6X> {

    @Autowired
    public Gactcs6XTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void gactcs6XTestUseCaseTest_1() {
        String gactcs6XTestInput = "mock/Gactcs6XTest/test_gactcs6XTest_usecase_1.input.json";
        String gactcs6XTestOutput = "mock/Gactcs6XTest/test_gactcs6XTest_usecase_1.output.json";
        super.baseTest(gactcs6XTestInput, gactcs6XTestOutput, Gactcs6X.class);
    }

//    @Test
    public void gactcs6XTestUseCaseTest_2() {
        String gactcs6XTestInput = "mock/Gactcs6XTest/test_gactcs6XTest_usecase_2.input.json";
        String gactcs6XTestOutput = "mock/Gactcs6XTest/test_gactcs6XTest_usecase_2.output.json";
        super.baseTest(gactcs6XTestInput, gactcs6XTestOutput, Gactcs6X.class);
    }
}
