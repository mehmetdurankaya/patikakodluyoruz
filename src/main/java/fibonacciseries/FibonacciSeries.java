package fibonacciseries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1=0,num2=1,num3,i,number;
        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();
        System.out.print(num1+" "+num2);

        for(i=2;i<number;++i)
        {
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
        System.out.println();
    }

}


