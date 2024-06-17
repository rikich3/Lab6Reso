public class UNSATextBooks extends TextBooks {
  protected String faculty;
  public UNSATextBooks(String title, String author, Double price, String subject, String faculty) {
    super(title, author, price, subject);
    this.faculty = faculty;
  }
  // Getters
  public String getFaculty() {
    return faculty;
  }
  // Setters
  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }
  @Override
  public String toString() {
    return super.toString() + ", Origin Faculty: " + faculty;
  }
  public void print() {
    System.out.println(toString());
  }
}
