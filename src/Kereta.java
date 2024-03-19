public class Kereta {
    private String namaKereta;
    private int jumlahTiket;
    private String[] namaPenumpang;
    private String[] asal;
    private String[] tujuan;

    //Default Constructor untul kereta Komuter
    public Kereta() {
        namaKereta = "Komuter";
        jumlahTiket = 1000;
        namaPenumpang = new String[jumlahTiket];
        asal = new String[jumlahTiket];
        tujuan = new String[jumlahTiket];
    }
    //Overload Constructor untuk kereta KAJJ
    public Kereta(String namaKereta, int jumlahTiket) {
        this.namaKereta = namaKereta;
        this.jumlahTiket = jumlahTiket;
        namaPenumpang = new String[jumlahTiket];
        asal = new String[jumlahTiket];
        tujuan = new String[jumlahTiket];
    }
    //Metode untuk menambah tiket kereta komuter
    public void tambahTiket(String nama) {
        if (jumlahTiket > 0){
            namaPenumpang[namaPenumpang.length - jumlahTiket] = nama;
            jumlahTiket--;
            System.out.println("==================================");
            System.out.println("Tiket berhasil dipesan");
            //Menampilkan sisa tiket jika kurang dari 30
            if (jumlahTiket < 30) {
                System.out.println("Sisa tiket tersedia: " + jumlahTiket);
                System.out.println("==================================");
            }
        } else {
            System.out.println("==================================");
            System.out.println("Kereta telah habis dipeasan, silahkan cari jadwal keberangkatan lainnya");
        }
    }
    //Metode untuk menambah tiket kereta KAJJ
    public void tambahTiket(String nama, String asal, String tujuan){
        if (jumlahTiket > 0) {
            namaPenumpang[namaPenumpang.length - jumlahTiket] = nama;
            this.asal[namaPenumpang.length - jumlahTiket] = asal;
            this.tujuan[namaPenumpang.length- jumlahTiket] = tujuan;
            jumlahTiket --;
            System.out.println("==================================");
            System.out.println("Tiket berhasil dipesan Sisa tiket tersedia: " + jumlahTiket);
        } else {
            System.out.println("==================================");
            System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
        }
    }
    //Metode untuk menampilkan daftar penumpang
    public void tampilkanTiket() {
        System.out.println("==================================");
        System.out.println("Daftar penumpang kereta api " + namaKereta + ":");
        System.out.println("-----------------------------------");
        for (int i=0; i< namaPenumpang.length; i++){
            if (namaPenumpang[i] !=null) {
                System.out.println("Nama: " + namaPenumpang[i]);
                //Menampilkan asal dan tujuan jika tidak null
                if (asal[i] != null && tujuan[i] != null) {
                    System.out.println("Asal: " + asal[i]);
                    System.out.println("Tujuan: " + tujuan[i]);
                    System.out.println("-----------------------------------");
                }
            }
        }
    }
}

