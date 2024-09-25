import java.util.Scanner;

public class TaskIo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the mark obtained in oop:");
        int oop= scanner.nextInt();
        //System.out.println("Marks obtained in oop is:"+oop);

        System.out.print("Enter the mark obtained in database:");
        int database=scanner.nextInt();
        //System.out.println("The mark obtained in database is:"+database);

        System.out.print("Enter the mark obtained in architecture:");
        int architecture=scanner.nextInt();
        //System.out.println("The mark obtained in architecture is;"+architecture);


        int average=(oop+database+architecture)/3;
        System.out.println("The average marking is:"+average);


         // String result is used to check if the average marking is greater than 40 or not
         String result = (oop > 40 && database > 40 && architecture > 40) ? "Good job" : "Bad job";
        
         //Printf is used to print the given output.
         System.out.printf("Your average marking is %d and you have done a %s\n", average, result);


        scanner.close();

    }
}
