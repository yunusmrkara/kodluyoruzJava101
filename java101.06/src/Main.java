import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double boy, vucutKitleIndeksi;
       int  kilo;

       Scanner input = new Scanner (System.in);

       System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz.....: ");
       boy= input.nextDouble();

       System.out.print("Lütfen kilonuzu giriniz.....: ");
       kilo= input.nextInt();

       vucutKitleIndeksi= kilo/(boy*boy);
       System.out.print("Vücut Kitle İndeksiniz.....:"+vucutKitleIndeksi);

    }
}