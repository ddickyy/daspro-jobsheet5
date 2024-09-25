import java.util.Scanner;
/**
 * PemilihanBilangan09
 */
public class PemilihanBilangan09 {

    public static void main(String[] args) {
        
    Scanner bil = new Scanner (System.in);

    System.out.print("Masukkan sebuah angka: ");
    int angka = bil.nextInt();
    String hasil;
    
    hasil = (angka % 2 == 0) ? " termasuk bilangan genap" : " termasuk bilangan ganjil";

    System.out.println(angka + hasil);
    }
}