import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;


public class task_01 {
    public static void main(String[] args) {
        int sizeArray = 1000;
        int[] array = new int[sizeArray];
        fillArray(array);

        System.out.println(uniqueElement(array));
        System.out.println((uniqueElement(array)).size() * 100.0 / sizeArray + "%");

    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(200);
        }
    }

    private static Set uniqueElement(int[] array) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> tempSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                tempSet.add(array[i]);
            } else {
                set.add(array[i]);
            }
        }

        set.removeAll(tempSet);

        return set;
    }

}
