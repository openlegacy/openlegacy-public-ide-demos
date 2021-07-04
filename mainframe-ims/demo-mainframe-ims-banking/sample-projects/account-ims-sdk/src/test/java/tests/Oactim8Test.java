package tests;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_ims_sdk.openlegacy.Oactim8;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Oactim8Test extends AbstractRpcEntityTest<Oactim8> {

  

	@Autowired
    public Oactim8Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void oactim8TestUseCaseTest_1() {
        String oactim8TestInput = "mock/Oactim8Test/test_oactim8Test_usecase_1.input.json";
        String oactim8TestOutput = "mock/Oactim8Test/test_oactim8Test_usecase_1.output.json";
        List<String> ignore = new  ArrayList<>();
        ignore.add("actoIban");
        super.baseTest(oactim8TestInput, oactim8TestOutput, Oactim8.class, ignore);
    }

//    @Test
    public void oactim8TestUseCaseTest_2() {
        String oactim8TestInput = "mock/Oactim8Test/test_oactim8Test_usecase_2.input.json";
        String oactim8TestOutput = "mock/Oactim8Test/test_oactim8Test_usecase_2.output.json";
        super.baseTest(oactim8TestInput, oactim8TestOutput, Oactim8.class);
    }
}
