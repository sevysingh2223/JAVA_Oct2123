package Recursion;

import java.util.Scanner;

public class Powerof2 {
    static int count =0;
    static boolean isPower(int n, int x){
        if(n==1){
            return true;
        }

        if(n%x != 0){
            return false;
        }
        else{
            count++;
            return isPower(n/x, x);
        }
    }
    public static void main(String[] args) {
        System.out.println("ENTER NUMBER");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("ENTER THE POWER OF");
        int x = scanner.nextInt();

        if(isPower(n, x)){
            System.out.println(count);
        }
        else{
            System.out.println("Incorrect Data");
        }
        
    }
}
