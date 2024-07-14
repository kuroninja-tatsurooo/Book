package igawa.com;

public class Book {

  //属性
  String title;
  String author;
  int number;

  //コンストラクタ
  public Book(String title, String author, int number) {
    this.title = title;
    this.author = author;
    this.number = number;
  }

  //getterメソッド
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getNumber() {
    return number;
  }

  @Override
  public String toString() {
    return String.format("Book{title='%s',Author='%s',Number=%d}", title, author, number);
  }
}
