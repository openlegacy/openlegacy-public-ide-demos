package com.policy_db2_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"getpolicy-test"})
public class GetPolicyServiceTest extends AbstractApiTest {

    public GetPolicyServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testGetPolicyService() throws Exception {
        String getPolicy_input = "mock/GetPolicy/test_getPolicy-getGetPolicy.input.json";
        String getPolicy_output = "mock/GetPolicy/test_getPolicy-getGetPolicy.output.json";
        super.baseTest(getPolicy_input, getPolicy_output, GetPolicyServiceImpl.class, "getGetPolicy");
    }
}
