import java.util.Arrays;
import java.util.Random;

public class sec {

    public static void main(String[] args) {
        Random r = new Random();

        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = r.nextInt(100); // random [0, 100)
        }

        System.out.println(Arrays.toString(ints));
    }

}
