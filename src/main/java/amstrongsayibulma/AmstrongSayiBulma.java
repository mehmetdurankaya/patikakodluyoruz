package amstrongsayibulma;import java.util.Scanner;public class AmstrongSayiBulma {    public static void main(String[] args) {        Scanner scan=new Scanner(System.in);        System.out.print("Bir sayı giriniz: ");        int number=scan.nextInt();        int temp=number, sayac=0, us,basamakSayisi,basamakDegeri=0,basamaklarToplam=0,total=0;        while (temp!=0){            temp/=10;            sayac++;        }        basamakSayisi=sayac;        temp=number;        System.out.println("Sayı: " + temp);        System.out.println("Basamak sayısı: " + sayac );        while(temp!=0){            basamakDegeri = temp % 10;            us=1;            for (int i=0;i<basamakSayisi;i++){                us*=basamakDegeri;            }            total+=us;            temp/=10;        }        System.out.println("Basamakları toplamı: " + total );        if(total==number){            System.out.println("Sayı Amstrong sayıdır. " + number);        }else {            System.out.println("Sayı Amstrong sayı değildir. " + number);        }    }}