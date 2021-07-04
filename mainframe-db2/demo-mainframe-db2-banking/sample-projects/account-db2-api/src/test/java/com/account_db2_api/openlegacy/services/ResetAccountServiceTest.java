package com.account_db2_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"resetaccount-test"})
public class ResetAccountServiceTest extends AbstractApiTest {

    public ResetAccountServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testResetAccountService() throws Exception {
        String resetAccount_input = "mock/ResetAccount/test_resetAccount-getResetAccount.input.json";
        String resetAccount_output = "mock/ResetAccount/test_resetAccount-getResetAccount.output.json";
        super.baseTest(resetAccount_input, resetAccount_output, ResetAccountServiceImpl.class, "getResetAccount");
    }
}
