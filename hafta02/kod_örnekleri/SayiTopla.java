// kullanıcıdan alınacak 2 sayıyı toplayıp gösteren program
import java.util.Scanner;

public class SayiTopla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        1. Hoşgeldin mesajını ekrana yaz
        System.out.println("Toplama programına hoşgeldin!");
//        2. Birinci sayıyı kullanıcıdan al
        System.out.println("İlk sayıyı gir:");
//        3. Kullanıcıdan alınan sayıyı ilkSayi isimli String değişkene
//                kaydet
        int ilkSayi = Integer.parseInt(input.nextLine());
        //int ilkSayiInt = Integer.parseInt(ilkSayi);
//        4. İkinci sayıyı kullanıcıdan al
//        5. Kullanıcıdan alınan sayıyı ikinciSayi isimli String değişkene
//                kaydet
        System.out.println("İkinci sayıyı gir:");
        String ikinciSayi = input.nextLine();
        int ikinciSayiInt = Integer.parseInt(ikinciSayi);
//        6. İlkSayi ve ikinciSayi değişkenlerini topla ve sonucu ekrana
//        yaz.
        int toplam = ilkSayi + ikinciSayiInt;

        System.out.println("Girilen sayıların toplamı " + toplam);
    }
}
