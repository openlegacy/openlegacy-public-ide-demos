package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openlegacy.core.exceptions.RegistryException;
import org.openlegacy.core.modules.login.Login;
import org.openlegacy.core.modules.login.LoginException;
import org.openlegacy.core.modules.trail.Trail;
import org.openlegacy.core.terminal.TerminalSession;
import org.openlegacy.impl.modules.trail.AbstractSessionTrail;
import org.openlegacy.impl.screens.modules.trail.TrailUtil;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import org.springframework.beans.factory.annotation.Autowired;
import java.io.FileNotFoundException;

@SpringBootTest
@ActiveProfiles({"simple-test"})
public class ProjectTest {

    @Autowired
    private TerminalSession terminalSession;

    @Autowired
    private TrailUtil trailUtil;

    @Test
    @Disabled
    public void testProject() throws RegistryException, LoginException, FileNotFoundException {
        AbstractSessionTrail<?> sessionTrail = (AbstractSessionTrail<?>) terminalSession.getModule(Trail.class).getSessionTrail();
        sessionTrail.setHistoryCount(null);

        try {
            terminalSession.getModule(Login.class).login("user", "pwd");

            // example of how to navigate to certain entity
            // Items items = terminalSession.getEntity(Items.class);

            // example of how to navigate to certain entity with key
            // ItemDetails itemDetails = terminalSession.getEntity(ItemDetails.class,123);

            // example of how to update field
            // itemDetails.setDescription("ABC");

            // example of how to perform an action on an entity with modified field
            // terminalSession.doAction(TerminalActions.ENTER(), (ScreenEntity)items);

        } finally {
            trailUtil.saveTestTrail(terminalSession);
            terminalSession.disconnect();
        }

    }
}
