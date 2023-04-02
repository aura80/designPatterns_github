package designPatterns_github.designPatterns_github.factory3_abstractFactory;

public class ScienceMathMS extends Science{
    private final String bookTitle;
    private final String bookAuthor;
    private final int bookNoPages;
    private final int bookShelf;
    private final boolean isOnShelf;

    public ScienceMathMS() {
        super("Exact Sciences 75B Room", 3);
        this.bookTitle = "Exercises and Math Problems";
        this.bookAuthor = "Grigore Gheba";
        this.bookNoPages = 407;
        this.bookShelf = 42;
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
