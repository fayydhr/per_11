import java.util.ArrayList;
import java.util.List;

public class Postingan {
    private Pengguna penulis;
    private String konten;
    private List<Pengguna> suka;
    private List<Komentar> komentar;

    public Postingan(Pengguna penulis, String konten) {
        this.penulis = penulis;
        this.konten = konten;
        this.suka = new ArrayList<>();
        this.komentar = new ArrayList<>();
    }

    public String getKonten() {
        return konten;
    }

    public Pengguna getPenulis() {
        return penulis;
    }

    public List<Pengguna> getSuka() {
        return suka;
    }

    public List<Komentar> getKomentar() {
        return komentar;
    }

    public void tambahkanSuka(Pengguna pengguna) {
        if (!suka.contains(pengguna)) {
            suka.add(pengguna);
            System.out.println(pengguna.getNamaPengguna() + " menyukai: " + konten);
        }
    }

    public int hitungJumlahSuka() {
        return suka.size();
    }

    public void tambahkanKomentar(Komentar komentar) {
        this.komentar.add(komentar);
        System.out.println(komentar.getPenulis().getNamaPengguna() + " berkomentar: " + komentar.getIsi());
    }
}
