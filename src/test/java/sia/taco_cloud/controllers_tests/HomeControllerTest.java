package sia.taco_cloud.controllers_tests;

import static org.hamcrest.Matchers.containsString;
import static
        org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static
        org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import sia.taco_cloud.controllers.WebConfig;

@WebMvcTest(WebConfig.class)
class HomeControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(HomeControllerTest.class);

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHomePage() throws Exception {
        logger.info("JR --> Testing Home page...");
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(
                        containsString("Welcome to...")
                ));
    }
}
