package harmonikseri;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n=scan.nextInt();
        double result=0.0;
        for(double i=1;i<=n;i++){
            result+=(1/i);

        }
        System.out.println("sonuc: " + result);
    }
}
