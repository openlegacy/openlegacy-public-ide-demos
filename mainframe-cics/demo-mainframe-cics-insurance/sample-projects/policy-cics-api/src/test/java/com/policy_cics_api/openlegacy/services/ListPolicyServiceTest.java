package com.policy_cics_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"listpolicy-test"})
public class ListPolicyServiceTest extends AbstractApiTest {

    public ListPolicyServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testListPolicyService() throws Exception {
        String listPolicy_input = "mock/ListPolicy/test_listPolicy-getListPolicy.input.json";
        String listPolicy_output = "mock/ListPolicy/test_listPolicy-getListPolicy.output.json";
        super.baseTest(listPolicy_input, listPolicy_output, ListPolicyServiceImpl.class, "getListPolicy");
    }
}
