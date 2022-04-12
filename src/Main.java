import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        int select;

        System.out.print("Birinci Sayiyi Giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("İkinci Sayiyi Giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");

        System.out.println("Seciniz: ");

        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sayilarin Toplami: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Sayilarin Farki: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Sayilarin çarpimi: " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Sayilarin Bolumu: " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Yanlis deger girdiniz!");
        }
    }
}
