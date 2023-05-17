package getexponentialnumbers;

import java.util.Scanner;

public class GetExponentialNumbers {
    public static void main(String[] args) {
        int result=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi=scan.nextInt();
        System.out.print("Üs olacak sayı giriniz: ");
        int usOlacakSayi=scan.nextInt();

        System.out.println("Girilen sayı: "+ sayi);
        System.out.println("--------------------------------------");
        for(int i=1;i<=usOlacakSayi;i++){
            result=result*sayi;
            System.out.println( i+".kuvveti: "+ " "  + result);
        }
        System.out.println("--------------------------------------");

    }
}
