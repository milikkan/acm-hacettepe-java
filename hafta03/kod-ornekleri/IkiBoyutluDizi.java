import java.util.*;

public class IkiBoyutluDizi {
    public static void main(String[] args) {
        // Ahmet
        // Ayşe
        // Seda
        double[][] notlar = new double[3][5];
        // { {34, 56, 77, 88, 55},
        // {.....},
        // {1222} }
        String[] isimler = new String[] {"Ahmet", "Ayşe", "Seda"};

        Scanner input = new Scanner(System.in);
        System.out.println("Her öğrenci için 5 adet notu gir:");

        for (int i = 0; i < isimler.length; i++) {

            System.out.println(isimler[i] + " için notları gir:");

            for (int j = 0; j < 5; j++) {
                double not = input.nextDouble();
                notlar[i][j] = not;
            }
        }

        for (int i = 0; i < isimler.length; i++) {
            System.out.print(isimler[i] + " için girilen notlar: ");
            for (double not : notlar[i]) {
                System.out.print(not + " ");
            }
            System.out.println();
        }

    }
}
