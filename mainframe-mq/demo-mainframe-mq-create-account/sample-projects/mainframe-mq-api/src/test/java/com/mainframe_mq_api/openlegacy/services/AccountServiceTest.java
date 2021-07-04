package com.mainframe_mq_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"account-test"})
public class AccountServiceTest extends AbstractApiTest {

    public AccountServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testAccountService() throws Exception {
        String account_input = "mock/Account/test_account-getAccount.input.json";
        String account_output = "mock/Account/test_account-getAccount.output.json";
        super.baseTest(account_input, account_output, AccountServiceImpl.class, "getAccount");
    }
}
