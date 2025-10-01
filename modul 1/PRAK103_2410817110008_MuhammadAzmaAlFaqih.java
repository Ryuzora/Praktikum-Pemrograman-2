import java.util.Scanner;
public class PRAK103_2410817110008_MuhammadAzmaAlFaqih{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int S = input.nextInt();
    Prints.print(N, S);
  }
}

class Prints{
  public static void print(int N, int S){
    int count = 0;
    int i = S;
    do {
      if (i % 2 != 0) {
        count++;
        System.out.print(i + " ");
      }
      i++;
    } while (count < N);
  }
}