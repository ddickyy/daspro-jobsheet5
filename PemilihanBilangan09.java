import java.util.Scanner;
/**
 * PemilihanBilangan09
 */
public class PemilihanBilangan09 {

    public static void main(String[] args) {
        
    Scanner bil = new Scanner (System.in);

    System.out.print("Masukkan sebuah angka: ");
    int angka = bil.nextInt();

    if (angka % 2 == 0)
    {
        System.out.println("Angka " +angka + " termasuk bilangan ganjil");
    }
    else 
    {
        System.out.println("Angka " +angka + " termasuk bilangan ganjil");
    }
    }
}