import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter Username :");
        String username = inp.next();

        System.out.println("Enter Password :");
        String password = inp.next();

        if (username.equals("ugurcan") && password.equals("yilmaz"))
            System.out.println("Passed");
        else
            System.out.println("Not correct");
    }

}
