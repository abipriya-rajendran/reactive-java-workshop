package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise7 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
        ReactiveSources.intNumbersFlux()
                .log()
                .filter(num -> num > 5)
                .subscribe(System.out::println);

        // Print each value multiplied by 10 from intNumbersFlux that's greater than 5
        ReactiveSources.intNumbersFlux()
                .filter(num -> num > 5)
                .map(num -> num * 10)
                .subscribe(System.out::println);

        // Print each value multiplied by 10 from intNumbersFlux for the first 3 numbers emitted that's greater than 5
        ReactiveSources.intNumbersFlux()
                .filter(num -> num > 5)
                .take(3)
                .map(num -> num * 10)
                .subscribe(System.out::println);

        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
        ReactiveSources.intNumbersFlux()
                .filter(num -> num > 20)
                .defaultIfEmpty(-1)
                .subscribe(System.out::println);

        // Switch ints from intNumbersFlux to the right user from userFlux
        ReactiveSources.intNumbersFlux()
                .flatMap(num -> ReactiveSources.userFlux().filter(user -> user.getId() == num))
                .subscribe(System.out::println);

        // Print only distinct numbers from intNumbersFluxWithRepeat
        ReactiveSources.intNumbersFluxWithRepeat()
                .log()
                .distinct()
                .subscribe(System.out::println);

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        ReactiveSources.intNumbersFluxWithRepeat()
                .log()
                .distinctUntilChanged()
                .subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
