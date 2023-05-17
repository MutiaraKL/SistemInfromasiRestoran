import java.util.Scanner;
import java.util.Vector;

public class DataMakanan extends Menu {
    private String nama;
    private static int stok;
    private int oneStok;
    private String id;
    static Vector<DataMakanan> vecmakanan = new Vector<DataMakanan>();

    public DataMakanan(String nama, int harga) {
        this.setNama(nama);
        setHarga(harga);
        oneStok += 1;
        Menu.setStok(Menu.getStok() + 1);
        DataMakanan.stok += 1;
    }

    public DataMakanan(String id, String nama, int harga, int stok) {
        this.setNama(nama);
        setHarga(harga);
        setId(id);
        oneStok = stok;
        Menu.setStok(Menu.getStok() + stok);
        DataMakanan.stok += stok;
    }

    public static int getStok() {
        return stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public DataMakanan getMakanan() {
        return DataMakanan.this;
    }

    public int getOneStok() {
        return oneStok;
    }
    
    public void setOneStok(int oneStok) {
        this.oneStok = oneStok;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // CRUD

    static DataMakanan makan;

    public static void printDataMakanan(Scanner input, Scanner initiale) {
        System.out.println("====== | Kelola Data Makanan ======");
        System.out.print("\n");
        System.out.println(" Data Makanan :");
        System.out.println(" +============================================+");
        System.out.println(" | ID\t | Nama Makanan\t| Harga\t\t| Stok\t\t |");
        System.out.println(" +============================================+");

        for (DataMakanan makan : makan.vecmakanan) {
            System.out.println("|>" + makan.getId() + "|>" + makan.getNama() + "\t\t|> Rp." + makan.getHarga() + "\t|" + makan.getStok() + "\t");
        }
        if (makan.vecmakanan.size() == 0) {
            System.out.println("| \t\t Tidak Ada Data\t\t |");
        }
        System.out.println("|________________________________________________+");
        System.out.println("| Total Stok semua Makanan | " + DataMakanan.getStok() + "\t\t  |");
        System.out.println("+================================================+");
    }

    public static void tambahDataMakanan(Scanner input, Scanner initiale) {
        int harga;
        int stok;
        String nama;
        String id;
        System.out.println("======== |Kelola data "
                + ""
                + ""
                + ""
                + ""
                + "makanan =====");
        System.out.print("\n");
        System.out.println("---- Tambah Data Makanan ----");
        System.out.print("ID makanan :");
        id = initiale.nextLine();
        System.out.print(" Nama makanan :");
        nama = initiale.nextLine();
        System.out.print(" Harga makanan :");
        harga = input.nextInt();
        System.out.println(" Stok :");
        stok = input.nextInt();

        makan = new DataMakanan(id, nama, harga, stok);
        makan.vecmakanan.add(makan);
        InputOutput.kelolaMakanan(input, initiale);
    }

    public static void updateDataMakanan(Scanner input, Scanner initiale) {
        DataMakanan.printDataMakanan(input, initiale);
        String id;
        String nama;
        int harga;
        int stok;
        int index = 0, penanda = 0;
        System.out.print("Masukkan ID makanan yang akan diubah : ");
        id = initiale.nextLine();
        System.out.print("Nama makanan : ");
        nama = initiale.nextLine();
        System.out.print("Harga : ");
        harga = input.nextInt();
        System.out.println("Stok : ");
        stok = input.nextInt();

        for (DataMakanan makan : makan.vecmakanan) {
            if (makan.getId().equals(id)) {
                penanda = 1;
                makan.vecmakanan.remove(index);
                System.out.println("Ini di-update");
                makan = new DataMakanan(id, nama, harga, stok);
                makan.vecmakanan.add(makan);
            }
            index++;
        }
        if (penanda ==0) {
            System.out.println("Makanan tidak ditemukan!");
            System.out.println("Tekan enter untuk lanjut!");
        }
        InputOutput.kelolaMakanan(input, initiale);
    }

    public static void hapusDataMakanan(Scanner input, Scanner initiale) {
        DataMakanan.printDataMakanan(input, initiale);
        String id;
        int index = 0, penanda = 0;
        System.out.print("Masukkan id makanan yang akan dihapus : ");
        id = initiale.nextLine();

        for (DataMakanan makan : makan.vecmakanan) {
            if (makan.getId().equals(id)) {
                penanda = 1;
                makan.vecmakanan.remove(index);
                break;
            }
            index++;
        }
        if (penanda == 0) {
            System.out.println("Makanan ttidak ditemukan!");
            System.out.println("Tekan enter untuk lanjut!");
        }
        InputOutput.kelolaMakanan(input, initiale);
    }

}
