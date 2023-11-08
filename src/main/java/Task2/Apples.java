package Task2;

public class Apples {
    public static void main(String args[]) {
        System.out.println(apples("Иван", 32));
    }

    public static String apples(String name, int number) {
        String out = name + " хранит " + number;
        String result = out + " яблоко.";
        if ((number >= 11 && number < 15) || (number % 10 >= 5 && number % 10 <= 9) || (number % 10 == 0)) {
            result = out + " яблок.";
        } else if (number % 10 > 1 && number % 10 < 5) {
            result = out + " яблока.";
        }
        return result;
    }
}