/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package project.reactor.demo;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Disposable subscribe = Flux.just("hi", "there").subscribe(System.out::println);

        //System.out.println(ss);
    }
}
