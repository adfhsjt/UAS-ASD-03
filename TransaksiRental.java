public class TransaksiRental {
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental br;
    TransaksiRental prev, next;

    TransaksiRental(TransaksiRental prev, int kodeTransaksi, String namaPeminjam, int lamaPinjam, double totalBayar, BarangRental br, TransaksiRental next) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBayar;
        this.br = br;
        this.prev = prev;
        this.next = next;
    }




}
