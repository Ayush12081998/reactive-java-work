package io.bee.reactivework.exercise;

import io.bee.reactivework.util.StreamSource;

import static io.bee.reactivework.util.StreamSource.streamOfNumbers;

public class Exercise1 {

    public static void main(String[] args) {
        var s = "String";
        printSecondAndThirdNum();
        printFirstNumOr_1();
        System.out.println("********************Print Users******************");
        printUser();
    }

    private static void printUser() {
        //1st method
        StreamSource.streamOfNumbers().flatMap(id -> StreamSource.streamOfUsers().filter(user -> user.getId() == id))
                .forEach(user -> System.out.println(user.getName()));
        //2nd method
        StreamSource.streamOfUsers().filter(u -> StreamSource.streamOfNumbers().anyMatch(i -> u.getId() == i))
                .forEach(user -> System.out.println(user.getName()));

    }

    private static void printFirstNumOr_1() {
        System.out.println(streamOfNumbers().filter(num -> num > 5).findFirst().orElse(-1));

    }

    private static void printSecondAndThirdNum() {
        streamOfNumbers().filter(num -> num > 5).skip(1).limit(2).forEach(num -> System.out.println(num));
    }

}
