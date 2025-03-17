package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        ReactiveSources.intNumbersFlux().subscribe(System.out::println);

        // Print all users in the ReactiveSources.userFlux stream
        ReactiveSources.userFlux().subscribe(System.out::println);

        // This makes the program to wait and give time for the async calls to happen
        System.out.println("Press a key to end");
        System.in.read();
    }

}
