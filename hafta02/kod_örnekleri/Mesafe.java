// 2 boyutlu bir düzlem üzerindeki iki nokta arasındaki mesafeyi hesaplayan program
// ilk nokta koordinatları: x1, y1
// ikinci nokta koordinatları: x2, y2
public class Mesafe {
    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 2;
        int x2 = 1;
        int y2 = 4;
        //int x1 = 5, x2 = 1, y1 = 2, y2 = 4;

        // [(x2 -x1)^2 + (y2 - y1)^2]
        // mesafeyi hesapla
        //int x1Kare = (x2 - x1) * (x2 - x1);
//        double x1Kare = Math.pow((x2 - x1), 2);
//        double y1Kare = Math.pow((y2 - y1), 2);
//        double mesafe = Math.sqrt(x1Kare + y1Kare);
        double mesafe = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        // ekrana göster
        //System.out.println("Mesafe= " + mesafe);
        System.out.printf("Mesafe=%.2f", mesafe);
    }
}
