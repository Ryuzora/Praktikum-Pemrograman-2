import java.util.Scanner;
public class PRAK102_2410817110008_MuhammadAzmaAlFaqih {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int deret = input.nextInt();
      Print.print(deret);
    }
}

class Print{
  public static void print(int deret){
    int i = deret;
    while(i <= deret+10){
      if(i % 5 == 0){
        System.out.print(i/5-1);
      } else {
        System.out.print(i);
      }
      i++;
      System.out.print(" ");
    }
  }}