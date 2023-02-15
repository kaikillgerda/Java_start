import java.util.Arrays;
import java.util.Random;

public class SeminarOne {
    static Random r = new Random();
    public static void checkSum(int a, int b){


        boolean isBetween = a + b == 20 ? true : false;
        System.out.println(isBetween);
    }
    public static void printString(int a, String b){
        System.out.printf("string %s will be printed %d times\n", b, a);
        for (int i = 0; i <= a; i++) {
            System.out.println(b);
        }
    }

    public static void checkYear(int year){
        boolean isLeap = year % 4 == 0 ? true : false;
        System.out.println(isLeap);
    }
    public static int[] createArray(int len, int init){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = init;
        }
        return arr;
    }
    public static void checkPositive(int val){
        String isPositive = val > 0 ? "Positive" : "Negative"; // is it the string view of true/false, this more understood
        System.out.printf("number %d is %b", val, isPositive);
    }

    public static int[][] create2DArray(int cols, int rows){
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[0][0] = r.nextInt(1,10);
                arr[1][1] = r.nextInt(1,10);
                arr[2][2] = r.nextInt(1,10);
                arr[2][0] = r.nextInt(1,10);
                arr[0][2] = r.nextInt(1,10);

            }
        }
        return arr;
    }
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void findMaxAndMin(int[] array){

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            else if (array[i] < min) min = array[i];
        }
        System.out.printf("minimal = %d; maximal = %d", min, max);
    }

    public static int[] arrayCreation(int count){
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = r.nextInt(0,100);
        }
        return arr;
    }

    public void replaceIndex(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }

    public  void findPrefix(String[] arr){
        if (arr.length ==0) System.out.println("");
        String prefix = arr[0];
        for (var str : arr){
            while (str.indexOf(prefix) != 0){

            prefix = prefix.substring(0, prefix.length() -1);
            if (prefix.isBlank()) System.out.println("");;
            }
        }
        System.out.println(prefix);;
    }

}