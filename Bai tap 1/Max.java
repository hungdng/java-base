import java.util.Scanner;

/**
 * max
 */
public class Max {
    private int a, b, c, d;

    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap A ");
        a = kb.nextInt();

        System.out.print("Nhap B ");
        b = kb.nextInt();

        System.out.print("Nhap C ");
        c = kb.nextInt();

        System.out.print("Nhap D ");
        d = kb.nextInt();
    }

    public void output() {
        System.out.println("Max(" + a + ", " + b + ", " + c + ", " + d + ") = " + findMax());
    }

    public int findMax() {
        int max = 0;
        max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        if (max < d)
            max = d;
        return max;
    }
}