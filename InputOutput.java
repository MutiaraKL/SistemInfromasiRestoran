import java.util.Scanner;

public class InputOutput {
    static DataMinuman minum;
    static DataMakanan makan;
    
    public static void menu (Scanner input, Scanner initiale) {
        int pilihan;
        System.out.println("=======SELAMAT DATANG DI RESTORAN RINTA=======");
        System.out.print("\n");
        System.out.println("Pilih Menu di Bawah Ini untuk Mengelola Data");
        System.out.println("---------------------------------------------");
        System.out.println("1. Kelola Data Makanan");
        System.out.println("2. Kelola Data Minuman");
        System.out.println("3. Kelola Data Makanan dan Minuman");
        System.out.println("4. Kelola Data Customer");
        System.out.println("5. Kelola Data Pesanan");
        System.out.println("6. Pendapatan Restoran");
        System.out.println("7. Keluar");
        System.out.println("---------------------------------------------");
        System.out.print("Pilihan : ");
        pilihan = input.nextInt();

        if(pilihan==1) {
            kelolaMakanan(input, initiale);
        } else if (pilihan==2){
            kelolaMinuman(input, initiale);
        } else if (pilihan==3){
            dataMakanandanMinuman(input, initiale);
        } else if (pilihan==4){
            kelolaCustomer(input, initiale);
        } else if (pilihan==5){
            kelolaPesanan(input, initiale);
        } else if (pilihan==6){
            DataPesanan.Pendapatan(input, initiale);
        } else if (pilihan==7){
            System.exit(0);
        } else {
            System.out.println("Maaf Pilihan Anda Salah!");
            menu(input, initiale);
        }
    }

    public static void kelolaMakanan(Scanner input, Scanner initiale){
        int pilihan;
        System.out.println("=======Kelola Makanan=======");
        System.out.print("\n");
        System.out.println("Pilih Perintah di Bawah Ini untuk Mengelola Data Pesanan");
        System.out.println("---------------------------------------------------------");
        System.out.println("1. Lihat Data Makanan");
        System.out.println("2. Tambah Data Makanan");
        System.out.println("3. Update Data Makanan");
        System.out.println("4. Hapus Data Makanan");
        System.out.println("5. Kembali");
        System.out.println("---------------------------------------------------------");
        System.out.print("Pilihan : ");
        pilihan = input.nextInt();

        if (pilihan==1){
            lihatDataMakanan(input, initiale);
        } else if (pilihan==2){
            DataMakanan.tambahDataMakanan(input, initiale);
        } else if (pilihan==3){
            DataMakanan.updateDataMakanan(input, initiale);
        } else if (pilihan==4){
            DataMakanan.hapusDataMakanan(input, initiale);
        } else if (pilihan==5){
            menu(input, initiale);
        } else {
            System.out.println("Maaf Anda Salah Memasukkan Perintah!");
            kelolaMakanan(input, initiale);
        }
    }

    public static void lihatDataMakanan(Scanner input, Scanner initiale){
        int pilihan;
        DataMakanan.printDataMakanan(input, initiale);
        System.out.println("0 Back");
        System.out.print("Input : ");
        pilihan = input.nextInt();
        if(pilihan==0){
            kelolaMakanan(input, initiale);
        } else {
            lihatDataMakanan(input, initiale);
        }
    }

    public static void kelolaMinuman(Scanner input, Scanner initiale){
        int pilihan;
        System.out.println("=======Kelola Data Minuman=======");
        System.out.print("\n");
        System.out.println("Pilih Perintah di Bawah Ini untuk Mengelola Data Pesanan");
        System.out.println("---------------------------------------------------------");
        System.out.println("1. Lihat Data Minuman");
        System.out.println("2. Tambah Data Minuman");
        System.out.println("3. Update Data Minuman");
        System.out.println("4. Hapus Data Minuman");
        System.out.println("5. Kembali");
        System.out.println("---------------------------------------------------------");
        System.out.print("Pilihan : ");
        pilihan = input.nextInt();

        if (pilihan==1){
            lihatDataMinuman(input, initiale);
        } else if (pilihan==2){
            DataMinuman.tambahDataMinuman(input, initiale);
        } else if (pilihan==3){
            DataMinuman.updateDataMinuman(input, initiale);
        } else if (pilihan==4){
            DataMinuman.hapusDataMinuman(input, initiale);
        } else if (pilihan==5){
            menu(input, initiale);
        } else {
            System.out.println("Maaf Anda Salah Memasukkan Perintah!");
            kelolaMinuman(input, initiale);
        }
    }

