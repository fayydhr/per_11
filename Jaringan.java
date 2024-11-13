import java.util.ArrayList;
import java.util.List;

public class Jaringan {
    private List<Pengguna> pengguna;
    private List<Postingan> postingan;

    public Jaringan() {
        pengguna = new ArrayList<>();
        postingan = new ArrayList<>();
    }

    public Pengguna tambahkanPengguna(String namaPengguna) {
        Pengguna penggunaBaru = new Pengguna(namaPengguna);
        pengguna.add(penggunaBaru);
        System.out.println("Pengguna baru ditambahkan: " + namaPengguna);
        return penggunaBaru;
    }

    public void tambahkanPostingan(Postingan postinganBaru) {
        postingan.add(postinganBaru);
    }

    public void tampilkanSemuaPostingan() {
        System.out.println("\nDaftar Semua Postingan:");
        for (Postingan postingan : postingan) {
            System.out.println(postingan.getPenulis().getNamaPengguna() + " membuat: " + postingan.getKonten() + " - Jumlah Suka: " + postingan.hitungJumlahSuka());
        }
    }
}
