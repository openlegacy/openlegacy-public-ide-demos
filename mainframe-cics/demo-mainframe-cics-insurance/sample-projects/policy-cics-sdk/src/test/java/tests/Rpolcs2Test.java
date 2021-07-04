package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_cics_sdk.openlegacy.Rpolcs2;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Rpolcs2Test extends AbstractRpcEntityTest<Rpolcs2> {

    @Autowired
    public Rpolcs2Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void rpolcs2TestUseCaseTest_1() {
        String rpolcs2TestInput = "mock/Rpolcs2Test/test_rpolcs2Test_usecase_1.input.json";
        String rpolcs2TestOutput = "mock/Rpolcs2Test/test_rpolcs2Test_usecase_1.output.json";
        super.baseTest(rpolcs2TestInput, rpolcs2TestOutput, Rpolcs2.class);
    }

//    @Test
    public void rpolcs2TestUseCaseTest_2() {
        String rpolcs2TestInput = "mock/Rpolcs2Test/test_rpolcs2Test_usecase_2.input.json";
        String rpolcs2TestOutput = "mock/Rpolcs2Test/test_rpolcs2Test_usecase_2.output.json";
        super.baseTest(rpolcs2TestInput, rpolcs2TestOutput, Rpolcs2.class);
    }
}
