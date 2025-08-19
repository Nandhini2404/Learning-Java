import java.util.Scanner;

public class AddNumberUsingScanner {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 1st Numbers: ");
        int num1= scanner.nextInt();
        
        System.out.println("Enter 2nd Numbers: ");
        int num2= scanner.nextInt();

        int sum= num1+num2;
        
        System.out.println("The Sum is: "+sum);
        
        scanner.close();
    }
}
