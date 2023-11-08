package Task3;

import java.util.ArrayList;
import java.util.List;

public class TheGame {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(0);
        numbers.add(5);
        numbers.add(3);

        System.out.println("Результирующий счёт: " + game(numbers));
    }

    public static int game(List<Integer> list) {
        int result = 0;

        System.out.println(list);

        for (int count = 0; count < list.size() - 1; count++) {
            if (list.get(count) + list.get(count + 1) == 9 || list.get(count) == list.get(count + 1)) {
                list.remove(count);
                list.remove(count);
                result++;
                result = result + game(list);
            }
        }
        return result;
    }
}
