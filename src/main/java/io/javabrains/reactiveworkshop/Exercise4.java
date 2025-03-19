package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(System.out::println);

        System.out.println("Press a key to proceed");
        System.in.read();

        // Get the value from the Mono into an integer variable
        // block or blockOptional can be used
        Integer val = ReactiveSources.intNumberMono().block();
        System.out.println("value = " + val);

    }

}
