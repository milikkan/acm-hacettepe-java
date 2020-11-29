public class StringDeneme {
    public static void main(String[] args) {
    /*    String str = "%d + %d = %d";
        String sonuc = String.format(str, 3, 5, 8);
        System.out.println(sonuc);

        System.out.printf("Merhaba %s%n", "dünya");*/

/*        String str = "Merhaba. Ben Java öğreniyorum.";
        String[] kelimeler = str.split(" ");
        String sonuç = String.join("-", kelimeler);

        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }

        System.out.println(sonuç);*/

        /*String str = "den3em6e";
        System.out.println("1.harf: " + str.charAt(0));

        for (char harf : str.toCharArray()) {
            if (Character.isLetter(harf))
                System.out.println(harf);*/

        String str = "yeşil";
        // y ye yeş yeşi yeşil (0, 1) (0, 2) (0, 3) (0, 4) (0, 5)
        // e eş eşi eşil (1, 2) (1, 3) (1, 4) (1, 5)
        // ş şi şil
        // i il
        // l
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                System.out.println(str.substring(i, j));
            }
        }
// char
// Character

    // tüm alt dizilerini bul


    }
}
