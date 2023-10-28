import java.util.Scanner;

public class ThirdFile {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        System.out.println("CALCULATOR");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is : " + (num1 + num2));
        System.out.println("Sum is : " + sum);
    }
}


//  + : sum
//  - : diff
//  * : product
//  / : quotient
//  % : rem