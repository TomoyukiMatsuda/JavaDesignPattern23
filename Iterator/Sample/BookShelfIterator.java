package Iterator.Sample;

public class BookShelfIterator implements Iterator {
  private BookShelf bookShelf;
  private int index;

  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.index = 0;
  }

  // 次にメソッドを読んでも大丈夫かを調べるもの
  @Override
  public boolean hasNext() {
    if (index < bookShelf.getLength()) {
      // 本棚に次の本があればtrue
      return true;
    } else {
      // 次の本がなければfalse
      return false;
    }
  }

  // 現在の要素を返しつつ、次の位置に進める
  @Override
  public Object next() {
    Book book = bookShelf.getBookAt(index);
    index++;
    return book;
  }
}
