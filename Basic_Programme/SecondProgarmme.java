import java.util.Scanner;

public class SecondProgarmme {
    public static void main(String[] args) {
        System.out.println("Hiii There");
        // System.out.println("Enter num of type : int");
        Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();
        // System.out.println("Integer Number entered is " + num);
        // System.out.println("Enter num of type : float");
        // float num2 = scan.nextFloat();
        // System.out.println("Float Number entered is " + num2);
        // System.out.println("Enter char");
        // String a = scan.next();
        // char single_char = a.charAt(5);
        // System.out.println("Char is " + single_char);
        // System.out.println("Enter name");
        // String name = scan.next();
        // System.out.println("Name is " + name);
        // System.out.println("Enter name _ 2 ");
        // String name2 = scan.next();
        // System.out.println("Name is " + name2);
        System.out.println("Enter fullname");
        String fullname = scan.nextLine();
        System.out.println("Are u married");
        boolean marry = scan.nextBoolean();
        System.out.println("Name is " + fullname);
        System.out.println("I'm " + marry);
        scan.close();
    }
}


// Task:
// user credentials (input) : 
// name
// roll Number
// age
// contact
// address
// mail

// User Credentials Are : 
// Name         : Sevy Singh
// Roll No      : 5145
// Age          : 30
// Male         : f
// Contact      : 8495623458
// Address      : New Delhi, India
// Mail         : sevysingh@gmail.com