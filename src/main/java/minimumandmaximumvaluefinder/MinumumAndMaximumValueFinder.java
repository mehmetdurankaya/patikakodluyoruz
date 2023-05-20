package minimumandmaximumvaluefinder;

import java.util.Scanner;

public class MinumumAndMaximumValueFinder {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int n,i=0,max=0,min=0;
        boolean isMax=true;


        int countNumber = 1;
        do {
            if(countNumber==0){
                System.out.println("Yanlış veri girişi yaptınız: ");
            }else{
                System.out.print("Kaç adet sayı gireceksiniz: ");
                countNumber = input.nextInt();
            }
        }while(countNumber < 0);


        while (i<countNumber){
            i++;
            System.out.println(i+".Sayıyı giriniz");
            int number=input.nextInt();
            if(isMax){
                max=number;
                min=number;
                isMax=false;
            }else{
                if(number>max){
                    max=number;
                }if (number<min){
                    min=number;
                }
            }
        }
        System.out.println("maximum sayı: " + max);
        System.out.println("minumum sayı: " + min);
    }
}
