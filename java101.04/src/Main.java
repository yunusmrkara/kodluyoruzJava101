import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       int km;
       double perKM,total,startPrice;

       perKM=2.20;
       startPrice=10;

       Scanner input = new Scanner(System.in);
       System.out.print("Mesafeyi km cinsinden giriniz.....: ");
       km=input.nextInt();

       total = km*perKM;
       total +=startPrice;

       total = (total<20) ? 20 : total;
       int totalInt= (int)total;

       System.out.println("Toplam ücret.....: "+ totalInt + "  Türk Lirası'dır.");
    }
}