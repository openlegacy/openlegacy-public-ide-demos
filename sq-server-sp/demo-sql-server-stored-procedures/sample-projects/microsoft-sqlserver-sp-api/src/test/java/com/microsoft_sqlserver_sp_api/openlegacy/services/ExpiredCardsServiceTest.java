package com.microsoft_sqlserver_sp_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"expiredcards-test"})
public class ExpiredCardsServiceTest extends AbstractApiTest {

    public ExpiredCardsServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testExpiredCardsService() throws Exception {
        String expiredCards_input = "mock/ExpiredCards/test_expiredCards-getExpiredCards.input.json";
        String expiredCards_output = "mock/ExpiredCards/test_expiredCards-getExpiredCards.output.json";
        super.baseTest(expiredCards_input, expiredCards_output, ExpiredCardsServiceImpl.class, "getExpiredCards");
    }
}
