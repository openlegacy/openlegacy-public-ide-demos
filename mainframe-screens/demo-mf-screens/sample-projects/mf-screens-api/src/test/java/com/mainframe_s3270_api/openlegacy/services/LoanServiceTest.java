package com.mainframe_s3270_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"loan-test"})
public class LoanServiceTest extends AbstractApiTest {

    public LoanServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testLoanService() throws Exception {
        String loan_input = "mock/Loan/test_loan-getLoan.input.json";
        String loan_output = "mock/Loan/test_loan-getLoan.output.json";
        super.baseTest(loan_input, loan_output, LoanServiceImpl.class, "getLoan");
    }
}
