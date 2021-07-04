package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.policy_cics_sdk.openlegacy.Opolcs2;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Opolcs2Test extends AbstractRpcEntityTest<Opolcs2> {

    @Autowired
    public Opolcs2Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void opolcs2TestUseCaseTest_1() {
        String opolcs2TestInput = "mock/Opolcs2Test/test_opolcs2Test_usecase_1.input.json";
        String opolcs2TestOutput = "mock/Opolcs2Test/test_opolcs2Test_usecase_1.output.json";
        super.baseTest(opolcs2TestInput, opolcs2TestOutput, Opolcs2.class);
    }

//    @Test
    public void opolcs2TestUseCaseTest_2() {
        String opolcs2TestInput = "mock/Opolcs2Test/test_opolcs2Test_usecase_2.input.json";
        String opolcs2TestOutput = "mock/Opolcs2Test/test_opolcs2Test_usecase_2.output.json";
        super.baseTest(opolcs2TestInput, opolcs2TestOutput, Opolcs2.class);
    }
}
