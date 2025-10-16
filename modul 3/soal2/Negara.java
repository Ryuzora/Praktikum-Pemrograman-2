package soal2;

import java.util.HashMap;

public class Negara{
  private String nama;
  private String jenisKepemimpinan;
  private String namaPemimpin;
  private int tanggalKemerdekaan;
  private int bulanKemerdekaan;
  private int tahunKemerdekaan;
  private int[] tanggalTerakhir = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  HashMap<Integer, String> namaBulan = new HashMap<>();

  Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan){
    this.nama = nama;
    this.jenisKepemimpinan = jenisKepemimpinan;
    this.namaPemimpin = namaPemimpin;
    setTahunKemerdekaan(tahunKemerdekaan);
    setBulanKemerdekaan(bulanKemerdekaan);
    setTanggalKemerdekaan(tanggalKemerdekaan);

    namaBulan.put(1, "Januari");
    namaBulan.put(2, "Februari");
    namaBulan.put(3, "Maret");
    namaBulan.put(4, "April");
    namaBulan.put(5, "Mei");
    namaBulan.put(6, "Juni");
    namaBulan.put(7, "Juli");
    namaBulan.put(8, "Agustus");
    namaBulan.put(9, "September");
    namaBulan.put(10, "Oktober");
    namaBulan.put(11, "November");
    namaBulan.put(12, "Desember");
  }

  private boolean isLeapYear(int tahun){
    return (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
  }

  //setter
  public void setTanggalKemerdekaan(int tanggalKemerdekaan){
    if (bulanKemerdekaan == 2 && isLeapYear(tahunKemerdekaan)){
      tanggalTerakhir[1] = 29;
    }
    this.tanggalKemerdekaan = (tanggalKemerdekaan > 0 && tanggalKemerdekaan <= tanggalTerakhir[bulanKemerdekaan-1]) ? tanggalKemerdekaan : 0;
  }
  
  public void setBulanKemerdekaan(int bulanKemerdekaan){
    this.bulanKemerdekaan = (bulanKemerdekaan > 0 && bulanKemerdekaan <= 12) ? bulanKemerdekaan : 0;
  }

  public void setTahunKemerdekaan(int tahunKemerdekaan){
    this.tahunKemerdekaan = tahunKemerdekaan < 2025 ? tahunKemerdekaan : 0;
  }

  //getter
  public String getNama(){
    return this.nama;
  }

  public String getJenisKepemimpinan(){
    return this.jenisKepemimpinan;
  }

  public String getNamaPemimpin(){
    return this.namaPemimpin;
  }

  public int getTanggalKemerdekaan(){
    return this.tanggalKemerdekaan;
  }

  public String getBulanDalamString(){
    return namaBulan.get(bulanKemerdekaan);
  }

  public int getTahunKemerdekaan(){
    return this.tahunKemerdekaan;
  }
}