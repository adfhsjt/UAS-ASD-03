public class DoubleLinkedListTransaksi {
    TransaksiRental head;
    int size;
    DoubleLinkedList kd = new DoubleLinkedList();

    DoubleLinkedListTransaksi() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int kodeTransaksi, String namaPeminjam, int lamaPinjam, double totalBayar, BarangRental br) {
        if(isEmpty()) {
            head = new TransaksiRental(null, kodeTransaksi, namaPeminjam, lamaPinjam, totalBayar, br, null);
        } else {
            TransaksiRental newNode = new TransaksiRental(null, kodeTransaksi, namaPeminjam, lamaPinjam, totalBayar, br, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void tambahTransaksi(int kodeTransaksi, String namaPeminjam, int lamaPinjam, double totalBayar, BarangRental br, String noTNKB) {
        BarangRental current = head.br;
        while(current != null) {
            if(current.noTNKB.equals(br.noTNKB)) {
                addFirst(kodeTransaksi, namaPeminjam, lamaPinjam, totalBayar, br);
                kd.remove(noTNKB);
                return;
            }
            current = current.next;
        }
        System.out.println("Tidak bisa diproses, kendaraan sudah dipinjam orang lain");
    }

    int size() {
        return size;
    }

    void print() {
        if(!isEmpty()) {
            TransaksiRental current = head;
            System.out.println("++++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Transaksi Rental Serba Serbi");
            System.out.println("++++++++++++++++++++++++++++++++++++");
            
            while(current != null) {
                System.out.println("| Kode Transaksi\t| Nama Peminjam\t| Lama Pinjam\t| Total Bayar");
                System.out.println("| " + current.kodeTransaksi + "\t| " + current.namaPeminjam + "\t| " + current.lamaPinjam + "\t| " + current.totalBiaya);
                current = current.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void get(int indeks) {
        if(isEmpty() || indeks > size) {
            System.out.println("Input tidak valid");
        } 

        TransaksiRental current = head;

        for(int i = 0; i < indeks; i++) {
            current = current.next;
        }
        System.out.println("kode\t| No TNKB\t| Nama Barang\t| Nama Peminjam\t| Lama Dipinjam\t| Total Biaya");
    }
}
