package soal1;

import java.util.Random;
import java.util.LinkedList;

public class Dadu{

  private int rolls;
  private LinkedList<Integer> list = new LinkedList<>();

  public void acakNilai(){
  Random random = new Random();
    for (int i = 0; i < rolls; i++) {
      int p = random.nextInt(6)+1;
      list.add(p);
    }
  }

  public void setRolls(int p){
    this.rolls = p > 0 ? p : 0;
  }

  public void print(){
    if (rolls == 0 ){
      System.out.println("Tidak ada dadu yang dilempar");
      return;
    }
    int sum = 0;
    for (int i = 0; i < rolls; i++){
      int diceValue = list.pop();
      System.out.println("Dadu ke-" + (i+1) + " bernilai " + diceValue);
      sum += diceValue;
    }
    System.out.println("Total nilai dadu keseluruhan " + sum);
  }
}