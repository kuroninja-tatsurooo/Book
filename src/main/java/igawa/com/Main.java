package igawa.com;

public class Main {

  public static void main(String[] args) {
    Library library = new Library();

    library.addBook(new Book("告白", "湊かなえ", 1));
    library.addBook(new Book("阪急電車", "有川浩", 2));
    library.addBook(new Book("マスカレード・ホテル", "東野圭吾", 3));
    library.addBook(new Book("火車", "宮部みゆき", 4));
    library.addBook(new Book("ゴールデンスランバー", "伊坂幸太郎", 5));

    //タイトル検索
    Book book1 = library.searchByTitle("阪急");
    System.out.println("Title Search Result" + book1);

    //著者検索
    Book book2 = library.searchByAuthor("東野圭吾");
    System.out.println("Author Search Result" + book2);

    //番号検索
    Book book3 = library.searchByNumber(5);
    System.out.println("Number Search Result" + book3);
  }
}
