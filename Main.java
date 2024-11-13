public class Main {
    public static void main(String[] args) {
        Jaringan jaringan = new Jaringan();
        Pengguna alice = jaringan.tambahkanPengguna("Alice");
        Pengguna bob = jaringan.tambahkanPengguna("Bob");

        System.out.println();

        alice.buatPostingan("Halo, ini adalah postingan pertama Alice!");
        bob.buatPostingan("Hai semua, ini Bob!");
        jaringan.tambahkanPostingan(alice.getDaftarPostingan().get(0));
        jaringan.tambahkanPostingan(bob.getDaftarPostingan().get(0));
        
        System.out.println();

        bob.sukaiPostingan(alice.getDaftarPostingan().get(0));
        alice.sukaiPostingan(bob.getDaftarPostingan().get(0));
        
        System.out.println();

        alice.tambahkanKomentar(bob.getDaftarPostingan().get(0), "Postingan yang bagus, Bob!");
        bob.tambahkanKomentar(alice.getDaftarPostingan().get(0), "Terima kasih, Alice!");

        System.out.println("\nKomentar pada postingan Bob:");
        for (Komentar komentar : bob.getDaftarPostingan().get(0).getKomentar()) {
            System.out.println(komentar.getPenulis().getNamaPengguna() + " berkata: " + komentar.getIsi());
        }

        System.out.println("\nKomentar pada postingan Alice:");
        for (Komentar komentar : alice.getDaftarPostingan().get(0).getKomentar()) {
            System.out.println(komentar.getPenulis().getNamaPengguna() + " berkata: " + komentar.getIsi());
        }
    }
}
