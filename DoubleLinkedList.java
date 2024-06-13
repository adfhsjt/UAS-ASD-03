public class DoubleLinkedList {
    BarangRental head;
    int size;

    DoubleLinkedList() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
        if(isEmpty()) {
            head = new BarangRental(null, noTNKB, namaKendaraan, jenisKendaraan, tahun, biayaSewa, null);
        } else {
            BarangRental newNode = new BarangRental(null, noTNKB, namaKendaraan, jenisKendaraan, tahun, biayaSewa, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    int size() {
        return size;
    }

    void print() {
        if(!isEmpty()) {
            BarangRental current = head;
            System.out.println("++++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Kendaraan Rental Serba Serbi");
            System.out.println("++++++++++++++++++++++++++++++++++++");
            
            while(current != null) {
                System.out.println("| No TNKB\t| Nama Kendaraan\t| Jenis\t| Tahun\t| Biaya Sewa Perjam");
                System.out.println("| " + current.noTNKB + "\t| " + current.namaKendaraan + "\t| " + current.jenisKendaraan + "\t| " + current.tahun + "\t| " + current.biayaSewa);
                current = current.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void removeFirst() {
        if(isEmpty()) {
            System.out.println("Kendaraan Kosong");
        } else if(size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() {
        if(isEmpty()) {
            System.out.println("Kendaraan Kosong");
        } else if(head.next == null) {
            head = null;
            size--;
            return;
        }
    }

    void remove(String noTNKB) {
        if(isEmpty()) {
            System.out.println("Kendaraan Kosong");
        } else {
            BarangRental current = head;
            while(current != null) {
                if(current.noTNKB.equals(noTNKB)) {
                    break;
                }
                current = current.next;
            }
            if(current == null) {
                System.out.println("Kendaraan dengan NO TNKB: " + noTNKB + " tidak ditemukan");
            } else {
                if(current.next == null) {
                    current.prev.next = null;
                } else if(current.prev == null) {
                    current = current.next;
                    current.prev = null;
                    head = current;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
            }
        }
    }

    void get(String noTNKB) {
        BarangRental current = head;
        while(current != null) {
            if(current.noTNKB.equals(noTNKB)) {
                System.out.println("No TNKB\t| Nama Kendaraan\t| Jenis\t| Tahun\t| Biaya Sewa");
                System.out.println("| " + current.noTNKB + "\t| " + current.namaKendaraan + "\t| " + current.jenisKendaraan + "\t| " + current.tahun + "\t| " + current.biayaSewa);
                return;
            }
            current = current.next;
        }
        System.out.println("Kendaraan dengan NO TNKB: " + noTNKB + " tidak ditemukan");
    }



}
