import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        double fiyat;
        double kdvlifiyat;
        double kdvtutari1=0.18;
        double kdvtutari2=0.08;

        Scanner input= new Scanner(System.in);

        System.out.print("Tutarı Giriniz.....:");
        fiyat= input.nextDouble();


        /*int deger=1000;
        boolean gerekenkdv=(fiyat<1000);
        double kdv= gerekenkdv ? kdvtutari1 : kdvtutari2;
        */

        double kdv;
        kdv= (0<fiyat && fiyat<1000) ? kdvtutari2 : kdvtutari1;

        kdvlifiyat=fiyat+fiyat*kdv;

        System.out.println("KDV'siz Fiyat.....:"+fiyat);
        System.out.println("KDV'li Fiyat.....:"+kdvlifiyat);
        System.out.println("KDV Tutarı.....:"+fiyat*kdv);
        System.out.println("KDV Oranı.....:"+kdv);
    }

}