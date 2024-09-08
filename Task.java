package oddevenchecker;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner eded1=new Scanner(System.in);
        System.out.println("add the first number:");
        int n=eded1.nextInt();
        Scanner eded2=new Scanner(System.in);
        System.out.println("add the second number:");
        int n2=eded2.nextInt();
        Scanner operator=new Scanner(System.in);
        System.out.println("add the operator:");
        char op=operator.next().charAt(0);
        String process=op=='*'?String.valueOf(n*n2):op=='/'?String.valueOf(n/n2):op=='+'?String.valueOf(n+n2):op=='-'?String.valueOf(n-n2):op=='%'?String.valueOf(n%n2):"you write false operation try again";
        System.out.println("result:"+process);
    }
}
