package igawa.com;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Library library = new Library();

    library.addBook(new Book("告白", "湊かなえ", 1));
    library.addBook(new Book("阪急電車", "有川浩", 2));
    library.addBook(new Book("マスカレード・ホテル", "東野圭吾", 3));
    library.addBook(new Book("火車", "宮部みゆき", 4));
    library.addBook(new Book("ゴールデンスランバー", "伊坂幸太郎", 5));
    library.addBook(new Book("容疑者Xの献身", "東野圭吾", 6));
    library.addBook(new Book("マスカットハウス", "角角鹿鹿", 7));

    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        System.out.println("検索方法を選択してください：1 タイトル　2 著者　3 番号　4 終了");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 4) {
          break;
        }

        switch (choice) {
          case 1:
            System.out.println("タイトルを入力してください");
            String title = scanner.nextLine();
            List<Book> bookByTitle = library.searchByTitle(title);
            if (bookByTitle.isEmpty()) {
              System.out.println("お探しのものはありません");
            } else {
              System.out.println("検索結果：");
              for (Book book : bookByTitle) {
                System.out.println(book);
              }
            }
            break;
          case 2:
            System.out.println("著者を入力してください");
            String author = scanner.nextLine();
            List<Book> bookByAuthor = library.searchByAuthor(author);
            if (bookByAuthor.isEmpty()) {
              System.out.println("お探しのものはありません");
            } else {
              System.out.println("検索結果：");
              for (Book book : bookByAuthor) {
                System.out.println(book);
              }
            }
            break;
          case 3:
            System.out.println("番号を入力してください");
            int number = scanner.nextInt();
            List<Book> bookByNumber = library.searchByNumber(number);
            if (bookByNumber.isEmpty()) {
              System.out.println("お探しのものはありません");
            } else {
              System.out.println("検索結果：");
              for (Book book : bookByNumber) {
                System.out.println(book);
              }
            }
            break;
          default:
            System.out.println("もう一度、検索方法1～4を選択してください");
        }
      } catch (InputMismatchException e) {
        System.out.println("無効です。数字を入力してください");
        scanner.next();
      }
    }
    scanner.close();
  }
}
