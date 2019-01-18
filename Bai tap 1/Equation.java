import java.util.Scanner;

/**
 * Equation
 */
public class Equation {

    private double a, b, c, t, t1, t2, delta;

    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap A ");
        a = kb.nextDouble();

        System.out.print("Nhap B ");
        b = kb.nextDouble();

        System.out.print("Nhap C ");
        c = kb.nextDouble();
    }

    public String Cal() {
        String result = "";
        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    result = "VSN";
                else
                    result = "VN";
            } else {
                t = -c / b;
                if (t < 0)
                    result = "VN";
                else {
                    result = "PT co 2 nghiem \n x1 = " + Math.sqrt(t) + "\n x2 = -" + Math.sqrt(t);
                }
            }
        } else {
            delta = (b * b) - (4 * a * c);
            if (delta < 0)
                result = "VN";
            else if (delta == 0) {
                t = (-b) / (2 * a);
                if (t < 0)
                    result = "VN";
                else
                    result = "PT co 2 nghiem \n x1 = " + Math.sqrt(t) + "\n x2 = -" + Math.sqrt(t);
            } else if (delta > 0) {
                // dat t = x2 voi dk t>=0
                // luc do pt co dang at2 + bt +c = 0
                t1 = Math.sqrt((-b + Math.sqrt(delta)) / (2 * a));
                t2 = Math.sqrt((-b - Math.sqrt(delta)) / (2 * a));

                if (t1 < 0 && t2 < 0)
                    result = "VN";
                else if (t1 >= 0 && t2 < 0)
                    result = "PT co 2 nghiem \n x1 = " + Math.sqrt(t1) + "\n x2 = -" + Math.sqrt(t1);
                else if (t2 >= 0 && t1 < 0)
                    result = "PT co 2 nghiem \n x1 = " + Math.sqrt(t2) + "\n x2 = -" + Math.sqrt(t2);
                else if (t1 > 0 && t2 > 0)
                    result = "PT co 4 nghiem \n x1 = " + t1 + "\n x2 = -" + t1 + "\n x3 = " + t2 + "\n x4 = -" + t2;
            }
        }
        return result;
    }

    public void output() {
        System.out.println(Cal());
    }
}