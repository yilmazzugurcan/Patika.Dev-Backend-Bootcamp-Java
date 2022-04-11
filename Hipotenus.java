import java.util.Scanner;

public class Hipotenus {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İşlemi seçin : Alan veya Hipotenus");
        String islem = input.nextLine();

        if (islem.equals("Alan")){
            System.out.println("Alan yazıldı");

            float a,b,c;

            System.out.println("A Uzunluğunu Giriniz : ");
            a = input.nextFloat();

            System.out.println("B Uzunluğunu Giriniz : ");
            b = input.nextFloat();

            System.out.println("C Uzunluğunu Giriniz : ");
            c = input.nextFloat();

            double u = ((a+b+c)/2.0);
            double cevre = (2*u);
            double alan  = Math.sqrt(u * (u - a)* (u - b) * (u - c));

            System.out.println("Çevre = " + cevre + "\nAlan = " + alan);

        }else if (islem.equals("Hipotenus")){

            System.out.println("Hipotenus Yazıldı");

            float a,b;

            System.out.println("A Uzunluğunu Giriniz : ");
            a = input.nextFloat();

            System.out.println("B Uzunluğunu Giriniz : ");
            b = input.nextFloat();

            double c = Math.sqrt((a*a)+(b*b));

            System.out.println("Hipotenüs = " + c);

        }else {
            System.out.println("Yanlış İşlem");
        }
    }
}