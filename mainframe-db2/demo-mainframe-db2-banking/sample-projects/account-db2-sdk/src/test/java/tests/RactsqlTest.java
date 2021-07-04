package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.account_db2_sdk.openlegacy.Ractsql;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class RactsqlTest extends AbstractRpcEntityTest<Ractsql> {

    @Autowired
    public RactsqlTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void ractsqlTestUseCaseTest_1() {
        String ractsqlTestInput = "mock/RactsqlTest/test_ractsqlTest_usecase_1.input.json";
        String ractsqlTestOutput = "mock/RactsqlTest/test_ractsqlTest_usecase_1.output.json";
        super.baseTest(ractsqlTestInput, ractsqlTestOutput, Ractsql.class);
    }

//    @Test
    public void ractsqlTestUseCaseTest_2() {
        String ractsqlTestInput = "mock/RactsqlTest/test_ractsqlTest_usecase_2.input.json";
        String ractsqlTestOutput = "mock/RactsqlTest/test_ractsqlTest_usecase_2.output.json";
        super.baseTest(ractsqlTestInput, ractsqlTestOutput, Ractsql.class);
    }
}
