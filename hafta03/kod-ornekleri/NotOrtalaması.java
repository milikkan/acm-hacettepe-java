import java.util.Arrays;
import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {
        // ortalama = toplam / eleman sayısı
        double toplam = 0.0;
        double[] notlar = new double[5];
        Scanner input = new Scanner(System.in);
        System.out.println("5 adet notu gir:");

        for (int i = 0; i < 5; i++) {
            double not = input.nextDouble();
            toplam += not;
            notlar[i] = not;
        }
        double ortalama = toplam / 5;
        System.out.print("Girilen notlar: ");

//        for (int i = 0; i < 5; i++) {
//            System.out.print(notlar[i] + " ");
//        }

        for (double not : notlar) {
            System.out.print(not + " ");
        }

        // en büyüğü bul
        double maxNot = notlar[0];
        for (double siradakiNot: notlar) {
            if (siradakiNot > maxNot) {
                maxNot = siradakiNot;
            }
        }
        Arrays.sort(notlar);
        System.out.printf("En yüksek not %.2f", notlar[notlar.length - 1]);

        //System.out.printf("\nNotların ortalaması %.2f", ortalama);
        //System.out.printf("\nEn yüksek not %.2f", maxNot);
    }
}
