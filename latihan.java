import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        double hargaAwal, diskon, jumlahBarang, hasil;

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Harga Awal                :");
        hargaAwal = scan.nextDouble();
        System.out.println("Masukkan Diskon%                   :");
        diskon = scan.nextDouble();
        System.out.println("Masukkan Jumlah Barang yang Dibeli : ");
        jumlahBarang = scan.nextDouble();

        hasil= (hargaAwal-(hargaAwal*diskon/100))*jumlahBarang;
        System.out.println("Harga Akhir Adalah                   :" +hasil);


    }
}
