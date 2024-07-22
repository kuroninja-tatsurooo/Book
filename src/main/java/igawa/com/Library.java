package igawa.com;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private List<Book> bookList;

  public Library() {
    this.bookList = new ArrayList<>();
  }

  public void addBook(Book book) {
    bookList.add(book);
  }

  public List<Book> searchByTitle(String title) {
    List<Book> result = new ArrayList<>();
    for (Book book : bookList) {
      if (book.getTitle().startsWith(title)) {
        result.add(book);
      }
    }
    return result;
  }

  public List<Book> searchByAuthor(String author) {
    List<Book> result = new ArrayList<>();
    for (Book book : bookList) {
      if (book.getAuthor().startsWith(author)) {
        result.add(book);
      }
    }
    return result;
  }

  public List<Book> searchByNumber(int number) {
    List<Book> result = new ArrayList<>();
    for (Book book : bookList) {
      if (book.getNumber() == number) {
        result.add(book);
      }
    }
    return result;
  }
}
