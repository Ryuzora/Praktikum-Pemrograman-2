package soal1;

public class Cylinder extends Shape{
  private Double radius;
  private Double height;

  public Cylinder(Double r, Double h, String shapeName){
    super(shapeName);
    this.radius = r;
    this.height = h;
  }

  @Override
  public Double area(){
    return 2 * Math.PI * radius * (height + radius);
  }

  public String toString(){
    return super.toString() + " dengan radius " + radius + " dan tinggi " + height;
  }
}
