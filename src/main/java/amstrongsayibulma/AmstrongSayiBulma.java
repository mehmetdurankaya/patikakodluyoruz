package amstrongsayibulma;


import java.util.Scanner;

public class AmstrongSayiBulma {
    public static void main(String[] args) {
      
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");

        int number=scan.nextInt();
        int temp=number;
        int sayac=0;
        int pow;
        int basamakSayisi;
        int basamakDegeri;
        int total=0;

        while(temp!=0){
            temp/=10;
            sayac++;
        }
        basamakSayisi=sayac;
        temp=number;
        System.out.println("Sayı: " + temp);
        System.out.println("Basamak sayısı: " + sayac );

        while(temp!=0){
            basamakDegeri = temp % 10;
            pow=1;
            for (int i=0;i<basamakSayisi;i++){
                pow*=basamakDegeri;
            }
            total+=pow;
            temp/=10;
        }
        System.out.println("Basamakları toplamı: " + total );

        if(total==number){
            System.out.println("Sayı Amstrong sayıdır. " + number);
        }else {
            System.out.println("Sayı Amstrong sayı değildir. " + number);
        }
    }

}
