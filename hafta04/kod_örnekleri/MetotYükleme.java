public class MetotYükleme {
    public static void main(String[] args) {
        System.out.println(topla(3.5, 5.5));

        String str = "Merhaba. Ben Java öğreniyorum.";
        System.out.println(seperator(str));
        System.out.println(seperator(str, "*"));
        System.out.println(seperator(str, "blahblah"));

    }

    static String seperator(String str) {
        String[] kelimeler = str.split(" ");
        return String.join("-", kelimeler);
    }

    static String seperator(String str, String ayraç) {
        String[] kelimeler = str.split(" ");
        return String.join(ayraç, kelimeler);
    }

    static int topla(int a, int b) {
        return a + b;
    }

    static double topla(double a, double b) {
        return a + b;
    }
}
