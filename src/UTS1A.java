import java.util.Scanner;
public class UTS1A {
    public static void main(String[] args) {

        String kodeBarang;
        String namaBarang;
        String quality;
        double harga;
        int jumlah;
        double totalHarga;


        Scanner input = new Scanner(System.in);


        System.out.print("Masukan kode barang: ");
        kodeBarang = input.nextLine();

        System.out.print("Masukan nama barang: ");
        namaBarang = input.nextLine();

        System.out.print("Masukan quality barang: ");
        quality = input.next();

        System.out.print("Masukan harga barang: ");
        harga = input.nextInt();

        System.out.print("Masukan jumlah : ");
        jumlah = input.nextInt();

        totalHarga = jumlah * harga;

        System.out.println("Kode barang: " + kodeBarang);
        System.out.println("Nama barang: " + namaBarang);
        System.out.println("Quality: " + quality);
        System.out.println("Harga: " + harga);
        System.out.println("Total harga: " + totalHarga);

    }
}
