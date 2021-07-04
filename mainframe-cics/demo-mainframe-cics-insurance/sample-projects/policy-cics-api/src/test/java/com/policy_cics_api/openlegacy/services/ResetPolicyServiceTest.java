package com.policy_cics_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"resetpolicy-test"})
public class ResetPolicyServiceTest extends AbstractApiTest {

    public ResetPolicyServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testResetPolicyService() throws Exception {
        String resetPolicy_input = "mock/ResetPolicy/test_resetPolicy-getResetPolicy.input.json";
        String resetPolicy_output = "mock/ResetPolicy/test_resetPolicy-getResetPolicy.output.json";
        super.baseTest(resetPolicy_input, resetPolicy_output, ResetPolicyServiceImpl.class, "getResetPolicy");
    }
}
