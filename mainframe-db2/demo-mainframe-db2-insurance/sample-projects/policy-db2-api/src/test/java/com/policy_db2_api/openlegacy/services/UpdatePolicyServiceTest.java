package com.policy_db2_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"updatepolicy-test"})
public class UpdatePolicyServiceTest extends AbstractApiTest {

    public UpdatePolicyServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testUpdatePolicyService() throws Exception {
        String updatePolicy_input = "mock/UpdatePolicy/test_updatePolicy-getUpdatePolicy.input.json";
        String updatePolicy_output = "mock/UpdatePolicy/test_updatePolicy-getUpdatePolicy.output.json";
        super.baseTest(updatePolicy_input, updatePolicy_output, UpdatePolicyServiceImpl.class, "getUpdatePolicy");
    }
}
