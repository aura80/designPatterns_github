package designPatterns_github.designPatterns_github.factory3_abstractFactory;

public class ScienceBiologyHS extends Science{
    private final String bookTitle;
    private final String bookAuthor;
    private final int bookNoPages;
    private final int bookShelf;
    private final boolean isOnShelf;

    public ScienceBiologyHS() {
        super("Genesis Room", 2);
        this.bookTitle = "The Origin of Species";
        this.bookAuthor = "Charles Darwin";
        this.bookNoPages = 568;
        this.bookShelf = 31;
        this.isOnShelf = false;
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
