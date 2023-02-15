package seminar_02;

public class task_01 {

    /*
     * Дано четное число N (>0) и символы c1 и c2.
     * Написать метод, который вернет строку длины N, которая состоит из
     * чередующихся символов c1 и c2, начиная с c1.
     */
    public static void main(String[] args) {
        System.out.println(buildString(6, 'a', 'b')); // ababab
    }

    private static String buildString(int n, char first, char second) {
        // Написать метод, который вернет строку длины N, которая состоит из
        // чередующихся символов c1 и c2, начиная с c1.
        String result = "";
        int flag = 0;
        while (flag < n) {
            result = result + first + second;
            flag += 2;
        }
        return result;
    }
}

