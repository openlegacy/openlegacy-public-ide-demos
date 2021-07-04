package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_cics_sdk.openlegacy.Ractcs9;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Ractcs9Test extends AbstractRpcEntityTest<Ractcs9> {

    @Autowired
    public Ractcs9Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void ractcs9TestUseCaseTest_1() {
        String ractcs9TestInput = "mock/Ractcs9Test/test_ractcs9Test_usecase_1.input.json";
        String ractcs9TestOutput = "mock/Ractcs9Test/test_ractcs9Test_usecase_1.output.json";
        super.baseTest(ractcs9TestInput, ractcs9TestOutput, Ractcs9.class);
    }

//    @Test
    public void ractcs9TestUseCaseTest_2() {
        String ractcs9TestInput = "mock/Ractcs9Test/test_ractcs9Test_usecase_2.input.json";
        String ractcs9TestOutput = "mock/Ractcs9Test/test_ractcs9Test_usecase_2.output.json";
        super.baseTest(ractcs9TestInput, ractcs9TestOutput, Ractcs9.class);
    }
}