    public static void lihatDataMinuman(Scanner input, Scanner initiale){
        int pilihan;
        DataMinuman.printDataMinuman(input, initiale);
        System.out.println("0 Back");
        System.out.print("Input : ");
        pilihan = input.nextInt();
        if(pilihan==0){
            kelolaMinuman(input, initiale);
        } else {
            lihatDataMinuman(input, initiale);
        }
    }

    public static void dataMakanandanMinuman(Scanner input, Scanner initiale){
        int pilihan;
        DataMakanan.printDataMakanan(input, initiale);
        DataMinuman.printDataMinuman(input, initiale);
        System.out.println("0 Back");
        pilihan = input.nextInt();
        if(pilihan==0){
            menu(input, initiale);
        } else {
            dataMakanandanMinuman(input, initiale);
        }
    }

    public static void kelolaCustomer(Scanner input, Scanner initiale){
        int pilihan;
        System.out.println("=======Kelola Data Customer=======");
        System.out.print("\n");
        System.out.println("Pilih Perintah di Bawah Ini untuk Mengelola Data Pesanan");
        System.out.println("---------------------------------------------------------");
        System.out.println("1. Lihat Data Customer");
        System.out.println("2. Tambah Data Customer");
        System.out.println("3. Update Data Customer");
        System.out.println("4. Hapus Data Customer");
        System.out.println("5. Kembali");
        System.out.println("---------------------------------------------------------");
        System.out.print("Pilihan : ");
        pilihan = input.nextInt();

        if (pilihan==1){
            lihatDataCustomer(input, initiale);
        } else if (pilihan==2){
            DataCustomer.tambahDataCustomer(input, initiale);
        } else if (pilihan==3){
            DataCustomer.updateDataCustomer(input, initiale);
        } else if (pilihan==4){
            DataCustomer.hapusDataCustomer(input, initiale);
        } else if (pilihan==5){
            menu(input, initiale);
        } else {
            System.out.println("Maaf Anda Salah Memasukkan Perintah!");
            kelolaCustomer(input, initiale);
        }
    }

    public static void lihatDataCustomer(Scanner input, Scanner initiale){
        int pilihan;
        DataCustomer.printDataCustomer(input, initiale);
        System.out.println("0 Back");
        System.out.print("Input : ");
        pilihan = input.nextInt();
        if(pilihan==0){
            kelolaCustomer(input, initiale);
        } else {
            lihatDataCustomer(input, initiale);
        }
    }

    public static void kelolaPesanan(Scanner input, Scanner initiale){
        int pilihan;
        System.out.println("=======Kelola Data Pesanan=======");
        System.out.print("\n");
        System.out.println("Pilih Perintah di Bawah Ini untuk Mengelola Data Pesanan");
        System.out.println("---------------------------------------------------------");
        System.out.println("1. Lihat Data Pesanan");
        System.out.println("2. Tambah Data Pesanan");
        System.out.println("3. Kembali");
        pilihan = input.nextInt();

        if (pilihan==1){
            lihatDataPesanan(input, initiale);
        } else if (pilihan==2){
            DataPesanan.tambahDataPesanan(input, initiale);
        } else if (pilihan==3){
            menu(input, initiale);
        } else {
            System.out.println("Maaf Anda Salah Memasukkan Perintah!");
            kelolaPesanan(input, initiale);
        }
    }

    public static void lihatDataPesanan(Scanner input, Scanner initiale){
        int pilihan;
        DataPesanan.printDataPesanan(input, initiale);
        System.out.println("0 Back");
        pilihan = input.nextInt();
        if(pilihan==0){
            kelolaPesanan(input, initiale);
        } else {
            lihatDataPesanan(input, initiale);
        }
    }

    public static void pendapatan(Scanner input){
        int pilihan;
        System.out.println("=======Pendapatan Restauran=======");
        System.out.print("\n");
        System.out.println("Pendapatan Saat Ini : ");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("0 Back");
        pilihan = input.nextInt();
        if(pilihan==0){
            menu(input, input);
        } else {
            System.out.println("Maaf Anda Salah Memasukkan Perintah!");
            pendapatan(input);
        }
    }
    
}
