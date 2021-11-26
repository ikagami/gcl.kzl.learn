package gcl.kzl.unittest.service;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyReadinessStateExporter {
    @EventListener
    public void onStateChange(AvailabilityChangeEvent<ReadinessState> event) {
        switch (event.getState()) {
            case ACCEPTING_TRAFFIC:
                System.out.println("ACCEPTING_TRAFFIC");
                break;
            case REFUSING_TRAFFIC:
                System.out.println("REFUSING_TRAFFIC");
                break;
            default:
                System.out.println("default");
        }
    }
}
