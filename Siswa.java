public class Siswa {
    private String nama;
    private String kelas;
    private String noInduk;
    private int nilai;

    public Siswa(String nama, String kelas, String noInduk, int nilai){
        this.nama = nama;
        this.kelas  = kelas;
        this.noInduk = noInduk;
        this.nilai = nilai;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}
