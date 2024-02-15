import java.util.Scanner;

public class Tugas1_10522014_ArifNurRamadhan {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // INPUT
        System.out.println("============INPUT============");
        System.out.print("Masukan Nama Barang : "); var namaBarang = scan.nextLine();
        System.out.print("Masukan Harga Beli : "); var hargaBarang = scan.nextInt();
        System.out.print("Masukan jumlah Barang : "); var jumlahBarang = scan.nextInt();

        // OUTPUT
        System.out.println("============OUTPUT============");
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Beli : " + hargaBarang);
        System.out.println("Jumlah Barang : " + jumlahBarang);
        System.out.println("SubTotal : " + (hargaBarang * jumlahBarang));


    }
}
