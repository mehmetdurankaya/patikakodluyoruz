package asalsayibul;

public class AsalSayiBul {
    public static void main(String[] args) {


        int i, j;
        boolean isAsal;

        System.out.println("1-100' e kadar olan Asal sayilar: ");

        for(i=2; i<=100; i++) {
            isAsal = true;
            for(j=2; j<i; j++) {
                if(i%j == 0) {
                    isAsal = false;
                    break;
                }
            }

            if(isAsal) {
                System.out.print(i + " ");
            }
        }
    }
}
