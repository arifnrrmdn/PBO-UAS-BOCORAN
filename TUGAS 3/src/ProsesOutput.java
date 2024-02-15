public class ProsesOutput extends SubTotal{

        public ProsesOutput(String paramNamaBarang, int paramHargaBarang, int paramJumlahBarang){
    
             // OUTPUT
             System.out.println("============OUTPUT============");
             System.out.println("Nama Barang : " + paramNamaBarang);
             System.out.println("Harga Beli : " + paramHargaBarang);
             System.out.println("Jumlah Barang : " + paramJumlahBarang);
             System.out.println("SubTotal : " + menghitungSubTotal(paramHargaBarang, paramJumlahBarang));
    
    }
    
    
}
