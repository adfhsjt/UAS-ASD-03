import java.util.Scanner;
public class BarangRentalMain {
    public static Scanner sc = new Scanner(System.in);
    public static Scanner ss = new Scanner(System.in);
    
    public static void main(String[] args) {
        DoubleLinkedList kendaraan = new DoubleLinkedList();
        DoubleLinkedListTransaksi transaksi = new DoubleLinkedListTransaksi();
        kendaraan.addFirst("S 4567 YV", "Honda Beat", "Motor", 2017, 25000);
        kendaraan.addFirst("N 4511 VS", "Honda Vario", "Motor", 2018, 25000);
        kendaraan.addFirst("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 40000);
        kendaraan.addFirst("AB 4321 A", "Toyota Innova", "Mobil", 2019, 40000);
        kendaraan.addFirst("B 1234 AG", "Toyota  Avanza", "Mobil", 2021, 40000);

        int pilihan;
        do {
            menu();
            do{
            System.out.print("Masukkan Pilihan : ");
            pilihan = sc.nextInt();
            } while (pilihan > 5);
            switch (pilihan) {
                case 1:
                    kendaraan.print();
                    break;
                case 2:
                    System.out.println("----------------------------");
                    System.out.println("Masukkan Data Peminjaman");
                    System.out.println("----------------------------");
                    System.out.print("Masukkan Nama Peminjam");
                    String namaPeminjam = ss.next();
                    System.out.print("Masukkan Nomor TNKB : ");
                    String noTNKB = ss.next();
                    System.out.println("Masukkan Jenis Kendaraaan");
                    System.out.println("1. Motor");
                    System.out.println("2. Mobil");
                    int jenisKendaraan = sc.nextInt();
                    if(jenis)
                    System.out.print("Masukkan Lama Pinjam : ");
                    int lamaPinjam = sc.nextInt();
                    System.out.print("Apakah Member : ");
                    String member = ss.next();
                    if(member.equals("y")) {

                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Terima kasih");
                    break;
            }
        } while (pilihan > 5);
        
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Peminjaman");
        System.out.println("3. Tampilkan seluruh transaksi");
        System.out.println("4. Urutkann Transaksi urut no TNKB");
        System.out.println("5. Keluar");
    }
}
