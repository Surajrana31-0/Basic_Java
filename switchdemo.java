import java.util.*;

public class switchdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int button = sc.nextInt();
    
        switch(button) {
            case 1: 
                System.out.println("hello");
                break;
            case 2: 
                System.out.println("Ram Ram");
                break;
            default:
                System.out.println("Button not recognized");
                break;
        }
        
        sc.close();
    }
}
