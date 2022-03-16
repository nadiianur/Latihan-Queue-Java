import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TugasQueue {

    public static void main(String[] args) {
        String pilihan;
        boolean pilihan2, pilihan4;
        int Antrian = 1, pesanan, pilihan3;
        Queue<Integer> NoAntrian = new LinkedList<>();
        Queue<Integer> PesananPelanggan = new LinkedList<>();
        Scanner Input = new Scanner(System.in);

        System.out.println("\n=================================");
        System.out.println("Selamat Datang Di Laundry Mark");
        System.out.println("=================================");
        do {
            System.out.println("Apakah anda ingin melaundry pakaian (y/t) : ");
            pilihan = Input.nextLine();
            switch (pilihan) {
                // pelanggan
                case "y":
                    System.out.println("\nMasuk Antrian");
                    var data_antrian = Antrian++;
                    NoAntrian.add(data_antrian);
                    System.out.println("-------------------------------------------");
                    System.out.println("Nomor antrian anda adalah : " + data_antrian);
                    System.out.println("-------------------------------------------");
                    do {
                        System.out.println("\nMasukan berat cucian /kg  ");
                        pesanan = Input.nextInt();
                        PesananPelanggan.add(pesanan);
                        System.out.println("Berat cucian customer : " + pesanan + " kg");
                        System.out.println("-------------------------------------------");
                        System.out.println("\nApakah ingin melaundry lagi? (true/false): ");
                        System.out.println("-------------------------------------------");
                        pilihan2 = Input.nextBoolean();
                    } while (pilihan2);
                    break;
                // pemilik laundry
                case "t":
                    do {
                        System.out.println("\n--------------------------------");
                        System.out.println("Menu Operasi Data Laundry Mark");
                        System.out.println("--------------------------------");
                        System.out.println("1. Cek data costumer kosong"); // isempty
                        System.out.println("2. Cek data cucian kosong");
                        System.out.println("3. Cucian Selesai"); // poll antrian
                        System.out.println("4. Jumlah Cucian Customer"); // size
                        System.out.println("5. Jumlah Pelanggan");
                        System.out.println("6. Tampilkan data Customer saat ini");
                        System.out.println("7. Hapus semua data"); // clear
                        System.out.println("8. Tutup Laundry Mark");
                        System.out.println("------------------------------");
                        System.out.println("Masukan pilihan anda : ");
                        pilihan3 = Input.nextShort();
                        switch (pilihan3) {
                            case 1:
                                var DataKosong = NoAntrian.isEmpty();
                                System.out.println("Data Customer kosong : " + DataKosong);
                                break;
                            case 2:
                                var DataKosong2 = PesananPelanggan.isEmpty();
                                System.out.println("Data cucian kosong : " + DataKosong2);
                                break;
                            case 3:
                                NoAntrian.poll();
                                System.out.println("Cucian Customer berhasil diselesaikan");
                                break;
                            case 4:
                                System.out.println("Jumlah Cucian Customer yang tersedia : " + PesananPelanggan.size());
                                break;
                            case 5:
                                System.out.println("Jumlah data Customer yang tersedia : " + NoAntrian.size());
                                break;
                            case 6:
                                System.out.println("Data Customer yang tersedia : " + NoAntrian);
                                break;
                            case 7:
                                NoAntrian.clear();
                                PesananPelanggan.clear();
                                System.out.println("Semua cucian telah diselesaikan");
                                break;
                            case 8:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("pilihan yang anda tuliskan salah!");
                                break;
                        }
                        System.out.println("\n======================================================");
                        System.out.println("apakah anda ingin mengulang operasi lagi (true/false) : ");
                        pilihan4 = Input.nextBoolean();
                        System.out.println("======================================================");
                    } while (pilihan4);
            }
        } while (true);
    }
}