public class SwitchOrnek {
    public static void main(String[] args) {
        int secim = 1;
        // 1 Pazartesi
        // 2 salı
        // 3 çarşamba
        // ...7 pazar
        switch (secim) {
            case 1:
                System.out.println("Pazartesi");
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            default:
                System.out.println("Tanımsız gün...");
                break;
        }
    }
}
