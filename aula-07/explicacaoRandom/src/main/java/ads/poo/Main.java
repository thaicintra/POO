package ads.poo;

import java.util.Random;

public class Main {
    static void main() {

        Random r = new Random(123456);

        int i = r.nextInt(10); // 0 até 9

        System.out.println(i);

    }
}