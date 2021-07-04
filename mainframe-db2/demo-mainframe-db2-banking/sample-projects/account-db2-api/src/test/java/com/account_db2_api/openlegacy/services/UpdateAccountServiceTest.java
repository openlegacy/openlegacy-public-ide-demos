package com.account_db2_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"updateaccount-test"})
public class UpdateAccountServiceTest extends AbstractApiTest {

    public UpdateAccountServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testUpdateAccountService() throws Exception {
        String updateAccount_input = "mock/UpdateAccount/test_updateAccount-getUpdateAccount.input.json";
        String updateAccount_output = "mock/UpdateAccount/test_updateAccount-getUpdateAccount.output.json";
        super.baseTest(updateAccount_input, updateAccount_output, UpdateAccountServiceImpl.class, "getUpdateAccount");
    }
}
