package tersucgencizimi;

import java.util.Scanner;

public class TersUcgenCizim {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int number=scan.nextInt();

        for(int i=1;i<number;i++) {
            for(int k=1;k<=(number-i);k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
