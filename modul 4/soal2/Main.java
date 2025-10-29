package soal2;
import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Pilih jenis hewan yang ingin diinputkan");
    System.out.println("1 = Kucing");
    System.out.println("2 = Anjing");
    System.out.print("Masukkan pilihan: ");
    int pilihan = input.nextInt();
    input.nextLine();
    if (pilihan == 1){
      System.out.print("Nama hewan peliharaan: ");
      String nama = input.nextLine();
      System.out.print("Ras: ");
      String ras = input.nextLine();
      System.out.print("Warna Bulu: ");
      String warnaBulu = input.nextLine();

      Kucing kucing = new Kucing(ras, nama, warnaBulu);
      kucing.displayDetailKucing();
    } else if (pilihan == 2){
      System.out.print("Nama hewan peliharaan: ");
      String nama = input.nextLine();
      System.out.print("Ras: ");
      String ras = input.nextLine();
      System.out.print("Warna Bulu: ");
      String warnaBulu = input.nextLine();
      System.out.print("Kemampuan : ");
      String k = input.nextLine();
      String kemampuan[] = k.split(", ");

      Anjing anjing = new Anjing(ras, nama, warnaBulu, kemampuan);
      anjing.displayDetailAnjing();
    }

    input.close();
  }
}