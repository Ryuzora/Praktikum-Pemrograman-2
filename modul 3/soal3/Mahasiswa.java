package soal3;

public class Mahasiswa{
  private String nama;
  private String nim;

  Mahasiswa(String nama, String nim){
    setNama(nama);
    setNim(nim);
  }

  //setter
  public void setNama(String nama){
    this.nama = nama;
  }

  public void setNim(String nim){
    this.nim = nim;
  }

  //getter
  public String getNama(){
    return nama;
  }

  public String getNim(){
    return nim;
  }
}