package io.bee.reactivework.util;

import java.util.stream.Stream;

public class StreamSource {

	public static Stream<String> streamOfStringNumbers() {
		return Stream.of("one", "two", "three", "four", "five");
	}

	public static Stream<Integer> streamOfNumbers() {
		return Stream.iterate(0, i -> i + 2).limit(10);
	}

	public static Stream<User> streamOfUsers() {
		return Stream.of(
				new User(1, "Ayush Kumar"), 
				new User(2, "Shiv Kumar"), 
				new User(3, "Lath Kumar"),
				new User(4, "Akash Kumar")
				);
	}

}
