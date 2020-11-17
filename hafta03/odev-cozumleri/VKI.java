/*
 Vücut Kitle İndeksi hesaplama programı

 formül : kilo / (boy * boy);
 kurallar:
         < 18.5 : zayıf
         >= 18.5 – < 25 : normal
         >=25 – < 30: fazla kilolu
         >=30: obezite
 */
public class VKI {
    public static void main(String[] args) {
        // sabit değerler ile çalıştır
        double kilo = 55;
        double boy = 1.80;

        // formülü tanımla
        double vki = kilo / (boy * boy);

        // sonucu bul
        if (vki < 18.5) {
            System.out.println("zayıf");
        } else if ((vki >= 18.5) && (vki < 25)) {
            System.out.println("normal");
        } else if (vki >= 25 && vki < 30) {
            System.out.println("fazla kilolu");
        } else {
            System.out.println("obezite");
        }

        // sonucu ekrana yaz
        System.out.printf("VKİ: %.2f%n", vki);

        /* ödev çözümü:
           normal altında veya üstünde çıkarsa ne kadar kilo alınması veya verilmesi
           gerektiğini hesapla
        */
        if (vki < 18.5) {
            double minimumKilo = 18.5 * boy * boy;
            double fark = minimumKilo - kilo;
            System.out.printf("Almanız gereken minimum kilo %.2f", fark);
        }
        if (vki > 25) {
            double maksimumKilo = 25 * boy * boy;
            double fark = kilo - maksimumKilo; // fark isimli değişken tekrar tanımlanabiliyor çünkü farklı skopta.
                                               // yeni blok yeni bir skop oluşturur
            System.out.printf("Vermeniz gereken minimum kilo %.2f", fark);
        }

    }
}
