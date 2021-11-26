package gcl.kzl.unittest;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gchliangcd
 */
@SpringBootApplication
public class UnitTestApplication {
    public static void main(String[] args) {
        SpringApplication springBootApplication = new SpringApplication(UnitTestApplication.class);
        springBootApplication.setBannerMode(Banner.Mode.CONSOLE);
        springBootApplication.run(args);
    }
}
