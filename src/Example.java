import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by eugeny on 03.09.2015.
 */
public class Example {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        Example example = new Example();
        example.run();
    }

    private void run() {
        int a = 7;
        int b = 5;
        int c = a + b;
        System.out.println(c);
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        System.out.println("t = " + t);
        double x = scanner.nextDouble();
        System.out.println("x = " + x);
        double y = calcY(a, b, x);
        System.out.printf("y = %6.3f\n", y);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.getDayOfMonth()+"." +
        dateTime.getMonth()
                .getDisplayName(TextStyle.FULL, Locale.getDefault())
                +"."+dateTime.getYear());
    }

    private double calcY(int a, int b, double x) {
        return a+b*Math.sin(x);
    }
}
