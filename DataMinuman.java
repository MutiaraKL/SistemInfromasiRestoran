import java.util.Scanner;
import java.util.Vector;

public class DataMinuman extends Menu {
    private String nama;
    private static int stok;
    private int oneStok;
    private String id;
    static Vector<DataMinuman> vecminuman = new Vector<DataMinuman>();

    public DataMinuman(String nama, int harga) {
        this.setNama(nama);
        setHarga(harga);
        oneStok += 1;
        Menu.setStok(Menu.getStok() + 1);
        DataMinuman.stok += 1;
    }

    public DataMinuman(String id, String nama, int harga, int stok) {
        this.setNama(nama);
        setHarga(harga);
        setId(id);
        oneStok = stok;
        Menu.setStok(Menu.getStok() + stok);
        DataMinuman.stok += stok;
    }

    public static int getStok() {
        return stok;
    }

    public String getNama() {
        return nama;
    }

    public DataMinuman getMinuman() {
        return DataMinuman.this;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOneStok() {
        return oneStok;
    }

    public void setOneStok(int oneStok) {
        this.oneStok = oneStok;
    }

    // CRUD

    static DataMinuman minum;

    public static void printDataMinuman(Scanner input, Scanner initiale) {
        System.out.println("======= | Kelola Data Minuman =======");
        System.out.print("\n");
        System.out.println(" Data Minuman :");
        System.out.println(" +=============================================");
        System.out.println(" | ID\t | Nama Minuman\t| Harga\t\t| Stok\t\t |");
        System.out.println(" +---------------------------------------------");

        for (DataMinuman minum : minum.vecminuman) {
            System.out.println("|>" + minum.getId() + "|>" + minum.getNama() + "\t\t|> Rp." + minum.getHarga() + "\t|" + minum.getStok() + "\t");
        }
        if (minum.vecminuman.size() == 0) {
            System.out.println("| \t\t Tidak Ada Data\t\t |");
        }
        System.out.println("|_____________________________________________-");
        System.out.println("| Total stok semua minuman | " + DataMinuman.getStok() + "\t\t |");
        System.out.println(" +=============================================");
    }

    public static void tambahDataMinuman(Scanner input, Scanner initiale) {
        int harga;
        int stok;
        String nama;
        String id;
        System.out.println("====== |Kelola data minuman ======");
        System.out.print("\n");
        System.out.println("------- Tambah data minuman ------");
        System.out.print("Id minuman : ");
        id = initiale.nextLine();
        System.out.print("Nama minuman :");
        nama = input.nextLine();
        System.out.println("Harga minuman");
        harga = input.nextInt();
        System.out.print("Stok :");
        stok = input.nextInt();

        minum = new DataMinuman(id, nama, harga, stok);
        minum.vecminuman.add(minum);
        InputOutput.kelolaMinuman(input, initiale);
    }

    public static void updateDataMinuman(Scanner input, Scanner initiale) {
        DataMinuman.printDataMinuman(input, initiale);
        String id;
        String nama;
        int harga;
        int stok;
        int index = 0, penanda = 0;
        System.out.print("Masukkan id Minuman yang akan diubah :");
        id = initiale.nextLine();
        System.out.println("Nama minuman :");
        nama = initiale.nextLine();
        System.out.println("Harga Minuman :");
        harga = input.nextInt();
        System.out.println("stok :");
        stok = input.nextInt();

        for (DataMinuman minum : minum.vecminuman) {
            if (minum.getId().equals(id)) {
                penanda = 1;
                minum.vecminuman.remove(index);
                minum = new DataMinuman(id, nama, harga, stok);
                minum.vecminuman.add(minum);
                break;
            }
            index++;
        }

        if (penanda == 0) {
            System.out.print("Minuman tidak ditemukan!");
            System.out.println("Tekan enter untuk lanjut!");
        } 
        InputOutput.kelolaMinuman(input, initiale);
    }

    public static void hapusDataMinuman(Scanner input, Scanner initiale) {
        DataMinuman.printDataMinuman(input, initiale);
        String id;
        int index = 0, penanda = 0;
        System.out.println("Masukkan id karyawan yang akan di hapus :");
        id = initiale.nextLine();

        for (DataMinuman minum : minum.vecminuman) {
            if (minum.getId().equals(id)) {
                penanda = 1;
                minum.vecminuman.remove(index);
                break;
            }
            index++;
        }
        if (penanda == 0) {
            System.out.println("karyawan tidak ditemukan");
            System.out.println("tekan enter untuk lanjut");
        }
    }

}