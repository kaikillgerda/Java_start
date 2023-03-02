import java.util.ArrayDeque;
import java.util.Deque;

public class task_01hw {
    /*
 * Написать метод, определяющую правильность расстановки скобок в выражении.
 * Могут содержаться следующие скобки: ()[]{}<>
 * () -> true
 * []{}((<>)) -> true
 * ) -> false
 * [) -> false
 * []{}(<)> -> false
 */

    public static void main(String[] args) {
        System.out.println(isCorrentParenthesis("()"));
        System.out.println(isCorrentParenthesis("[]{}((<>))"));
        System.out.println(isCorrentParenthesis(")"));
        System.out.println(isCorrentParenthesis("[)"));
        System.out.println(isCorrentParenthesis("[]{}(<)>"));
    }

    /**
     * Возвращает true, если в строке parenthesis правильно расставлены скобки, иначе false
     */
    private static boolean isCorrentParenthesis(String parenthesis) {
        char[] charArr = parenthesis.toCharArray();
        Deque<Integer> stack = new ArrayDeque<>();
        for (char item : charArr) {
            if (item == '(' || item == '[' || item == '{' || item == '<') stack.addFirst(getParType(item));
            if (item == ')' || item == ']' || item == '}' || item == '>') {
                if (!stack.isEmpty() && getParType(item) == stack.peekFirst()) stack.pollFirst();
                else stack.addFirst(getParType(item));
            }
        }
        return stack.isEmpty();
    }

    private static int getParType(char par) {
        int result = 0;
        if (par == '(' || par == ')') result = 1;
        if (par == '[' || par == ']') result = 2;
        if (par == '{' || par == '}') result = 3;
        if (par == '<' || par == '>') result = 4;
        return result;
    }
}