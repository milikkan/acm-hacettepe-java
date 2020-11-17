public class Faktoriyel {
    public static void main(String[] args) {
        int sayi = 1;
        // 5 * 4 * 3 * 2 * 1 = 120

        int sonuc = sayi;

        while (sayi > 1) {
            sayi -= 1;
            sonuc *= sayi;
        }

        System.out.println("Sonuç: " + sonuc);
        // sayıdan 1 çıkar
        // bir önceki sonuçla çarp
    }
}
