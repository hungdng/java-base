import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {
    private int a, b;
    private char operator = '+';

    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap A ");
        a = kb.nextInt();

        System.out.print("Nhap B ");
        b = kb.nextInt();

        System.out.print("Nhap phep toan (+, -, *, /) ");
        operator = kb.next().charAt(0);
    }

    public float caculator() {
        float result = 0;
        if (operator == '+')
            result = a + b;
        else if (operator == '-')
            result = a - b;
        else if (operator == '*')
            result = a * b;
        else if (operator == '/')
            result = (float) a / b;
        return result;
    }

    public void output() {
        System.out.println(a + " " + Character.toString(operator) + " " + b + " = " + caculator());
    }

}