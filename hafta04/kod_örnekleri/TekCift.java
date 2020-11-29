// sayının tek mi çift mi olduğunu gösteren program
import java.util.Scanner;

public class TekCift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int sayi = Integer.parseInt(input.nextLine());
// 1 != 0
        tekMi(sayi);

        System.out.println("PROGRAM BİTTİ");
    }

    static void tekMi(int sayı) {
        if (sayı % 2 != 0) {
            System.out.println("Girdiğiniz sayı tek!!!");
        } else {
            System.out.println("Girdiğiniz sayı çift!!");
        }
    }
}
