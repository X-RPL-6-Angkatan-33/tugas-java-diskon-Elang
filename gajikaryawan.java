import java.util.Scanner;

public class gajikaryawan {
    public static void main(String[] args) {
        double jamKerja, tarif, pajak, hasil, hasil2;

         Scanner scan = new Scanner(System.in);
         System.out.println("Masukkan Tarif Per Jam : ");
         tarif = scan.nextDouble();
         System.out.println("Masukkan Jam Kerja     : ");
         jamKerja = scan.nextDouble();
         System.out.println("Dipotong pajak 10%");
         
         hasil = tarif*jamKerja;
         hasil2 = hasil-(hasil*10/100);
         System.out.println("Gaji Bruto Karyawan Adalah?Hari         : "+hasil);
         System.out.println("Gaji bersih Yang Diterima Karyawan/Hari : "+hasil2);


    }
}
