package oddevenchecker;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner number1=new Scanner(System.in);
        System.out.println("add the first number:");
        int n=number1.nextInt();
        Scanner number2=new Scanner(System.in);
        System.out.println("add the second number:");
        int n2=number2.nextInt();
        Scanner operator=new Scanner(System.in);
        System.out.println("add the operator:");
        char op=operator.next().charAt(0);
        String process=op=='*'?String.valueOf(n*n2):op=='/'?String.valueOf(n/n2):op=='+'?String.valueOf(n+n2):op=='-'?String.valueOf(n-n2):op=='%'?String.valueOf(n%n2):"you write false operation try again";
        System.out.println("result:"+process);
    }
}
