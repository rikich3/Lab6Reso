public class Novelas extends Book{
  protected String genero;
  public Novelas(String title, String author, Double price, String genero) {
    super(title, author, price);
    this.genero = genero;
  }
  // Getters
  public String getGenero() {
    return genero;
  }
  // Setters
  public void setGenero(String genero) {
    this.genero = genero;
  }
  
  // toString
  @Override
  public String toString() {
    return super.toString() + "\nGenero: " + genero;
  }
  
  // Print method
  public void print() {
    System.out.println(toString());
  }
}