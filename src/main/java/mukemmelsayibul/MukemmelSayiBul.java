package mukemmelsayibul;

import java.util.Scanner;

public class MukemmelSayiBul {
    public static void main(String[] args) {

        int number,i=1,sayac=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = scan.nextInt();

        while(i<number) {
            if(number%i == 0){
                sayac+=i;
            }
            i++;
        }
        if(sayac == number){
            System.out.print("Sayı: " + number + " Mükemmel sayıdır.");
        }
        else{
            System.out.print("Sayı:  " + number +" Mükemmel sayı değildir. ");
        }
    }
}
