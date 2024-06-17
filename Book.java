public class Book {
  protected String title;
  protected String author;
  protected Double price;
  public Book(String title, String author, Double price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }
  // Getters
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public Double getPrice() {
    return price;
  }

  // Setters
  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
  @Override
  public String toString() {
    return "Title: " + title + ", Author: " + author + ", Price: $" + price;
  }
  public void print() {
    System.out.println(toString());
  }
}