package sia.taco_cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacoCloudApplication {

	private static Logger logger = LoggerFactory.getLogger(TacoCloudApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
		logger.info("JR --> Main Taco Project loaded...");
	}

}
