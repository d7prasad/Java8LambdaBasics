package main.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandling {

    public static void main(String[] args) {
        int key = 10;
        int val = 0;
        process(key, val, (k, v) -> System.out.println(k/v));
    }

    public static void process(int key, int val, BiConsumer<Integer, Integer> consumer) {
        try {
            consumer.accept(key, val);
        } catch (ArithmeticException a) {
            a.printStackTrace();
        }
    }
}
