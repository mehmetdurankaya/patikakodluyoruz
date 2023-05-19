package amstrongsayibulma;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasamakSayisiniHesapla {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");

        int number=scan.nextInt();
        int temp=number, sayac=0, basamakSayisi,basamakDegeri,basamaklarToplam=0,total=0;

        while (temp!=0){
            temp/=10;
            sayac++;
        }
        basamakSayisi=sayac;
        temp=number;
        System.out.println("Girilene sayının basamak sayısı: " + sayac);

        while(temp!=0){
            basamakDegeri = temp % 10;
            basamaklarToplam+=basamakDegeri;
            temp/=10;
        }
        total=basamaklarToplam;
        System.out.println("Basamak sayıları toplamı: " + total);

    }

}




