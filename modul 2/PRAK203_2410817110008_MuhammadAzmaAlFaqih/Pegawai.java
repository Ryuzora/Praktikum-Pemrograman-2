// Terdapat perbedaan antara class public dengan nama file
// public class Employee
public class Pegawai {
  public String nama;
  // tipe data char hanya dapat menampun 1 karakter dan tidak cocok untuk menyimpan nilai asal
  // public char asal;
  public String asal;
  public String jabatan;
  public int umur;

  public String getNama() {
    return nama;
  }

  public String getAsal() {
    return asal;
  }
  // Pada file main, method setJabatan() memiliki argument namun tidak terdapat parameter di method setJabatan di bawah
  // public void setJabatan() {
  public void setJabatan(String j) {
    this.jabatan = j;
  }
}