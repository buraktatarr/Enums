import java.util.Scanner;

public class CalismaProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir gün girin (örn: MONDAY): ");
        String girilenGun = scanner.nextLine().toUpperCase(); // küçük/büyük farkı kapatmak için

        try {
            Day secilenGun = Day.valueOf(girilenGun); // Enum sabitine çevir
            System.out.println(secilenGun + " günü çalışma saati: " + secilenGun.getCalismaSaati());
        } catch (IllegalArgumentException e) {
            System.out.println("Geçersiz gün girdiniz. Lütfen İngilizce gün isimlerinden birini yazınız (örneğin: MONDAY).");
        }

        scanner.close();
    }
}
