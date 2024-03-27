package dev.waiyanhtet.mongocrud.rest;

import dev.waiyanhtet.mongocrud.service.AsyncService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/async")
@RequiredArgsConstructor
public class AsyncController {

    private final AsyncService asyncService;

    @GetMapping("/test")
    public Mono<ResponseEntity<?>> asyn() {
        asyncService.asyncTaskWithDelay();
        return Mono.just(ResponseEntity.ok(""));
    }
}
