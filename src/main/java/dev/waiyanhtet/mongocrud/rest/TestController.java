package dev.waiyanhtet.mongocrud.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.stream.IntStream;

@RestController
@RequestMapping(value = "/api")
public class TestController {

    @GetMapping(value = "/test")
    public Mono<?> test() {
        return Mono.just(ResponseEntity.ok("Api is working...."));
    }

    @GetMapping(value = "/stream")
    public Flux<?> getStreamDemoData() {
        return Flux.just(ResponseEntity.ok(IntStream.range(1,10000).boxed()));
    }
}
