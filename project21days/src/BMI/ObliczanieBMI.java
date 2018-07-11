package BMI;

import java.util.Scanner;

public class ObliczanieBMI {

    public static void main(String[] args)
    {
        double waga;
        double wzrost;
        double bmi;

        Scanner scaner = new Scanner(System.in);

        System.out.print("Podaj wagę: ");
        waga=scaner.nextDouble();

        System.out.print("Podaj wzrost: ");
        wzrost=scaner.nextDouble();

        bmi=waga/Math.pow((wzrost/100),2);

        System.out.printf("Twoje BMI wynosi %.2f",bmi);
    }
}
