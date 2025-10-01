import java.util.Scanner;
public class PRAK105_2410817110008_MuhammadAzmaAlFaqih{
  public static void main(String[] args){
    final double PI = 3.14;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jari-jari: ");
    double radius = input.nextDouble();
    System.out.print("Masukkan tinggi: ");
    double tinggi = input.nextDouble();

    System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", (double) radius, (double) tinggi, HitungVolume.tabung(radius, tinggi, PI));
  }
}

class HitungVolume{
  public static double tabung(double radius, double tinggi, double PI){
    return PI * radius * radius * tinggi;
  }
}