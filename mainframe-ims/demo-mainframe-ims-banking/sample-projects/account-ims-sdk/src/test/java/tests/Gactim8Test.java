package tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_ims_sdk.openlegacy.Gactim8;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Gactim8Test extends AbstractRpcEntityTest<Gactim8> {

    @Autowired
    public Gactim8Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void gactim8TestUseCaseTest_1() {
        String gactim8TestInput = "mock/Gactim8Test/test_gactim8Test_usecase_1.input.json";
        String gactim8TestOutput = "mock/Gactim8Test/test_gactim8Test_usecase_1.output.json";
        List<String> ignore = new  ArrayList<>();
        ignore.add("actoIban");
        super.baseTest(gactim8TestInput, gactim8TestOutput, Gactim8.class, ignore);
    }

//    @Test
    public void gactim8TestUseCaseTest_2() {
        String gactim8TestInput = "mock/Gactim8Test/test_gactim8Test_usecase_2.input.json";
        String gactim8TestOutput = "mock/Gactim8Test/test_gactim8Test_usecase_2.output.json";
        super.baseTest(gactim8TestInput, gactim8TestOutput, Gactim8.class);
    }
}
