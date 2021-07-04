package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_cics_sdk.openlegacy.Gpolcs2;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Gpolcs2Test extends AbstractRpcEntityTest<Gpolcs2> {

    @Autowired
    public Gpolcs2Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void gpolcs2TestUseCaseTest_1() {
        String gpolcs2TestInput = "mock/Gpolcs2Test/test_gpolcs2Test_usecase_1.input.json";
        String gpolcs2TestOutput = "mock/Gpolcs2Test/test_gpolcs2Test_usecase_1.output.json";
        super.baseTest(gpolcs2TestInput, gpolcs2TestOutput, Gpolcs2.class);
    }

//    @Test
    public void gpolcs2TestUseCaseTest_2() {
        String gpolcs2TestInput = "mock/Gpolcs2Test/test_gpolcs2Test_usecase_2.input.json";
        String gpolcs2TestOutput = "mock/Gpolcs2Test/test_gpolcs2Test_usecase_2.output.json";
        super.baseTest(gpolcs2TestInput, gpolcs2TestOutput, Gpolcs2.class);
    }
}
