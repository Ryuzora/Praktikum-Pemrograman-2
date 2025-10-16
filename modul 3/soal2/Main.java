package soal2;
import java.util.Scanner;
import java.util.LinkedList;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    LinkedList<Negara> listNegara = new LinkedList<>();

    int n = input.nextInt();
    input.nextLine();
    for (int i = 0; i < n; i++) {
      String nama = input.nextLine();
      String jenisKepemimpinan = input.nextLine();
      String namaPemimpin = input.nextLine();
      int tanggalKemerdekaan = 0;
      int bulanKemerdekaan = 0;
      int tahunKemerdekaan = 0;
      if ( !jenisKepemimpinan.equalsIgnoreCase("monarki")){
        tanggalKemerdekaan = input.nextInt();
        bulanKemerdekaan = input.nextInt();
        tahunKemerdekaan = input.nextInt();
        input.nextLine();
      }
      listNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan));
    }
    for (int i = 0; i < n; i++) {
      Negara negara = listNegara.pop();
      if (!negara.getJenisKepemimpinan().equalsIgnoreCase("monarki")){
        System.out.println("\nNegara " + negara.getNama() + " mempunyai " + negara.getJenisKepemimpinan() + " bernama " + negara.getNamaPemimpin());
        System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + negara.getBulanDalamString() + " " + negara.getTahunKemerdekaan());
      } else {
        System.out.println("\nNegara " + negara.getNama() + " mempunyai Raja bernama " + negara.getNamaPemimpin());
      }
    }
    input.close();
  }
}