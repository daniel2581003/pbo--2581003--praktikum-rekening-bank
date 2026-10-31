import java.util.Scanner;

public class BankMini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rekening rekening = new Rekening("001", "Ani", 100000);
        //rekening.saldo = 1000000;
        //java: saldo has private access in Rekening

        System.out.println("============ BANK MINI ============");
        System.out.println("Rekening " + rekening.getNomor() + " a.n. " + rekening.getPemilik());

        int menu;
        do {
            System.out.print("Menu (1 setor, 2 tarik, 3 info, 0 keluar): ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Jumlah: ");
                    int jumlahSetor = sc.nextInt();
                    System.out.println(rekening.setor(jumlahSetor) ? "  Berhasil" : "  Ditolak");
                    break;
                case 2:
                    System.out.print("Jumlah: ");
                    int jumlahTarik = sc.nextInt();
                    System.out.println(rekening.tarik(jumlahTarik) ? "  Berhasil" : "  Ditolak");
                    break;
                case 3:
                    rekening.cetakInfo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Menu tidak dikenal");
            }
        } while (menu != 0);

        System.out.println();
        System.out.println("=========== SALDO AKHIR ===========");
        rekening.cetakInfo();
        sc.close();
    }
}