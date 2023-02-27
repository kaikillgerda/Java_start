import java.util.ArrayList;
import java.util.Scanner;

public class task_01 {
    /**
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя строку вида
     * text~num
     * Нужно рассплитить строку по ~, сохранить text в связный список на позицию
     * num.
     * Если введено print~num, выводит строку из позиции num в связном списке и
     * удаляет её из списка.
     * text~num (например, word~4)
     * print~num (распечатать текст)
     * 
     * word~1
     * foo~5
     * qwerty~10
     * bar~5
     * print~10 -> qwerty
     * print~1 -> word
     * print~2 -> пустая строка или исключение NoSuchElementException
     * print~5 -> bar
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> textArr = new ArrayList<>();
        ItemArray itemArr = new task1hw().new ItemArray();
        do {
            itemArr = parseString(scan.nextLine(), "`");
            if (itemArr.index != -1) {
                if (itemArr.text.equals("print")) {
                    boolean isOutOrEmpty = itemArr.index > textArr.size() || textArr.get(itemArr.index).isEmpty();
                    if (isOutOrEmpty) {
                        System.out.println("\"\"");
                    } else {
                        System.out.println(textArr.get(itemArr.index));
                        textArr.set(itemArr.index, "");
                    }
                } else
                    appendArrLst(textArr, itemArr);
            }
        } while (!itemArr.text.equals("exit"));
        scan.close();
    }
}
