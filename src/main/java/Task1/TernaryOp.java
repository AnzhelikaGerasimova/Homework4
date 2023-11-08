package Task1;

public class TernaryOp {
    public static void main(String[] args) {
        System.out.println(convertNumber(-30));
    }
    public static String convertNumber(int number) {
        String result = number > 0 ? number % 7 < 4 ? "positive-m" : "positive-p" : number == 0  ? "zero" : number % 7 > -4 ? "negative-m" : "negative-p";

        return result;
    }
}







