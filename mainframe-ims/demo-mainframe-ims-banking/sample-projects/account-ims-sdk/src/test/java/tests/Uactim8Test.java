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

import com.account_ims_sdk.openlegacy.Uactim8;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Uactim8Test extends AbstractRpcEntityTest<Uactim8> {

    @Autowired
    public Uactim8Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void uactim8TestUseCaseTest_1() {
        String uactim8TestInput = "mock/Uactim8Test/test_uactim8Test_usecase_1.input.json";
        String uactim8TestOutput = "mock/Uactim8Test/test_uactim8Test_usecase_1.output.json";
        List<String> ignore = new  ArrayList<>();
        ignore.add("actoIban");
        super.baseTest(uactim8TestInput, uactim8TestOutput, Uactim8.class, ignore);
    }

//    @Test
    public void uactim8TestUseCaseTest_2() {
        String uactim8TestInput = "mock/Uactim8Test/test_uactim8Test_usecase_2.input.json";
        String uactim8TestOutput = "mock/Uactim8Test/test_uactim8Test_usecase_2.output.json";
        super.baseTest(uactim8TestInput, uactim8TestOutput, Uactim8.class);
    }
}
