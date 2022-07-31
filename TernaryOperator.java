/**
 * Syntax
 * (condition)?(statement_1):(statement_2);
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 100, b= 20, c = 30;
        int result = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Greatest number is = "+result);
    }
}
 