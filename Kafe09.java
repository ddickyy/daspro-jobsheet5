import java.util.Scanner;
/**
 * Kafe09
 */
public class Kafe09 {

    public static void main(String[] args) {
    Scanner kafe = new Scanner (System.in);

    String menu;
    char ukuranCup;
    int jumlah;
    boolean keanggotaan;

    System.out.print("Masukkan menu: ");
    menu = kafe.nextLine();
    System.out.println("Masukkan ukuran cup: ");
    ukuranCup = kafe.next().charAt(0);
    System.out.println("Masukkan jumlah: ");
    jumlah = kafe.nextInt();
    System.out.println("Masukkan keanggotaan (True/False): ");
    keanggotaan = kafe.nextBoolean();

    double hargaMenu = 0;

    switch (menu.toLowerCase()) {
        case "kopi" :
            hargaMenu = 12000;
            break;
        case "teh":
            hargaMenu = 7000;
            break;
        case "cokelat":
            hargaMenu = 20000;
            break;
        }
double totalHarga = hargaMenu * jumlah;
String ukuranBaru = Character.toString(ukuranCup);
    switch (ukuranCup) {
        case 'S' :
            break;
        case 'M' :
            totalHarga += 0.25 * totalHarga;
            break;
        case 'L' :
            totalHarga += 0.4 * totalHarga;
            break;
        default:
            ukuranBaru = "Size yang dipilih tidak tersedia";
        
    }
    double diskon = keanggotaan ? 0.1 : 0;
    double nominalBayar = totalHarga - (diskon * totalHarga);

    System.out.println("Item Pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranBaru);
    System.out.println("Nominal bayar: " + nominalBayar);

    }
}
