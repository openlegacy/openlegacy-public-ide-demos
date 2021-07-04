package com.policy_cics_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"deletepolicy-test"})
public class DeletePolicyServiceTest extends AbstractApiTest {

    public DeletePolicyServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testDeletePolicyService() throws Exception {
        String deletePolicy_input = "mock/DeletePolicy/test_deletePolicy-getDeletePolicy.input.json";
        String deletePolicy_output = "mock/DeletePolicy/test_deletePolicy-getDeletePolicy.output.json";
        super.baseTest(deletePolicy_input, deletePolicy_output, DeletePolicyServiceImpl.class, "getDeletePolicy");
    }
}
