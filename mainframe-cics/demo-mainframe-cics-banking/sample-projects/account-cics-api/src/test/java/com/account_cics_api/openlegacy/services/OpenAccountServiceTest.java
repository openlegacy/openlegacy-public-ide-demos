package com.account_cics_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"openaccount-test"})
public class OpenAccountServiceTest extends AbstractApiTest {

    public OpenAccountServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testOpenAccountService() throws Exception {
        String openAccount_input = "mock/OpenAccount/test_openAccount-getOpenAccount.input.json";
        String openAccount_output = "mock/OpenAccount/test_openAccount-getOpenAccount.output.json";
        super.baseTest(openAccount_input, openAccount_output, OpenAccountServiceImpl.class, "getOpenAccount");
    }
}
