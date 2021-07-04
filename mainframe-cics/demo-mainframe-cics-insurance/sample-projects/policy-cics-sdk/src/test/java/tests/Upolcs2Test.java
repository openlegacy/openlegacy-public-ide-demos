package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_cics_sdk.openlegacy.Upolcs2;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Upolcs2Test extends AbstractRpcEntityTest<Upolcs2> {

    @Autowired
    public Upolcs2Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void upolcs2TestUseCaseTest_1() {
        String upolcs2TestInput = "mock/Upolcs2Test/test_upolcs2Test_usecase_1.input.json";
        String upolcs2TestOutput = "mock/Upolcs2Test/test_upolcs2Test_usecase_1.output.json";
        super.baseTest(upolcs2TestInput, upolcs2TestOutput, Upolcs2.class);
    }

//    @Test
    public void upolcs2TestUseCaseTest_2() {
        String upolcs2TestInput = "mock/Upolcs2Test/test_upolcs2Test_usecase_2.input.json";
        String upolcs2TestOutput = "mock/Upolcs2Test/test_upolcs2Test_usecase_2.output.json";
        super.baseTest(upolcs2TestInput, upolcs2TestOutput, Upolcs2.class);
    }
}
