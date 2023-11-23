import java.util.Scanner;

public class Tugasno2 {
    static Scanner scanner = new Scanner(System.in);
    static int jmlMhs;
    static int jmlMinggu;

    static String[] namaMhs;
    static int[][] nilaiMhs;
    
    public static void main(String[] args) {

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jmlMhs = scanner.nextInt();

        System.out.print("Masukkan Jumlah Tugas/Minggu: ");
        jmlMinggu = scanner.nextInt();

        namaMhs = new String[jmlMhs];
        nilaiMhs = new int[jmlMhs][jmlMinggu];


        InputDataMahasiswa();
        TampilkanNilaiMahasiswa();
        cariHariNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
    }

    static void InputDataMahasiswa() {
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMhs[i] = scanner.next();
            for (int j = 0; j < jmlMinggu; j++) {
                System.out.print("Masukkan nilai mahasiswa " + namaMhs[i] + " untuk minggu ke-" + (j + 1) + ": ");
                nilaiMhs[i][j] = scanner.nextInt();
            }
        }
    }

    static void TampilkanNilaiMahasiswa() {
        System.out.println("Nilai Mahasiswa:");
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print(namaMhs[i] + ": ");
            for (int j = 0; j < jmlMinggu; j++) {
                System.out.print(nilaiMhs[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari hari keberapa terdapat nilai tertinggi
    static void cariHariNilaiTertinggi() {
        double nilaiTertinggi = Double.MIN_VALUE;
        int hariTertinggi = -1;

        int j;
        int i;
        for ( j = 0; j < jmlMinggu; j++) {
            double nilaiMinggu = 0;
            for ( i = 0; i < jmlMhs; i++) {
                nilaiMinggu += nilaiMhs[i][j];
            }

            if (nilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = nilaiMinggu;
                hariTertinggi = j + 1;
            }
        }

        System.out.println("\nNilai tertinggi terdapat pada hari ke-" + hariTertinggi);
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi
    static void tampilkanMahasiswaNilaiTertinggi() {
        double nilaiTertinggi = Double.MIN_VALUE;
        int mahasiswaTertinggi = -1;
        int mingguTertinggi = -1;

        for (int i = 0; i < jmlMhs; i++) {
            for (int j = 0; j < jmlMinggu; j++) {
                if (nilaiMhs[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMhs[i][j];
                    mahasiswaTertinggi = i;
                    mingguTertinggi = j + 1;
                }
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi adalah " + namaMhs[mahasiswaTertinggi] +
                " pada minggu ke-" + mingguTertinggi + " dengan nilai " + nilaiTertinggi);
    }
}