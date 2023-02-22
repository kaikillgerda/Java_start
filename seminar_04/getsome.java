import java.util.Deque;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.LinkedList;

// public class getsome {
//     public static void main(String[] args) {

//         ArrayList <Integer> arrayLst = new ArrayList<>();
//         long start = System.currentTimeMillis();
//         for (int i = 0; i < 200_000; i++) {
//             arrayLst.add(i);
//         }
//         long end = System.currentTimeMillis();
//         System.out.println("Time ArrayList: " + (end - start));

//         start = System.currentTimeMillis();
//         LinkedList <Integer> linkedLst = new LinkedList<>();
//         for (int i = 0; i < 200_000; i++) {
//             linkedLst.add(i);
//         }
//         end = System.currentTimeMillis();
//         System.out.println("Time LinkedList: " + (end - start));

//     }
// }

/*
* 
Реализовать консольное приложение, которое:

1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
*/
// foo
// bar
// buzz
// print -> [buzz, bar, foo]
// revert
// print -> [bar, foo]

public class getsome {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LinkedList<String> arrayLst = new LinkedList<>();
            while (true) {
                String scanResult = scanner.nextLine();
                if (scanResult.equals("revert")) {
                    if (arrayLst.size() >= 1)
                        arrayLst.removeFirst();
                } else if (scanResult.equals("print")) {

                    System.out.println(arrayLst);
                } else {
                    arrayLst.addFirst(scanResult);
                }

            }
        }
    }
}
