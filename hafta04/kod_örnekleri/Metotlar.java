public class Metotlar {
    public static void main(String[] args) {
         merhaba("Bobby");// argüman
        System.out.println(merhaba2("John"));
    }

    static void merhaba(String isim) { // parametre
        System.out.println("Merhaba " + isim);
    }

    static String merhaba2(String isim) {
        return "Merhaba " + isim;
    }
}
