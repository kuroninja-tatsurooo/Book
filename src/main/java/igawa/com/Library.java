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

  public Book searchByTitle(String title) {
    for (Book book : bookList) {
      if (book.getTitle().startsWith(title)) {
        return book;
      }
    }
    return null;
  }

  public Book searchByAuthor(String author) {
    for (Book book : bookList) {
      if (book.getAuthor().equalsIgnoreCase(author)) {
        return book;
      }
    }
    return null;
  }

  public Book searchByNumber(int number) {
    for (Book book : bookList) {
      if (book.getNumber() == number) {
        return book;
      }
    }
    return null;
  }
}
