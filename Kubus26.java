import java.util.Scanner;
public class Kubus26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sisi;

        System.out.println("Masukkan sisi kubus: ");
        sisi = input.nextInt();

        int volume = sisi * sisi * sisi;

        int luasPermukaan = 6 * sisi * sisi;

        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }

    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }
}