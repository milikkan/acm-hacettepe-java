// döngü örnekleri
public class WhileOrnek {
    public static void main(String[] args) {
        // 1'den 10'a kadar sayıları yaz
        int sayac = 1; // kontrol değişkeni
        System.out.println("While döngüsü örnekleri");
        while (sayac <= 10) { // şart
//            if ((sayac % 3 == 0) || (sayac % 5 == 0)) {
//                System.out.println(sayac); // işlem
//            }
            if (sayac != 5) {
                System.out.println(sayac);
            }
            sayac = sayac + 1; // artırma
        }

        // for döngüsü ile
        System.out.println("for döngüsü örnekleri");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        System.out.println("---PROGRAM SONU---");
    }
}
