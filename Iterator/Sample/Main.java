package Iterator.Sample;

public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("1冊目の本"));
    bookShelf.appendBook(new Book("2冊目の本"));
    bookShelf.appendBook(new Book("3冊目の本"));
    bookShelf.appendBook(new Book("4冊目の本"));

    Iterator it = bookShelf.iterator();

    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }
  }
}