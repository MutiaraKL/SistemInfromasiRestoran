import java.time.temporal.JulianFields;
import java.util.*;

public class DataPesanan {
    private String id, namaCustomer, list_makanan, list_minuman;
    private int jumlah_makanan, jumlah_minuman, total_belanja, harga_makanan, harga_minuman;
    private static int Pendapatan;

    static Vector<DataPesanan> vecpesanan = new Vector<DataPesanan>();

    public DataPesanan(String id, String namaCustomer, String list_makanan, String list_minuman) {
        this.setId(id);
        this.setNamaCustomer(namaCustomer);
        this.setList_makanan(list_makanan);
        this.setList_minuman(list_minuman);
        this.setJumlah_makanan(jumlah_makanan);
        this.setJumlah_minuman(jumlah_minuman);
        this.setTotal_belanja(total_belanja);
        this.setHarga_makanan(harga_makanan);
        this.setHarga_minuman(harga_minuman);
        this.setPendapatan(getTotal_belanja());
    }

    public DataPesanan(int jumlah_makanan, int jumlah_minuman, int total_belanja) {
        this.setJumlah_makanan(jumlah_makanan);
        this.setJumlah_minuman(jumlah_minuman);
        this.setTotal_belanja(total_belanja);
        this.setHarga_makanan(harga_makanan);
        this.setHarga_minuman(harga_minuman);
    }

    // CRUD

    public static int getPendapatan() {
        return Pendapatan;
    }

    public void setPendapatan(int pendapatan) {
        Pendapatan = pendapatan;
    }

    public int getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(int harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    public int getHarga_minuman() {
        return harga_minuman;
    }

    public void setHarga_minuman(int harga_minuman) {
        this.harga_minuman = harga_minuman;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public String getList_makanan(){
        return list_makanan;
    }

    public void setList_makanan(String list_makanan){
        this.list_makanan = list_makanan;
    }

    public String getList_minuman(){
        return list_minuman;
    }

    public void setList_minuman(String list_minuman){
        this.list_minuman = list_minuman;
    }

    public int getJumlah_makanan(){
        return jumlah_makanan;
    }

    public void setJumlah_makanan(int jumlah_makanan){
        this.jumlah_makanan = jumlah_makanan;
    }

    public int getJumlah_minuman(){
        return jumlah_minuman;
    }

    public void setJumlah_minuman(int jumlah_minuman){
        this.jumlah_minuman = jumlah_minuman;
    }

    public int getTotal_belanja(){
        return total_belanja;
    }

    public void setTotal_belanja (int total_belanja){
        this.total_belanja = total_belanja;
    }

    public static Vector<DataPesanan> getVecpesanan(){
        return vecpesanan;
    }

    public static void setVecpesanan (Vector<DataPesanan> vecpesanan){
        DataPesanan.vecpesanan = vecpesanan;
    }

    public static DataPesanan getPesan(){
        return pesan;
    }

    public static void setPesan(DataPesanan pesan){
        DataPesanan.pesan = pesan;
    }

    static DataPesanan pesan;
    static DataMakanan makan;

    public static void printDataPesanan(Scanner input, Scanner initiale){
        System.out.println("======= Kelola Data Pesanan =======");
        System.out.print("\n");
        System.out.println(" Data Pesanan :");
        System.out.println("============================================================================================================================");
        System.out.println("| ID | Nama\t| Makanan\t | Minuman\t| Jumlah makanan\t| Jumlah minuman\t| Harga makanan\t| Harga minuman\t| Total belanja\t|");
        System.out.println("============================================================================================================================");

        for (DataPesanan pesan : pesan.vecpesanan){
            System.out.println("|>" + pesan.getId() + " |>" + pesan.getNamaCustomer() + " |>" + pesan.getList_makanan() + "\t\t|" + pesan.getList_minuman() + "\t\t|" + pesan.getJumlah_makanan() + "\t\t|" + pesan.getJumlah_minuman() + "t\t|" + pesan.getTotal_belanja());
        }

        if (pesan.vecpesanan.size()==0){
            System.out.println("|\t\t Tidak ada data\t\t |");
        }
        System.out.println("|___________________________________________________________________________________________________________________________|");
        System.out.println("============================================================================================================================");
    }

    public static void tambahDataPesanan(Scanner input, Scanner initiale){
        String id, namaCustomer, list_makanan, list_minuman;
        int jumlah_makanan, jumlah_minuman, total_belanja, harga_makanan, harga_minuman;
        System.out.println("=======Kelola Data Pesanan=======");
        System.out.print("\n");
        System.out.println("-------Tambah Data Pesanan-------");
        System.out.print("Id pesanan : ");
        id = initiale.nextLine();
        System.out.println("Nama customer");
        namaCustomer = initiale.nextLine();

        DataMakanan.printDataMakanan(input, initiale);
        System.out.println("Masukkan nama makanan : ");
        list_makanan = initiale.nextLine();
        System.out.println("Masukkan harga makanan : ");
        harga_makanan = initiale.nextInt();
        System.out.println("Jumlah makanan : ");
        jumlah_makanan = initiale.nextInt();

        DataMinuman.printDataMinuman(input, initiale);
        System.out.println("Masukkan nama minuman : ");
        list_minuman = initiale.nextLine();
        System.out.println("Masukkan harga minuman : ");
        harga_minuman = initiale.nextInt();
        System.out.println("Jumlah minuman : ");
        jumlah_minuman = input.nextInt();

        total_belanja = ((harga_makanan*jumlah_makanan)+(harga_minuman*jumlah_minuman));

        pesan = new DataPesanan(id, namaCustomer, list_makanan, list_minuman);
        pesan.vecpesanan.add(pesan);

        PrintOutPesanan(input, initiale);
        
        int pilihan;
        System.out.println("0. Back");
        pilihan = input.nextInt();

        if(pilihan==0){
            InputOutput.kelolaPesanan(input, initiale);
        } else {
            System.out.println("Anda salah memasukkan perintah!");
            tambahDataPesanan(input, initiale);
        }
    }

    public static void PrintOutPesanan(Scanner input, Scanner initiale){
        System.out.println("\n\n\n =======Bill Pembayaran=======");
        System.out.print("\n");
        System.out.println("===========================================================================================================================");
        System.out.println("| ID | Nama\t| Makanan\t| Minuman\t| Jumlah makanan\t| Jumlah minuman\t| Harga makanan\t| Harga minuman\t| Total belanja\t|");
        System.out.println("===========================================================================================================================");
        for (DataPesanan pesan : pesan.vecpesanan){
            System.out.println("|>" + pesan.getId() + " |>" + pesan.getNamaCustomer() + " |>" + pesan.getList_makanan() + "\t\t|" + pesan.getList_minuman() + "\t\t|" + pesan.getJumlah_makanan() + "\t\t|" + pesan.getJumlah_minuman() + "t\t|" + pesan.getTotal_belanja());
        }
    }
    
    public static void Pendapatan(Scanner input, Scanner initiale){
        int pilihan;
        System.out.println("Pendapatan Restoran Hari Ini : " + getPendapatan());
        System.out.println("0. Back");
        pilihan = input.nextInt();
        if (pilihan==0){
            InputOutput.kelolaPesanan(input, initiale);
        } else {
            System.out.println("Anda Salah Menginput Pesan!");
            Pendapatan(input, initiale);
        }
    }

}