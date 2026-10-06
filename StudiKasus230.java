import java.util.Scanner;

public class StudiKasus230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String jenisKegiatan;
        String namaMahasiswa;
        int jumlahDokumen;
        int peringkatJuara;
        boolean lolosPendanaan;
        String statusPendanaan;

        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Masukkan jenis kegiatan yang diikuti(BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya): ");
        jenisKegiatan = sc.nextLine().trim().toLowerCase();
        System.out.print("Jumlah dokumen yang diupload (1-4): ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri")){
                System.out.print("Peringkat juara 1-3 isi 0 jika tidak juara: ");
                peringkatJuara = sc.nextInt();
                System.out.println("Peringkat juara: " + peringkatJuara);
                if (peringkatJuara >= 1 && peringkatJuara <= 3){

                if (jumlahDokumen == 4) {
                statusPendanaan = "Dapat pendanaan";
                } else {
                statusPendanaan = "Tidak dapat pendanaan jumlah dokumen kurang " + (4 - jumlahDokumen);
                };
            } else {
                statusPendanaan = "Tidak dapat pendanaan karena peringkat juara tidak sesuai";
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Apakah lolos pendanaan? (1 untuk ya, 0 untuk tidak): ");
            lolosPendanaan = sc.nextBoolean();
            if (lolosPendanaan == true) {
                if (jumlahDokumen == 4) {
                    statusPendanaan = "Dapat pendanaan";
                } else {
                    statusPendanaan = "Tidak dapat pendanaan karena jumlah dokumen kurang " + (4 - jumlahDokumen);
                }
            } else {
                statusPendanaan = "Tidak dapat pendanaan karena tidak lolos pendanaan";
            }
        } else {
            statusPendanaan = "Tidak dapat pendanaan karena jenis kegiatan tidak sesuai";
        }
        
    System.out.println("Nama mahasiswa: " + namaMahasiswa);
    System.out.println("Jenis kegiatan: " + jenisKegiatan);
    System.out.println("Jumlah dokumen: " + jumlahDokumen);
    System.out.println("Status pendanaan: " + statusPendanaan);
    }
    
}