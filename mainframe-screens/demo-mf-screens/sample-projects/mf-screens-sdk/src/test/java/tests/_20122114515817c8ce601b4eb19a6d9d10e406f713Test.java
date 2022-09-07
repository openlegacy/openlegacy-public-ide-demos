package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.core.terminal.TerminalSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mf_screens_sdk.openlegacy.Loaninq1;
import com.mf_screens_sdk.openlegacy.Loaninq2;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles({"simple-test"})
public class _20122114515817c8ce601b4eb19a6d9d10e406f713Test {

    @Autowired
    private TerminalSession terminalSession;

    @Test
    public void testSession() {
         Loaninq1 loaninq1 = terminalSession.getEntity(Loaninq1.class);
         Assertions.assertNotNull(loaninq1);
         Loaninq2 loaninq2 = terminalSession.getEntity(Loaninq2.class, 1000);
         Assertions.assertNotNull(loaninq2);
    }
}
