package io.bee.reactivework.exercise;

import java.io.IOException;

import io.bee.reactivework.util.ReactiveSources;

public class Exercise4 {

	public static void main(String[] args) throws IOException {

		ReactiveSources.intNumberMono().subscribe(num -> System.out.println(num));
		Integer num = ReactiveSources.intNumberMono().block();
		System.out.println("Enter any key to end");
		Integer numUnblocked;
		ReactiveSources.intNumberMono().subscribe(num->numUnblocked=num);
		System.in.read();
	}

}
