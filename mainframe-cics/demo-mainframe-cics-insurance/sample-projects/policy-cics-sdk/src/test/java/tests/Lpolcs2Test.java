package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_cics_sdk.openlegacy.Lpolcs2;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Lpolcs2Test extends AbstractRpcEntityTest<Lpolcs2> {

    @Autowired
    public Lpolcs2Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void lpolcs2TestUseCaseTest_1() {
        String lpolcs2TestInput = "mock/Lpolcs2Test/test_lpolcs2Test_usecase_1.input.json";
        String lpolcs2TestOutput = "mock/Lpolcs2Test/test_lpolcs2Test_usecase_1.output.json";
        super.baseTest(lpolcs2TestInput, lpolcs2TestOutput, Lpolcs2.class);
    }

//    @Test
    public void lpolcs2TestUseCaseTest_2() {
        String lpolcs2TestInput = "mock/Lpolcs2Test/test_lpolcs2Test_usecase_2.input.json";
        String lpolcs2TestOutput = "mock/Lpolcs2Test/test_lpolcs2Test_usecase_2.output.json";
        super.baseTest(lpolcs2TestInput, lpolcs2TestOutput, Lpolcs2.class);
    }
}
