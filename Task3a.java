import java.util.Scanner;

public class Task3a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age of a person:");
        int age=scanner.nextInt();
        System.out.println("Your age is:"+age);
        
        String result= (age>18)?"you can vote!":"you can't vote!";
        System.out.printf("Therefore your age is %d and %s",age,result);
        scanner.close();
    }
}
