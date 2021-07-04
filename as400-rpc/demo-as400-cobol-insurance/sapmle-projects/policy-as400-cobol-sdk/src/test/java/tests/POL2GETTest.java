package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_as400_cobol_sdk.openlegacy.POL2GET;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class POL2GETTest extends AbstractRpcEntityTest<POL2GET> {

    @Autowired
    public POL2GETTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void pOL2GETTestUseCaseTest_1() {
        String pOL2GETTestInput = "mock/POL2GETTest/test_pOL2GETTest_usecase_1.input.json";
        String pOL2GETTestOutput = "mock/POL2GETTest/test_pOL2GETTest_usecase_1.output.json";
        super.baseTest(pOL2GETTestInput, pOL2GETTestOutput, POL2GET.class);
    }

//    @Test
    public void pOL2GETTestUseCaseTest_2() {
        String pOL2GETTestInput = "mock/POL2GETTest/test_pOL2GETTest_usecase_2.input.json";
        String pOL2GETTestOutput = "mock/POL2GETTest/test_pOL2GETTest_usecase_2.output.json";
        super.baseTest(pOL2GETTestInput, pOL2GETTestOutput, POL2GET.class);
    }
}
