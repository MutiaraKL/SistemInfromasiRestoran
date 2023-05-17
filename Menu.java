public class Menu {
    private static int stok;
    private int harga;

    public Menu(){
        //Menu.setStok(Menu.getStok()+stok);
        //menu.setBanyakMenu(Menu.getBanyakMenu+1);
    }

    //setter
    public static void setStok(int stok){
        Menu.stok = stok;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }

    //getter
    public static int getStok(){
        return stok;
    }
    public int getHarga(){
        return harga;
    }
}
