public class StringBuilderOrnek {
    public static void main(String[] args) {
//        var str1 = "";
//
//        long zaman = System.nanoTime();
//        for (int i = 0; i < 1_000_000; i++) {
////            str1 += "a";
//            str1 = str1 + "a";
//        }
//        zaman = System.nanoTime() - zaman;
//        System.out.printf("Geçen zaman: %dms%n", (zaman / 1_000_000));
//
//        var sb = new StringBuilder("");
//        long zaman2 = System.nanoTime();
//        for (int i = 0; i < 1_000_000; i++) {
//            sb.append("a");
//        }
//        zaman2 = System.nanoTime() - zaman2;
//        System.out.printf("Geçen zaman2: %dms%n", (zaman2 / 1_000_000));

//        var str = "merhaba"; // abahrem
//
//        var sb = new StringBuilder(str);
//        System.out.println(sb.reverse());
//        var strTers = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            strTers += str.charAt(i);
//        }
//        System.out.println(strTers);
        var cümle = "ben ve ayşe java öğreniyoruz.";
        // kelimeli ayır
        // her bir kelimenin ilk harfini büyüt
        // kelimeleri birleştir
        String[] kelimeler = cümle.split(" ");
        for (int i = 0; i < kelimeler.length; i++) {
            String kelime = kelimeler[i];
            kelimeler[i] = capitalize(kelime);
        }
        cümle = String.join(" ", kelimeler);
        System.out.println(cümle);

        var str = "1234abcd56e";
        int count = 0;
        for (char harf : str.toCharArray()) {
            if (Character.isLetter(harf)) count++;
        }
        System.out.println("Harf sayısı : " + count);

        // interface, functional interface, stream, lambda ifadeleri
        long count2 = str.chars()
                .filter(Character::isLetter)
                .count();
        System.out.println(count2);
    }

    static String capitalize(String kelime) {
        return kelime.substring(0 ,1).toUpperCase() + kelime.substring(1);
    }

}
