package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.microsoft_sqlserver_sp_sdk.openlegacy.ProcGetAllExpiredCreditcards;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ProcGetAllExpiredCreditcardsTest extends AbstractRpcEntityTest<ProcGetAllExpiredCreditcards> {

    @Autowired
    public ProcGetAllExpiredCreditcardsTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void procGetAllExpiredCreditcardsTestUseCaseTest_1() {
        String procGetAllExpiredCreditcardsTestInput = "mock/ProcGetAllExpiredCreditcardsTest/test_procGetAllExpiredCreditcardsTest_usecase_1.input.json";
        String procGetAllExpiredCreditcardsTestOutput = "mock/ProcGetAllExpiredCreditcardsTest/test_procGetAllExpiredCreditcardsTest_usecase_1.output.json";
        super.baseTest(procGetAllExpiredCreditcardsTestInput, procGetAllExpiredCreditcardsTestOutput, ProcGetAllExpiredCreditcards.class);
    }

//    @Test
    public void procGetAllExpiredCreditcardsTestUseCaseTest_2() {
        String procGetAllExpiredCreditcardsTestInput = "mock/ProcGetAllExpiredCreditcardsTest/test_procGetAllExpiredCreditcardsTest_usecase_2.input.json";
        String procGetAllExpiredCreditcardsTestOutput = "mock/ProcGetAllExpiredCreditcardsTest/test_procGetAllExpiredCreditcardsTest_usecase_2.output.json";
        super.baseTest(procGetAllExpiredCreditcardsTestInput, procGetAllExpiredCreditcardsTestOutput, ProcGetAllExpiredCreditcards.class);
    }
}
