import java.util.Scanner;

public class DoWhileOrnek {
    public static void main(String[] args) {
        int secim = 0;
        do {
            System.out.println("ATM'ye hoşgeldiniz");
            System.out.println("1. Bankacılık İşlemleri");
            System.out.println("2. Kredi Kartı İşlemleri");
            System.out.println("3. Çıkış");

            System.out.println();

            Scanner input = new Scanner(System.in);
            System.out.println("Menüden seçim yapın: ");
            secim = Integer.parseInt(input.nextLine());
        } while (secim > 3);


//        while (secim > 3) {
//            System.out.println("ATM'ye hoşgeldiniz");
//            System.out.println("1. Bankacılık İşlemleri");
//            System.out.println("2. Kredi Kartı İşlemleri");
//            System.out.println("3. Çıkış");
//
//            System.out.println();
//
//            System.out.println("Menüden seçim yapın: ");
//            secim = Integer.parseInt(input.nextLine());        }

        System.out.println(secim + " seçtiniz.");

    }
}
