package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_as400_cobol_sdk.openlegacy.POL2OUTL;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class POL2OUTLTest extends AbstractRpcEntityTest<POL2OUTL> {

    @Autowired
    public POL2OUTLTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void pOL2OUTLTestUseCaseTest_1() {
        String pOL2OUTLTestInput = "mock/POL2OUTLTest/test_pOL2OUTLTest_usecase_1.input.json";
        String pOL2OUTLTestOutput = "mock/POL2OUTLTest/test_pOL2OUTLTest_usecase_1.output.json";
        super.baseTest(pOL2OUTLTestInput, pOL2OUTLTestOutput, POL2OUTL.class);
    }

//    @Test
    public void pOL2OUTLTestUseCaseTest_2() {
        String pOL2OUTLTestInput = "mock/POL2OUTLTest/test_pOL2OUTLTest_usecase_2.input.json";
        String pOL2OUTLTestOutput = "mock/POL2OUTLTest/test_pOL2OUTLTest_usecase_2.output.json";
        super.baseTest(pOL2OUTLTestInput, pOL2OUTLTestOutput, POL2OUTL.class);
    }
}
