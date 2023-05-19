package ebobekok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n1=scan.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int n2=scan.nextInt();
        int i=1,k=1;
        int EBOB=1;
        int EKOK=1;
        while (i<=n1){
            if(n1%i==0 && n2%i==0){
                EBOB=i;
            }
            i++;
        }
        System.out.println("Ortak Bölenlerin En Büyüğü: " + EBOB);

        while (k<=(n1*n2)/EBOB){
            if(k%n1==0 && k%n2==0){
                EKOK=k;
            }
            k++;
        }
        System.out.println("Ortak Bölenlerin En küçüğü: " + EKOK);

    }
}
