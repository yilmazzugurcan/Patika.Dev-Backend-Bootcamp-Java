import java.util.Scanner;

public class VucutKitleEndeks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu(Metre cinsinden) Giriniz :");
        double boy = input.nextDouble();

        System.out.println("Lütfen Kilonuzu Giriniz :");
        double kilo = input.nextDouble();

        double endeks = kilo / (boy*boy);
        System.out.println("\nEndeks = " + endeks);

    }



}
