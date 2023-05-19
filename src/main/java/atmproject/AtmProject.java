package atmproject;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {

        String userName, pasword;

        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;


        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            pasword = input.nextLine();
            if (userName.equals("patika") && pasword.equals("dev123")) {
                System.out.println("Merhaba Patika Bank' a hoş geldiniz. " + userName.toUpperCase());
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz. ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Para Miktarı : ");
                            price = input.nextInt();

                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {

                                System.out.println("Kalan bakiyeniz: " + (balance -= price));
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }

                    System.out.println("***************************************");
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere." + userName.toUpperCase());
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre tekrar deneyiniz. ");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lüfen banka ile iletişime geçiniz. ");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }

        }

    }

}