import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       float a = 0.0f;
       double b = 0.0;


       Scanner scanner = new Scanner(System.in).useLocale(Locale.FRANCE);
       /*float input = scanner.nextFloat();
       double input1 = scanner.nextDouble();
        double input2 = (double) scanner.nextInt();*/
        double input3 = scanner.nextDouble();
        double faren = 0;
        double c = (double) input3;
        faren = (double) ((c * 1.8) + 32);
        System.out.println(faren);
    }
}