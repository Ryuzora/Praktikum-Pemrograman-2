import java.util.Scanner;

public class PRAK101_2410817110008_MuhammadAzmaAlFaqih{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Nama Lengkap: ");
    String nama = input.nextLine();
    System.out.print("Masukkan Tempat Lahir: ");
    String tempatLahir = input.nextLine();
    System.out.print("Masukkan Tanggal Lahir: ");
    int tanggalLahir = input.nextInt();
    System.out.print("Masukkan Bulan Lahir: ");
    int bulanLahir = input.nextInt();
    System.out.print("Masukkan Tahun Lahir: ");
    int tahunLahir = input.nextInt();
    System.out.print("Masukkan Tinggi Badan: ");
    int tinggiBadan = input.nextInt();
    if(tinggiBadan < 1 )System.exit(0);
    System.out.print("Masukkan Berat Badan: ");
    double beratBadan = input.nextDouble();
    if(beratBadan < 1 )System.exit(0);

    String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

    System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + bulan[bulanLahir-1] + " " + tahunLahir + " Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " Kilogram");
  }
}