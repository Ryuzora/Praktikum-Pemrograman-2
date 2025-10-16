package soal1;

import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Dadu dadu1 = new Dadu();

    int rolls = input.nextInt();
    dadu1.setRolls(rolls);
    dadu1.acakNilai();
    dadu1.print();
    input.close();
  }
}