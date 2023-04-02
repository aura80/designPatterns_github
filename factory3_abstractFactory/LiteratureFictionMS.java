package designPatterns_github.designPatterns_github.factory3_abstractFactory;

public class LiteratureFictionMS extends Literature{
    private final String bookTitle;
    private final String bookAuthor;
    private final int bookNoPages;
    private final int bookShelf;
    private final boolean isOnShelf;

    public LiteratureFictionMS() {
        super("The Wizard", 8);
        this.bookTitle = "The Great Gatsby";
        this.bookAuthor = "F. Scott Fitzgerald";
        this.bookNoPages = 193;
        this.bookShelf = 82;
        this.isOnShelf = true;
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
