import java.util.Scanner;

public class Task3b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks of a student:");
        int Maths =scanner.nextInt();
        int Science =scanner.nextInt();
        int English =scanner.nextInt();
        int Nepali =scanner.nextInt();

        float average=(Maths+Science+English+Nepali)/4.0f;
        System.out.println("The average marks of the student is:"+average);


        String result = (average >= 70) ? "First class" :
                        (average >= 60) ? "Upper second class" :
                        (average >= 50) ? "Second class" :
                        (average >= 40) ? "Third class" : "Failed";

        System.out.printf("You secured %.2f percent and you are a %s student! ",average,result);
        scanner.close();
    }
}
