import java.util.*;
public class Softwarica{
    public static void main(String[] args) throws Exception{
        Scanner scanner =new Scanner(System.in);
        int age=scanner.nextInt();
        if(age> 18){
            System.out.println(age +"  the adult person.");
        }else{
            System.out.println(age +" is not adult one.");
        }
        // System.out.println("Hello Boss\n");
        // System.out.print("My name is Suraj");
        scanner.close();
    }
}