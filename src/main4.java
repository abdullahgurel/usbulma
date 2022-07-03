import java.util.Scanner;
public class main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k;
        System.out.print("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.print("Üs alacak sayı: ");
        k = input.nextInt();
        int total = 1;
        // 3^4 = 3*3*3*3;

        for(int i = 1;i<=k;i++) {

            total = total*n;


        }

        System.out.println(total);

/*
        // while döngüsü

        int i = 1;
        int total = 1;
        while  (i <=k) {
        total *=n;
        i++;

        }

        System.out.println(total);
*/


    }
}
