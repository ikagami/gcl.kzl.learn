package gcl.kzl.unittest;

import gcl.kzl.unittest.bootstrap.MyApplicationStartingEventListener;
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
        springBootApplication.addListeners(new MyApplicationStartingEventListener());
        springBootApplication.run(args);
    }
}
