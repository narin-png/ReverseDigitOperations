package taskexamples;

import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int number=sc.nextInt();
        int length=String.valueOf(number).length();
        int reversedSum=0;
        for(int i=0;i<length;i++){
            int s=(int)Math.pow(10,i);
            int reversedPower=(int)Math.pow(10,length-1-i);
            System.out.println("normal power:"+s);
            System.out.println("reversedpower:"+reversedPower);
            int b=(number/s)%10;
            System.out.println("extracted number:"+b);
            reversedSum+=reversedPower*b;
            System.out.println("final answer:"+reversedSum);
            }

    }
}
