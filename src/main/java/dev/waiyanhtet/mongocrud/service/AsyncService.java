package dev.waiyanhtet.mongocrud.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service @Configuration
public class AsyncService {

    @Async
    public void asyncTaskWithDelay() {
        try {
            System.out.println("Async task started");
            Thread.sleep(60000);
            System.out.println("Async task completed after 5 seconds.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Async task interrupted.");
        }
    }
}
