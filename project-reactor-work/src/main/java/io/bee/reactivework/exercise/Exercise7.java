package io.bee.reactivework.exercise;

import io.bee.reactivework.util.ReactiveSources;

import java.io.IOException;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
//        ReactiveSources.intNumbersFlux()
//                .log()
//                .filter(num -> num > 5)
//                .subscribe(System.out::println);

        // Print 10 times each value from intNumbersFlux that's greater than 5
//        ReactiveSources.intNumbersFlux()
//                .log()
//                .filter(num -> num > 5)
//                .map(num -> num * 10)
//                .subscribe(System.out::println);

        // Print 10 times each value from intNumbersFlux for the first 3 numbers emitted that's greater than 5
//        ReactiveSources.intNumbersFlux()
//                .filter(num -> num > 5)
//                .map(num -> num * 10)
//                .take(3)
//                .log()
//                .subscribe(System.out::println);

        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
//        ReactiveSources.intNumbersFlux()
//                .filter(num -> num > 20)
//                .log()
//                .defaultIfEmpty(-1)
//                .subscribe(System.out::println);

        // Switch ints from intNumbersFlux to the right user from userFlux
//        ReactiveSources.intNumbersFlux().
//                log()
//                .flatMap(id -> ReactiveSources.userFlux().filter(user -> user.getId() == id).take(1))
//                .subscribe(System.out::println);

        // Print only distinct numbers from intNumbersFluxWithRepeat
//        ReactiveSources.intNumbersFluxWithRepeat()
//                .distinct()
//                .log()
//                .defaultIfEmpty(-1)
//                .subscribe(System.out::println);

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
//        ReactiveSources.intNumbersFluxWithRepeat()
//                .log()
//                .distinctUntilChanged()
//                .defaultIfEmpty(-1)
//                .subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
