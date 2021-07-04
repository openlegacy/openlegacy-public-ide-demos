package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_ims_sdk.openlegacy.Lactim8;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Lactim8Test extends AbstractRpcEntityTest<Lactim8> {

    @Autowired
    public Lactim8Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void lactim8TestUseCaseTest_1() {
        String lactim8TestInput = "mock/Lactim8Test/test_lactim8Test_usecase_1.input.json";
        String lactim8TestOutput = "mock/Lactim8Test/test_lactim8Test_usecase_1.output.json";
        super.baseTest(lactim8TestInput, lactim8TestOutput, Lactim8.class);
    }

//    @Test
    public void lactim8TestUseCaseTest_2() {
        String lactim8TestInput = "mock/Lactim8Test/test_lactim8Test_usecase_2.input.json";
        String lactim8TestOutput = "mock/Lactim8Test/test_lactim8Test_usecase_2.output.json";
        super.baseTest(lactim8TestInput, lactim8TestOutput, Lactim8.class);
    }
}
