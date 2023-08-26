package io.bee.reactivework.exercise;

import io.bee.reactivework.util.ReactiveSources;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        // flux with all hooks demonstrated task to do (on getting an item event, on completion event, on failure event)
        // complete and failure event are terminal in nature

        //This will be executed by separate thread (t1)
        ReactiveSources.intNumbersFlux().subscribe(
                System.out::println,
                error -> System.out.println(error.getMessage()),
                () -> System.out.println("Task completed")
        );

        //This will be executed by separate thread (t2)
        ReactiveSources.intNumbersFlux().subscribe(new ControlledSubscribe<>());

        System.out.println("Enter any key to terminate process");
        System.in.read();
    }
}

class ControlledSubscribe<T> extends BaseSubscriber<T> {

    /**
     * Another way to specify subscriber implementation for various hooks (nextVal,onComplete,OnFailure)
     * Here we have manual control over how many processed object we want to handle after event is emitted,
     * and we can get those many number of processed result .
     *
     *
     * request(long num) method is used to control back pressure if observer emits event at fast rate.
     */
    @Override
    public void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscription happened");
        request(1);
    }

    /**
     * Hook for processing of onNext values.
     */
    @Override
    public void hookOnNext(T value) {
        System.out.println("Value received " + value.toString());
        request(3);
    }

    /**
     * Hook for completion processing.
     */
    @Override
    public void hookOnComplete() {
        System.out.println("Task Completed");
    }

    /**
     * Hook to handle failure.
     *
     * @param error the error to process
     */
    @Override
    public void hookOnError(Throwable error) {
        System.out.println("Something wrong happened : " + error.getMessage());
    }
}
