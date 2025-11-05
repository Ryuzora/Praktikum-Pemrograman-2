package soal1;
public abstract class Shape{
  protected String shapeName;

  Shape(String shapeName){
    this.shapeName = shapeName;
  }

  protected abstract Double area();

  public String toString(){
    return shapeName;
  }
}