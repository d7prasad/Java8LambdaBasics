package main.unit3;

public class MethodReferenceExample {

    public static void main(String[] args) {
//        Thread t = new Thread(() -> printMessage());
//        The above line can also be written as below
        Thread t = new Thread(MethodReferenceExample::printMessage);
        t.start();
        System.out.println(t);
    }

    public static void printMessage(){
        System.out.println("Thread Started");
    }
}
