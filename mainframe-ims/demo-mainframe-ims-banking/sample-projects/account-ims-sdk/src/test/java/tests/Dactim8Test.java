package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_ims_sdk.openlegacy.Dactim8;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Dactim8Test extends AbstractRpcEntityTest<Dactim8> {

    @Autowired
    public Dactim8Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void dactim8TestUseCaseTest_1() {
        String dactim8TestInput = "mock/Dactim8Test/test_dactim8Test_usecase_1.input.json";
        String dactim8TestOutput = "mock/Dactim8Test/test_dactim8Test_usecase_1.output.json";
        super.baseTest(dactim8TestInput, dactim8TestOutput, Dactim8.class);
    }

//    @Test
    public void dactim8TestUseCaseTest_2() {
        String dactim8TestInput = "mock/Dactim8Test/test_dactim8Test_usecase_2.input.json";
        String dactim8TestOutput = "mock/Dactim8Test/test_dactim8Test_usecase_2.output.json";
        super.baseTest(dactim8TestInput, dactim8TestOutput, Dactim8.class);
    }
}
