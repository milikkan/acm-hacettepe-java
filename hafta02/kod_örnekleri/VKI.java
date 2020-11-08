// vücut kitle indeksi hesaplayan program
public class VKI {
    public static void main(String[] args) {
        double kilo = 55;
        double boy = 1.85; // 21.9

        double vki = kilo / (boy * boy);

        /*
        - < 18.5 : zayıf
        - >= 18.5 – < 25 : normal
        - >=25 – < 30: fazla kilolu
        - >=30: obezite
         */

        if (vki < 18.5) {
            System.out.println("zayıf");
        } else if ((vki >= 18.5) && (vki < 25)) {
            System.out.println("normal");
        } else if (vki >= 25 && vki < 30) {
            System.out.println("fazla kilolu");
        } else {
            System.out.println("obezite");
        }

        //System.out.println(vki);

    }
}
