import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        /*To Take input from the user
         * To import scanner on the top of the file and add the followinf-----import java.util.Scanner;
         * Make object of import Scanner
         */
        Scanner scanner=new Scanner(System.in);
        //with the object we can take the input from the user
        System.out.print("Enter your roll:");
        int roll =scanner.nextInt();
        System.out.println("Your roll number is:"+roll);


        System.out.print("Are you adult:");
        boolean age =scanner.nextBoolean();
        System.out.println("You are:"+age);



        //NextInt(),nextBoolean(),nextDouble(),nextFloat()
        //the string data type holder take nextLine() to take a string input from the user.
        System.out.print("What is your name");
        scanner.nextLine();//To take a string data type add this  line.
        String name =scanner.nextLine();
        System.out.println("The name is:" +name);
        scanner.close();//Always use .close to avoid input lock 
    }
}
