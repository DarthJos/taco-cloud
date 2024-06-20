package sia.taco_cloud;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TacoCloudApplicationTests {

	private Logger logger = LoggerFactory.getLogger(TacoCloudApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("JR --> Context Loaded...");
	}

}
