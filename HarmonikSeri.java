import java.util.Scanner;
    public class HarmonikSeri {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Sayi giriniz: ");
            double sayi = input.nextDouble();

            double sonuc = 0;
            for (int i=1; i<=sayi; i++) {
                sonuc += ((double) 1/i);
            }

            System.out.println("Harmonik serinin sonucu: " + sonuc);
        }
}
