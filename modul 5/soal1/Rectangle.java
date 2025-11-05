package soal1;

public class Rectangle extends Shape{
  private Double length;
  private Double width;

  public Rectangle(Double l, Double w, String shapeName){
      super(shapeName);
      length = l;
      width = w;
  }

  @Override
  public Double area(){
    return length * width;
  }

  @Override
  public String toString(){
    return super.toString() + " dengan panjang " + length + " dan lebar " + width ;
  }
}