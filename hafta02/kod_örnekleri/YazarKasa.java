// Satın alınan ürünlerin sayısını ve toplam fiyatını hesaplayan program
// döngü -1 girene kadar çalışır
import java.util.Scanner;

public class YazarKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fiyatları girin, işlem bitince -1 girin");

        double toplam = 0.0;
        double fiyat = 0.0;
        int urunAdedi = 0;

        while (true) {
            // fiyatı gir
            fiyat = Double.parseDouble(input.nextLine());
            // toplama ekle
            if (fiyat == -1) break;
            //toplam = toplam + fiyat;
            toplam += fiyat;
            urunAdedi += 1;
        }
        System.out.printf("%d adet ürün aldınız.", urunAdedi);
        System.out.printf("Toplam ödeme: %.2f", toplam);
    }
}
