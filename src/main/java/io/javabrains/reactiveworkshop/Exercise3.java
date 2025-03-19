package io.javabrains.reactiveworkshop;

import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        List<Integer> list = ReactiveSources.intNumbersFlux().toStream().toList();
        System.out.println("List" + list);
        System.out.println("List size : " + list.size());
    }

}
