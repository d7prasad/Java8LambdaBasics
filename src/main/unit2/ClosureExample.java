package main.unit2;

public class ClosureExample {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        doProcess(i, in -> {
            System.out.println(in+j);
            // j++ here j++ cannot be incrementated because variables used inside lambda cannot be modified, it will be considered final.
        });
    }

    static void doProcess(int i, Process p){
        p.process(i);
    }
}

interface Process {
    void process(int i);
}