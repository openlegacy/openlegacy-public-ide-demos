//package tests;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.openlegacy.core.terminal.TerminalSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import com.as400_5250_sdk.openlegacy.SignOn;
//import com.as400_5250_sdk.openlegacy.IbmIMainMenu;
//import com.as400_5250_sdk.openlegacy.UserTasks;
//import com.as400_5250_sdk.openlegacy.WorkWithJob;
//import com.as400_5250_sdk.openlegacy.DisplayJobRunAttributes;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//@ActiveProfiles({"simple-test"})
//public class _2101241021A9ba66fc02cc4d3fBe91D38c6af65b92Test {
//
//    @Autowired
//    private TerminalSession terminalSession;
//
//    @Test
//    public void testSession() {
//         SignOn signOn = terminalSession.getEntity(SignOn.class);
//         Assertions.assertNotNull(signOn);
//         IbmIMainMenu ibmIMainMenu = terminalSession.getEntity(IbmIMainMenu.class);
//         Assertions.assertNotNull(ibmIMainMenu);
//         UserTasks userTasks = terminalSession.getEntity(UserTasks.class);
//         Assertions.assertNotNull(userTasks);
//         WorkWithJob workWithJob = terminalSession.getEntity(WorkWithJob.class);
//         Assertions.assertNotNull(workWithJob);
//         DisplayJobRunAttributes displayJobRunAttributes = terminalSession.getEntity(DisplayJobRunAttributes.class);
//         Assertions.assertNotNull(displayJobRunAttributes);
//    }
//}
