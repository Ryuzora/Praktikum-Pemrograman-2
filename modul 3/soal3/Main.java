package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

    while(true){
      System.out.println("\nMenu:");
      System.out.println("1. Tambah Mahasiswa");
      System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
      System.out.println("3. Cari Mahasiswa berdasarkan NIM");
      System.out.println("4. Tampilkan Daftar Mahasiswa");
      System.out.println("0. Keluar");
      System.out.print("Pilihan: ");
      int pilihan = input.nextInt();
      input.nextLine();
      String nama, nim;

      switch (pilihan) {
        case 1:
          System.out.print("Masukkan Nama Mahasiswa: " );
          nama = input.nextLine();
          System.out.print("Masukkan NIM Mahasiswa (harus unik): " );
          nim = input.nextLine();
          boolean isExist = false;
          for (Mahasiswa i : listMahasiswa){
            if (i.getNim().equals(nim)){
              isExist = true;
              break;
            }
          } 
          if(isExist){
            System.out.println("Sudah ada Mahasiswa dengan NIM yang sama!");
          } else {
            listMahasiswa.add(new Mahasiswa(nama, nim));
            System.out.println("Mahasiswa " + nama + " ditambahkan.");
          }

          break;

        case 2:
          System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
          nim = input.nextLine();

          boolean isRemoved = listMahasiswa.removeIf(i -> i.getNim().equals(nim));
          if (isRemoved){
            System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
          } else {
            System.out.println("Tidak ada Mahasiswa dengan NIM " + nim + "!");
          }
          break;

        case 3:
          System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
          nim = input.nextLine();
          boolean isFound = false;
          for (Mahasiswa i : listMahasiswa){
            if (i.getNim().equals(nim)){
              isFound = true;
              System.out.println("Ditemukan Mahasiswa dengan NIM " + nim + " adalah: " + i.getNama());
              break;
            }
          }
          if (!isFound) System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan!");
          break;

        case 4:
          System.out.println("Daftar Mahasiswa:");
          for (Mahasiswa i : listMahasiswa){
            System.out.println("NIM: " + i.getNim() + ", Nama: " + i.getNama());
          }
          break;
        case 0:
          System.out.println("Terima kasih!");
          input.close();
          return;

        default:
          System.out.println("Pilihan tidak valid!");
          break;
      }
    }
  }
}