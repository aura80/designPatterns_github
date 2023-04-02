package designPatterns_github.designPatterns_github.factory3_abstractFactory;

public class LiteraturePoetryU extends Literature{
    private final String bookTitle;
    private final String bookAuthor;
    private final int bookNoPages;
    private final int bookShelf;
    private final boolean isOnShelf;

    public LiteraturePoetryU() {
        super("The Nightingale's Song Room", 9);
        this.bookTitle = "Wheel With a Single Spoke: and Other Poems";
        this.bookAuthor = "Nichita Stanescu";
        this.bookNoPages = 324;
        this.bookShelf = 110;
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
