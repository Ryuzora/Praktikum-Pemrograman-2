import java.util.Scanner;
public class PRAK104_2410817110008_MuhammadAzmaAlFaqih {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Tangan Abu: ");
    char[] tanganAbu = input.nextLine().toCharArray();
    System.out.print("Tangan Bagas: ");
    char[] tanganBagas = input.nextLine().toCharArray();

    Hitung.skor(tanganAbu, tanganBagas);
  }
}

class Hitung{
  public static void skor(char[] tanganAbu, char[] tanganBagas){
    int skorAbu = 0;
    int skorBagas = 0;
    for(int i = 0; i < 3; i++){
      char abu = tanganAbu[i];
      char bagas = tanganBagas[i];

      if (abu == bagas) continue;
      else if ((abu == 'G' && bagas == 'K') || (abu == 'K' && bagas == 'B') || (abu == 'B' && bagas == 'G')) skorAbu++;
      else skorBagas++;
      }
    if (skorAbu == skorBagas) {
      System.out.println("Seri");
    } else if ( skorAbu > skorBagas) {
      System.out.println("Abu");
    } else {
      System.out.println("Bagas");
    }
  }
}