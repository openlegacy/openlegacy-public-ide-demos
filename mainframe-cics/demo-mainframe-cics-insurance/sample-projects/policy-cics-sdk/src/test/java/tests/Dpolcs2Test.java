package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_cics_sdk.openlegacy.Dpolcs2;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Dpolcs2Test extends AbstractRpcEntityTest<Dpolcs2> {

    @Autowired
    public Dpolcs2Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void dpolcs2TestUseCaseTest_1() {
        String dpolcs2TestInput = "mock/Dpolcs2Test/test_dpolcs2Test_usecase_1.input.json";
        String dpolcs2TestOutput = "mock/Dpolcs2Test/test_dpolcs2Test_usecase_1.output.json";
        super.baseTest(dpolcs2TestInput, dpolcs2TestOutput, Dpolcs2.class);
    }

//    @Test
    public void dpolcs2TestUseCaseTest_2() {
        String dpolcs2TestInput = "mock/Dpolcs2Test/test_dpolcs2Test_usecase_2.input.json";
        String dpolcs2TestOutput = "mock/Dpolcs2Test/test_dpolcs2Test_usecase_2.output.json";
        super.baseTest(dpolcs2TestInput, dpolcs2TestOutput, Dpolcs2.class);
    }
}
