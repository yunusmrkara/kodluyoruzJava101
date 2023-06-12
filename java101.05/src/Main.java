import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double yaricap, cevre, alan, pi, aci, dilimAlan;

        pi=3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz.....: ");
        yaricap= input.nextDouble();
        System.out.print("Daire Diliminin Merkez Açısının Ölçüsünü Giriniz.....: ");
        aci= input.nextDouble();

        System.out.println("Dairenin Yarıçapı.....: "+yaricap);

        cevre= 2*pi*yaricap;
        alan= pi*yaricap*yaricap;
        dilimAlan=alan*aci/360;

        System.out.println("Dairenin Çevresi.....: "+cevre);
        System.out.println("Dairenin Alanı.....: "+alan);
        System.out.print("Dairenin Diliminin Alanı.....: "+dilimAlan);
    }
}