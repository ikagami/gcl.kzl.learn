package gcl.kzl.unittest.bootstrap;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("MyApplicationStartingEventListener.onApplicationEvent()");
        SpringApplication springApplication = event.getSpringApplication();
        springApplication.setBannerMode(Banner.Mode.OFF);
    }
}
