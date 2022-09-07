package com.as400_5250_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"displayjobattributes-test"})
public class DisplayJobAttributesServiceTest extends AbstractApiTest {

    public DisplayJobAttributesServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testDisplayJobAttributesService() throws Exception {
        String displayJobAttributes_input = "mock/DisplayJobAttributes/test_displayJobAttributes-getDisplayJobAttributes.input.json";
        String displayJobAttributes_output = "mock/DisplayJobAttributes/test_displayJobAttributes-getDisplayJobAttributes.output.json";
        super.baseTest(displayJobAttributes_input, displayJobAttributes_output, DisplayJobAttributesServiceImpl.class, "getDisplayJobAttributes");
    }
}
