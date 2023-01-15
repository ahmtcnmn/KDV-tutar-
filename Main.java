import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        double urun,tutar;
        System.out.printf("Lütfen ürün tutarınızı giriniz ; ");
        urun = input.nextDouble();
        tutar = (urun<1000)? urun*1.18 : urun*1.08 ;
        System.out.println("Ürün tutarınız : "+ urun);
        System.out.println("1000TL altı alışveriş KDV oranı %18. 1000TL üstü alışveriş KDV oranı %8");
        System.out.print("Alışveriş tutarınız : " + tutar);




    }
}