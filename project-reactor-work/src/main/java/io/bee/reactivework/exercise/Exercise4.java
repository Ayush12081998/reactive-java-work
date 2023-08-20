package io.bee.reactivework.exercise;

import java.io.IOException;

import io.bee.reactivework.util.ReactiveSources;

public class Exercise4 {

	public static void main(String[] args) throws IOException {

		ReactiveSources.intNumberMono().subscribe(System.out::println);
		Integer num = ReactiveSources.intNumberMono().block();
		ReactiveSources.intNumbersFlux().subscribe(System.out::println);
		System.out.println("Enter any key to end");
		Integer numUnblocked;
//		ReactiveSources.intNumberMono().subscribe(num1->numUnblocked=num);
		System.in.read();
	}

}
