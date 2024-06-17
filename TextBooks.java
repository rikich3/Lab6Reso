public class TextBooks extends Book{
  protected String subject;
  public TextBooks(String title, String author, Double price, String subject) {
    super(title, author, price);
    this.subject = subject;
  }
  // Getters
  public String getSubject() {
    return subject;
  }

  // Setters
  public void setSubject(String subject) {
    this.subject = subject;
  }
  @Override
  public String toString() {
    return super.toString() + ", Subject: " + subject;
  }
  public void print() {
    System.out.println(toString());
  }
}
