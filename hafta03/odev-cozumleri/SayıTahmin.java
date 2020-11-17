import java.util.Scanner;

public class SayıTahmin {
    public static void main(String[] args) {
        /*
        KODLAMA ADIMLARI
        1. 1-100 arası rastgele sayı oluştur
        2. Doğru olduğu sürece devam et
           2a. Kullanıcıdan tahmin al
           2a. tahmin ile tutulan sayıyı karşılaştır 
               - küçükse "ÇIK" yaz
               - büyükse "İN" yaz
               - aynı ise
                 * "Tebrikler yaz. .. deneme sonucu bildiniz" yaz
                 * döngüyü kır (break)
         */

        double rastgeleSayi = Math.random() * 100;
        int rastgeleSayiInt = (int) Math.ceil(rastgeleSayi);
        //System.out.println(rastgeleSayiInt);

        int sayac = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Sayıyı tahmin et: ");
            //int tahmin = Integer.parseInt(input.nextLine());
            int tahmin = input.nextInt();
            sayac += 1;

            if (tahmin < rastgeleSayiInt) {
                System.out.println("ÇIK");
            } else if (tahmin > rastgeleSayiInt) {
                System.out.println("İN");
            } else {
                System.out.println("Tebrikler, " + sayac + " adet tahminde buldunuz");
                break;
            }
        }
    }
}
