package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Flux;

import java.io.IOException;
import java.time.Duration;

public class PlayWithFlux {

    public static void main(String[] args) throws IOException {
        Flux.just(1, 2, 3)
                .subscribe(System.out::println);

        Flux.just(1, 2, 3)
                .delayElements(Duration.ofSeconds(1))
                .subscribe(System.out::println);

        System.out.println("Press key to end");
        System.in.read();
    }
    
}
