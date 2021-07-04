package com.account_cics_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"listaccount-test"})
public class ListAccountServiceTest extends AbstractApiTest {

    public ListAccountServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testListAccountService() throws Exception {
        String listAccount_input = "mock/ListAccount/test_listAccount-getListAccount.input.json";
        String listAccount_output = "mock/ListAccount/test_listAccount-getListAccount.output.json";
        super.baseTest(listAccount_input, listAccount_output, ListAccountServiceImpl.class, "getListAccount");
    }
}
