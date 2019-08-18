package main;

public class Greet {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Good Day!");
            }
        };
        greeting.greet();

        Greeting lambdaGreet = () -> System.out.println("Good lamda day!");
        lambdaGreet.greet();

        greetMethod(() -> System.out.println("Greeting from lambda method!"));
    }

    public static void greetMethod(Greeting greeting) {
        greeting.greet();
    }
}
