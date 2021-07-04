package com.account_db2_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"getaccount-test"})
public class GetAccountServiceTest extends AbstractApiTest {

    public GetAccountServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testGetAccountService() throws Exception {
        String getAccount_input = "mock/GetAccount/test_getAccount-getGetAccount.input.json";
        String getAccount_output = "mock/GetAccount/test_getAccount-getGetAccount.output.json";
        super.baseTest(getAccount_input, getAccount_output, GetAccountServiceImpl.class, "getGetAccount");
    }
}
