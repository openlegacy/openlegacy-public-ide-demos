package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openlegacy.core.rpc.RpcSession;
import org.openlegacy.core.rpc.actions.RpcActions;
import org.openlegacy.tests.rpc.AbstractRpcEntityTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mainframe_ctg_sdk.openlegacy.Opnact31;
import com.mainframe_ctg_sdk.openlegacy.Opnact31AccountDetails;
import com.mainframe_ctg_sdk.openlegacy.Opnact31CrtAccountIn;
import com.mainframe_ctg_sdk.openlegacy.Opnact31Dfhcommarea;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Opnact31Test extends AbstractRpcEntityTest<Opnact31> {

	@Autowired
	RpcSession rpcSession;

	@Autowired
	public Opnact31Test(ApplicationContext applicationContext) {
		super(applicationContext);
	}

	@Test
	public void testAccountOut() throws Exception {
		Opnact31 opnact31 = new Opnact31();
		Opnact31Dfhcommarea dfhcommarea = new Opnact31Dfhcommarea();
		Opnact31CrtAccountIn crtAccIn = new Opnact31CrtAccountIn();
		crtAccIn.setActiCustomerId("204693875");
		crtAccIn.setActiCustomerName("Ori Shalom");
		crtAccIn.setActiTypcd("P");
		crtAccIn.setActiSubTypcd("BC");
		crtAccIn.setActiCntryCd("IL");
		crtAccIn.setActiBnkId("0012");
		crtAccIn.setActiBrnchId(89);
		crtAccIn.setActiInitialDeposit(9385828562.78);
		crtAccIn.setActiCurrency("USD");
		dfhcommarea.setCrtAccountIn(crtAccIn);
		opnact31.setDfhcommarea(dfhcommarea);
		opnact31 = rpcSession.doAction(RpcActions.execute(), opnact31);
		Opnact31AccountDetails opnact31AccountDetails = opnact31.getDfhcommarea().getAccountOut().getAccountDetails();
		assertNotNull(opnact31AccountDetails);
		assertEquals(9, opnact31AccountDetails.getActoCustomerId().length());
		assertTrue(opnact31AccountDetails.getActoIban().length() > 0);

	}
}
