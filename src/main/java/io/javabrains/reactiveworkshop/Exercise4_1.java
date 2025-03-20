package io.javabrains.reactiveworkshop;

public class Exercise4_1 {

    public static void main(String[] args) {

        // Mono - Handle terminal events
        ReactiveSources.intNumberMono().subscribe(
                num -> System.out.println(num),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Complete event")
        );
    }

}
