//Write a program to calculate SI. 
//Formula Simple Interest = (PrincipleAmount*Time*Rate/100);

import java.util.Scanner;
public class Task3c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principle:");
        int Principle = scanner.nextInt();

        System.out.print("Enter the time:");
        int Time = scanner.nextInt();

        System.out.print("Enter the rate:");
        float Rate = scanner.nextFloat();

        Float SI=(Principle*Time*Rate)/100;
        System.out.print("The simple interest is:"+SI);

        scanner.close();
    }
}
