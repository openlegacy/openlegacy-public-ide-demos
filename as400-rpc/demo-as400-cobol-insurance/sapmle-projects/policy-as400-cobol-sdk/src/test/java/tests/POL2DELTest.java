package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_as400_cobol_sdk.openlegacy.POL2DEL;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class POL2DELTest extends AbstractRpcEntityTest<POL2DEL> {

    @Autowired
    public POL2DELTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void pOL2DELTestUseCaseTest_1() {
        String pOL2DELTestInput = "mock/POL2DELTest/test_pOL2DELTest_usecase_1.input.json";
        String pOL2DELTestOutput = "mock/POL2DELTest/test_pOL2DELTest_usecase_1.output.json";
        super.baseTest(pOL2DELTestInput, pOL2DELTestOutput, POL2DEL.class);
    }

//    @Test
    public void pOL2DELTestUseCaseTest_2() {
        String pOL2DELTestInput = "mock/POL2DELTest/test_pOL2DELTest_usecase_2.input.json";
        String pOL2DELTestOutput = "mock/POL2DELTest/test_pOL2DELTest_usecase_2.output.json";
        super.baseTest(pOL2DELTestInput, pOL2DELTestOutput, POL2DEL.class);
    }
}
