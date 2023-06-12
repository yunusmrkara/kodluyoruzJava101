import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kenar1, kenar2, kenar3, cevre, alan;


        Scanner girdi = new Scanner(System.in);

        System.out.print("1.kenar uzunluğu.....:");
        kenar1 = girdi.nextDouble();

        System.out.print("2.kenar uzunluğu.....:");
        kenar2 = girdi.nextDouble();

        System.out.print("3.kenar uzunluğu.....:");
        kenar3 = girdi.nextDouble();

        cevre = (kenar1 + kenar2 + kenar3) / 2;
        alan = Math.sqrt(cevre * (cevre - kenar1) * (cevre - kenar2) * (cevre - kenar3));

        System.out.print("Üçgenin Alanı.....:" + alan);
    }
}