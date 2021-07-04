package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_cics_sdk.openlegacy.Gactcs9;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Gactcs9Test extends AbstractRpcEntityTest<Gactcs9> {

    @Autowired
    public Gactcs9Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void gactcs9TestUseCaseTest_1() {
        String gactcs9TestInput = "mock/Gactcs9Test/test_gactcs9Test_usecase_1.input.json";
        String gactcs9TestOutput = "mock/Gactcs9Test/test_gactcs9Test_usecase_1.output.json";
        super.baseTest(gactcs9TestInput, gactcs9TestOutput, Gactcs9.class);
    }

//    @Test
    public void gactcs9TestUseCaseTest_2() {
        String gactcs9TestInput = "mock/Gactcs9Test/test_gactcs9Test_usecase_2.input.json";
        String gactcs9TestOutput = "mock/Gactcs9Test/test_gactcs9Test_usecase_2.output.json";
        super.baseTest(gactcs9TestInput, gactcs9TestOutput, Gactcs9.class);
    }
}
