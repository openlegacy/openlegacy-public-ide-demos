package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_as400_cobol_sdk.openlegacy.POL2ADD;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class POL2ADDTest extends AbstractRpcEntityTest<POL2ADD> {

    @Autowired
    public POL2ADDTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void pOL2ADDTestUseCaseTest_1() {
        String pOL2ADDTestInput = "mock/POL2ADDTest/test_pOL2ADDTest_usecase_1.input.json";
        String pOL2ADDTestOutput = "mock/POL2ADDTest/test_pOL2ADDTest_usecase_1.output.json";
        super.baseTest(pOL2ADDTestInput, pOL2ADDTestOutput, POL2ADD.class);
    }

//    @Test
    public void pOL2ADDTestUseCaseTest_2() {
        String pOL2ADDTestInput = "mock/POL2ADDTest/test_pOL2ADDTest_usecase_2.input.json";
        String pOL2ADDTestOutput = "mock/POL2ADDTest/test_pOL2ADDTest_usecase_2.output.json";
        super.baseTest(pOL2ADDTestInput, pOL2ADDTestOutput, POL2ADD.class);
    }
}
