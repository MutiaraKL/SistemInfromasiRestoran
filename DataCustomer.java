import java.util.Scanner;
import java.util.Vector;

public class DataCustomer {
    static Vector<DataCustomer> veccustomer = new Vector<DataCustomer>();

    private String nama, id;
    private int jumlahCustomer;

    public DataCustomer(String id, String nama, int jumlahCustomer) {
        this.setNama(nama);
        this.setId(id);
        this.setJumlahCustomer(jumlahCustomer);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahCustomer() {
        return jumlahCustomer;
    }

    public void setJumlahCustomer(int jumlahCustomer) {
        this.jumlahCustomer = jumlahCustomer;
    }

    // CRUD

    static DataCustomer custom;

    public static void printDataCustomer(Scanner input, Scanner initiable) {
        System.out.println("========= | Kelola Data Customer =========");
        System.out.println("\n");
        System.out.println(" Data Customer :");
        System.out.println(" +========================================+");
        System.out.println(" | ID | Nama Customer\t|Jumlah Pesanan\t|");
        System.out.println("+-----------------------------------------+");
        for (DataCustomer custom : veccustomer) {
            System.out
                    .println("|>" + custom.getId() + "|>" + custom.getNama() + "\t\t|> " + custom.getJumlahCustomer());
        }
        if (veccustomer.size() == 0) {
            System.out.println("| \t\t Tidak Ada Data\t\t |");
        }
        System.out.println("+=================================+");
    }

    public static void tambahDataCustomer(Scanner input, Scanner initiale) {
        String id, nama;
        int jumlahCustomer;
        System.out.println("==== | Kelola Data Customer ====");
        System.out.println("\n");
        System.out.println("==== | Tambah Data Customer ====");
        System.out.println(" ID customer: ");
        id = initiale.nextLine();
        System.out.println("Nama customer :");
        nama = initiale.nextLine();
        System.out.println("Jumlah pesanan :");
        jumlahCustomer = input.nextInt();

        custom = new DataCustomer(id, nama, jumlahCustomer);
        veccustomer.add(custom);
        InputOutput.kelolaCustomer(input, initiale);
    }

    public static void hapusDataCustomer(Scanner input, Scanner initiale) {
        printDataCustomer(input, initiale);
        String id;
        int index = 0, penanda = 0;
        System.out.println("Masukkan id customer yang akan dihapus : ");
        id = initiale.nextLine();

        for (DataCustomer custom : veccustomer) {
            if (custom.getId().equals(id)) {
                penanda = 1;
                veccustomer.remove(index);
                break;
            }
            index++;
        }
        if (penanda == 0) {
            System.out.println("Customer tidak ditemukan");
            System.out.println("Tekan enter untuk lanjut");
        }

        InputOutput.kelolaCustomer(input, initiale);
    }

    public static void updateDataCustomer(Scanner input, Scanner initiale) {
        printDataCustomer(input, initiale);
        String id, nama;
        int jumlahCustomer;
        System.out.println("=====| Kelola Data Customer =====");
        System.out.println("\n");
        System.out.println("------Update Data Customer ------");
        System.out.println("Masukkan id customer yang akan di-update : ");
        id = initiale.nextLine();
        System.out.println("Nama customer : ");
        nama = initiale.nextLine();
        System.out.println("Jumlah pesanan: ");
        jumlahCustomer = input.nextInt();
        int index = 0, penanda = 0;
        for (DataCustomer custom : veccustomer) {
            if (custom.getId().equals(id)) {
                penanda = 1;
                veccustomer.remove(index);
                custom = new DataCustomer(id, nama, jumlahCustomer);
                veccustomer.add(custom);
                break;
            }
            index++;
        }

        if (penanda == 0) {
            System.out.println("Customer tidak di temukan");
            System.out.println("Tekan enter untuk lanjut");
        }

        InputOutput.kelolaCustomer(input, initiale);

    }

}
