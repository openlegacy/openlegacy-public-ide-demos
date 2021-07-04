package com.policy_cics_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"openpolicy-test"})
public class OpenPolicyServiceTest extends AbstractApiTest {

    public OpenPolicyServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testOpenPolicyService() throws Exception {
        String openPolicy_input = "mock/OpenPolicy/test_openPolicy-getOpenPolicy.input.json";
        String openPolicy_output = "mock/OpenPolicy/test_openPolicy-getOpenPolicy.output.json";
        super.baseTest(openPolicy_input, openPolicy_output, OpenPolicyServiceImpl.class, "getOpenPolicy");
    }
}
