package soal1;

public class Paint{
  private Double coverage;

  public Paint(Double c){
    coverage = c;
  }

  public Double amount(Shape s){
    System.out.println("Menghitung jumlah cat yang dibutuhkan untuk " + s);
    return s.area()/coverage;
  }
}