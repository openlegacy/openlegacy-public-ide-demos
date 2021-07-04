package com.mainframe_ctg_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"createaccount-test"})
public class CreateAccountServiceTest extends AbstractApiTest {

    public CreateAccountServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testCreateAccountService() throws Exception {
        String createAccount_input = "mock/CreateAccount/test_createAccount-getCreateAccount.input.json";
        String createAccount_output = "mock/CreateAccount/test_createAccount-getCreateAccount.output.json";
        super.baseTest(createAccount_input, createAccount_output, CreateAccountServiceImpl.class, "getCreateAccount");
    }
}
