package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_as400_cobol_sdk.openlegacy.POL2UPD;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class POL2UPDTest extends AbstractRpcEntityTest<POL2UPD> {

    @Autowired
    public POL2UPDTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void pOL2UPDTestUseCaseTest_1() {
        String pOL2UPDTestInput = "mock/POL2UPDTest/test_pOL2UPDTest_usecase_1.input.json";
        String pOL2UPDTestOutput = "mock/POL2UPDTest/test_pOL2UPDTest_usecase_1.output.json";
        super.baseTest(pOL2UPDTestInput, pOL2UPDTestOutput, POL2UPD.class);
    }

//    @Test
    public void pOL2UPDTestUseCaseTest_2() {
        String pOL2UPDTestInput = "mock/POL2UPDTest/test_pOL2UPDTest_usecase_2.input.json";
        String pOL2UPDTestOutput = "mock/POL2UPDTest/test_pOL2UPDTest_usecase_2.output.json";
        super.baseTest(pOL2UPDTestInput, pOL2UPDTestOutput, POL2UPD.class);
    }
}
