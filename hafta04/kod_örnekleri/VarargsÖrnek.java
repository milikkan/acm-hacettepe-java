public class VarargsÖrnek {
    public static void main(String ... args) {
        //selamla("Günaydın", "Ali", "Ahmet", "Ayşe", "Fatma");
        double ort = notOrtalaması();
        System.out.printf("Ortalama: %.2f", ort);
    }

    static void selamla(String selam, String ... isimler) {
        for (String isim : isimler) {
            System.out.println(selam + " " + isim);
        }
    }

    static double notOrtalaması(double ... notlar) {
        double toplam = 0.0;
        for (double not : notlar) {
            toplam += not;
        }
        return (toplam == 0) ? 0 : toplam / notlar.length;
    }
}
