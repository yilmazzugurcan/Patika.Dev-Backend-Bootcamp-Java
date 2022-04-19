import java.util.Scanner;
public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r, nfact = 1, rfact = 1, ffact = 1, f = 1;
        double C;

        System.out.print("Kombinasyonu hesaplanacak kümenin eleman sayısını giriniz : ");
        n = inp.nextInt();
        System.out.print(n +" elemanlı kümenin kombinasyonu hesaplanacak altküme sayısını giriniz : ");
        r = inp.nextInt();

        if (n >= r) {
            f = n - r;
            for (int i = 1; i <= n; i++) nfact *= i;
            for (int j = 1; j <= r; j++) rfact *= j;
            for (int k = 1; k <= f; k++) ffact *= k;
        }

        C=nfact/(rfact*ffact);
        System.out.println(n + "'in "+r +"'li komibinasyonu : "+ C );
    }
}
