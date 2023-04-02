package designPatterns_github.designPatterns_github.factory3_abstractFactory;

public class ScienceHistoryU extends Science{
    private final String bookTitle;
    private final String bookAuthor;
    private final int bookNoPages;
    private final int bookShelf;
    private final boolean isOnShelf;

    public ScienceHistoryU() {
        super("The Emporium Room", 3);
        this.bookTitle = "Decebal Triumphant";
        this.bookAuthor = "Peter Jaska";
        this.bookNoPages = 299;
        this.bookShelf = 53;
        this.isOnShelf = true;
    }

    @Override
    public BookType getType() {
        return BookType.SCIENCE;
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
