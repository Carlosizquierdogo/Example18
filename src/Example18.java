import java.util.Scanner;

public class Example18 {
    public static void main(String[] args) {
        double real_hours;
        double price;
        double gross;
        double taxes;
        double netpay;
        System.out.println("Enter your hours :");
        Scanner inputvalue;
        inputvalue = new Scanner(System.in);
        real_hours = inputvalue.nextInt();
        System.out.println("Enter your number price / €   :");
        Scanner inputhours;
        inputhours = new Scanner(System.in);
        price = inputhours.nextDouble();
        if (real_hours > 35) {
            gross = 35 * price + (real_hours - 35) * price * 1.5;
        } else
            gross = real_hours * price;
        {
        System.out.println("Gross salary " + gross);
        if (gross > 500) {
            if (gross > 900) {
                taxes = 400 * 0.25 + (gross - 900) * 0.45;
            } else
                taxes = (gross - 500) * 0.25;
            } else
                taxes = 0;
        }

        netpay = gross - taxes;
        System.out.println("Enter your number of Hours   :" + taxes);
        System.out.println("Enter your number of Hours   :" + netpay);
    }
}
































