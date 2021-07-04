package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.mainframe_mq_sdk.openlegacy.Opnact4;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Opnact4Test extends AbstractRpcEntityTest<Opnact4> {

    @Autowired
    public Opnact4Test(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void opnact4TestUseCaseTest_1() {
        String opnact4TestInput = "mock/Opnact4Test/test_opnact4Test_usecase_1.input.json";
        String opnact4TestOutput = "mock/Opnact4Test/test_opnact4Test_usecase_1.output.json";
        super.baseTest(opnact4TestInput, opnact4TestOutput, Opnact4.class);
    }

//    @Test
    public void opnact4TestUseCaseTest_2() {
        String opnact4TestInput = "mock/Opnact4Test/test_opnact4Test_usecase_2.input.json";
        String opnact4TestOutput = "mock/Opnact4Test/test_opnact4Test_usecase_2.output.json";
        super.baseTest(opnact4TestInput, opnact4TestOutput, Opnact4.class);
    }
}
