package soal1;

public class Sphere extends Shape{
  private Double radius;

  public Sphere(Double r, String shapeName){
    super(shapeName);
    radius = r;
  }

  @Override
  public Double area(){
    return 4 * Math.PI * radius * radius;
  }

  @Override
  public String toString(){
    return super.toString() + " dengan radius " + radius;
  }
}