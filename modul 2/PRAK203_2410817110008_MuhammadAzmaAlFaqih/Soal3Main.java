public class Soal3Main {
	public static void main(String[] args) {
    Pegawai p1 = new Pegawai();
    // p1.nama = "Roi" salah karena tidak ada semicolon (;)
    // p1.nama = "Roi"
    p1.nama = "Roi";
    p1.asal = "Kingdom of Orvel";
    p1.setJabatan("Assassin");
    //nilai umur tidak pernah diisi
    p1.umur = 17;

    System.out.println("Nama Pegawai: " + p1.getNama());
    System.out.println("Asal: " + p1.getAsal());
    System.out.println("Jabatan: " + p1.jabatan);
    //string " tahun" tidak tidak ada
    //System.out.println("Umur: " + p1.umur );
    System.out.println("Umur: " + p1.umur + " tahun");
  }
}