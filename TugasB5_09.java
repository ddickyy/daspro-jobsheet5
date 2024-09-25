import java.util.Scanner;
/**
 * TugasB5_09
 */
public class TugasB5_09 {

    public static void main(String[] args) {
    Scanner umur = new Scanner (System.in);
    String kategori;

    System.out.println("Masukkan usia Anda (tahun): ");
    int usia = umur.nextInt();

    if (usia >=65) {
        System.out.println("Usia Anda " +usia + " tahun "+"dan Anda dikategorikan sebagai Lansia");
    } else if (usia >= 20 && usia <65) {
        System.out.println("Usia Anda " +usia +" tahun " +"dan Anda dikategorikan sebagai Dewasa");
    } else if (usia >=13 && usia <=19) {
        System.out.println("Usia Anda " +usia + " tahun " +"dan Anda dikategorikan sebagai Remaja");
    } else if (usia >=0 && usia<=12) {
        System.out.println("Usia Anda " +usia + " tahun " +"dan Anda dikategorikan sebagai Anak");
    } else {
        System.out.println("Input tidak valid ");
    }
    }
}