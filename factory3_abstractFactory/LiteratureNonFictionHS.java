package designPatterns_github.designPatterns_github.factory3_abstractFactory;

public class LiteratureNonFictionHS extends Literature{
    private final String bookTitle;
    private final String bookAuthor;
    private final int bookNoPages;
    private final int bookShelf;
    private final boolean isOnShelf;

    public LiteratureNonFictionHS() {
        super("Creative Nonfiction", 8);
        this.bookTitle = "A Book of Mediterranean Food";
        this.bookAuthor = "Elizabeth David";
        this.bookNoPages = 200;
        this.bookShelf = 204;
        this.isOnShelf = false;
    }

    @Override
    public BookType getType() {
        return BookType.LITERATURE;
    }

    @Override
    public String getTitleBook() {
        return this.bookTitle;
    }

    @Override
    public String getNameAuthor() {
        return this.bookAuthor;
    }

    @Override
    public int getNoPages() {
        return this.bookNoPages;
    }

    @Override
    public int getShelf() {
        return this.bookShelf;
    }

    @Override
    public boolean isOnShelf() {
        return this.isOnShelf;
    }
}
