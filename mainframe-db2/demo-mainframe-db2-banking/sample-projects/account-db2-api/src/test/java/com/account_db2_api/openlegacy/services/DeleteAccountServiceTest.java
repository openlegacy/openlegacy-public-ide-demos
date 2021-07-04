package com.account_db2_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"deleteaccount-test"})
public class DeleteAccountServiceTest extends AbstractApiTest {

    public DeleteAccountServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testDeleteAccountService() throws Exception {
        String deleteAccount_input = "mock/DeleteAccount/test_deleteAccount-getDeleteAccount.input.json";
        String deleteAccount_output = "mock/DeleteAccount/test_deleteAccount-getDeleteAccount.output.json";
        super.baseTest(deleteAccount_input, deleteAccount_output, DeleteAccountServiceImpl.class, "getDeleteAccount");
    }
}
