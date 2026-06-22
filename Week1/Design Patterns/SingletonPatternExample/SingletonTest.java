import java.util.Scanner;

public class SingletonTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a message1 to log:");
        String str1 = sc.nextLine();

        System.out.println("Enter a message2 to log:");
        String str2 = sc.nextLine();

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        logger1.log(str1);
        logger2.log(str2);

        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Multiple instances exist.");
        }
    }
}