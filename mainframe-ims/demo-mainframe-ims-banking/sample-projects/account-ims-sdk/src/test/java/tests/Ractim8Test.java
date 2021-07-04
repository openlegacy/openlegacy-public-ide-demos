package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_ims_sdk.openlegacy.Ractim8;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Ractim8Test extends AbstractRpcEntityTest<Ractim8> {

    @Autowired
    public Ractim8Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void ractim8TestUseCaseTest_1() {
        String ractim8TestInput = "mock/Ractim8Test/test_ractim8Test_usecase_1.input.json";
        String ractim8TestOutput = "mock/Ractim8Test/test_ractim8Test_usecase_1.output.json";
        super.baseTest(ractim8TestInput, ractim8TestOutput, Ractim8.class);
    }

//    @Test
    public void ractim8TestUseCaseTest_2() {
        String ractim8TestInput = "mock/Ractim8Test/test_ractim8Test_usecase_2.input.json";
        String ractim8TestOutput = "mock/Ractim8Test/test_ractim8Test_usecase_2.output.json";
        super.baseTest(ractim8TestInput, ractim8TestOutput, Ractim8.class);
    }
}
