package tests;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import org.openlegacy.core.modules.login.Login;
import org.openlegacy.core.terminal.TerminalSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


import com.as400_5250_sdk.openlegacy.DisplayJobRunAttributes;
import com.as400_5250_sdk.openlegacy.IbmIMainMenu;
import com.as400_5250_sdk.openlegacy.UserTasks;
import com.as400_5250_sdk.openlegacy.WorkWithJob;

//@RunWith(SpringRunner.class)
@SpringBootTest

@ActiveProfiles({"simple-test"})
public class TrailTest {

    @Autowired
    private TerminalSession terminalSession;

    @Test
    public void testSession() {
terminalSession.getModule(Login.class).login("OPENLEGA1", "OPENLEGA");IbmIMainMenu ibmIMainMenu = terminalSession.getEntity(IbmIMainMenu.class);
         assertNotNull(ibmIMainMenu);
         UserTasks userTasks = terminalSession.getEntity(UserTasks.class);
         assertNotNull(userTasks);
         WorkWithJob workWithJob = terminalSession.getEntity(WorkWithJob.class);
         assertNotNull(workWithJob);
         DisplayJobRunAttributes displayJobRunAttributes = terminalSession.getEntity(DisplayJobRunAttributes.class);
         assertNotNull(displayJobRunAttributes);
    }
}
