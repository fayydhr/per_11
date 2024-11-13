public class Komentar {
    private User penulis;
    private String isi;

    public Komentar(User penulis, String isi) {
        this.penulis = penulis;
        this.isi = isi;
    }

    public User getPenulis() {
        return penulis;
    }

    public String getIsi() { // Tambahkan metode getIsi untuk mengakses isi dari komentar
        return isi;
    }
}
