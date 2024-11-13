import java.util.ArrayList;
import java.util.List;

public class Pengguna {
    private String namaPengguna;
    private List<Postingan> daftarPostingan;
    private List<Pengguna> pengikut;
    private List<Pengguna> diikuti;

    public Pengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
        this.daftarPostingan = new ArrayList<>();
        this.pengikut = new ArrayList<>();
        this.diikuti = new ArrayList<>();
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public void ikutiPengguna(Pengguna penggunaLain) {
        if (!diikuti.contains(penggunaLain)) {
            diikuti.add(penggunaLain);
            penggunaLain.tambahkanPengikut(this);
            System.out.println(namaPengguna + " mengikuti " + penggunaLain.getNamaPengguna());
        }
    }

    private void tambahkanPengikut(Pengguna penggunaLain) {
        if (!pengikut.contains(penggunaLain)) {
            pengikut.add(penggunaLain);
        }
    }

    public List<Pengguna> getPengikut() {
        return pengikut;
    }

    public List<Pengguna> getDiikuti() {
        return diikuti;
    }

    public void buatPostingan(String konten) {
        Postingan postingan = new Postingan(this, konten);
        daftarPostingan.add(postingan);
        System.out.println(namaPengguna + " membuat postingan: " + konten);
    }

    public void sukaiPostingan(Postingan postingan) {
        postingan.tambahkanSuka(this);
    }

    public List<Postingan> getDaftarPostingan() {
        return daftarPostingan;
    }

    public void tambahkanKomentar(Postingan postingan, String isiKomentar) {
        Komentar komentar = new Komentar(this, isiKomentar);
        postingan.tambahkanKomentar(komentar);
    }
}
