package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.cics_accounts_sdk.openlegacy.Lactcs9;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Lactcs9Test extends AbstractRpcEntityTest<Lactcs9> {

    @Autowired
    public Lactcs9Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void lactcs9TestUseCaseTest_1() {
        String lactcs9TestInput = "mock/Lactcs9Test/test_lactcs9Test_usecase_1.input.json";
        String lactcs9TestOutput = "mock/Lactcs9Test/test_lactcs9Test_usecase_1.output.json";
        super.baseTest(lactcs9TestInput, lactcs9TestOutput, Lactcs9.class);
    }

    //@Test
    public void lactcs9TestUseCaseTest_2() {
        String lactcs9TestInput = "mock/Lactcs9Test/test_lactcs9Test_usecase_2.input.json";
        String lactcs9TestOutput = "mock/Lactcs9Test/test_lactcs9Test_usecase_2.output.json";
        super.baseTest(lactcs9TestInput, lactcs9TestOutput, Lactcs9.class);
    }
}
