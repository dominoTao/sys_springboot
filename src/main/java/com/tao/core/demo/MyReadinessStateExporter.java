package com.tao.core.demo;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * applicationRunner 和 CommandLineRunner 启动期间 进行监听
 */
@Component
public class MyReadinessStateExporter {
    @EventListener
    public void onStatusChange(AvailabilityChangeEvent<ReadinessState> event){
        switch (event.getState()) {
            case ACCEPTING_TRAFFIC:
                // create file /tmp/healthy
                break;
            case REFUSING_TRAFFIC:
                // remove file /tmp/healthy
                break;
        }
    }
}
