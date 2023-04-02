package designPatterns_github.designPatterns_github.factory3_abstractFactory;

public abstract class AbstractLibrary implements Library{
    @Override
    public String toString() {
        return "AbstractLibrary{} - Author: " + getNameAuthor() + "\nBook: " + getTitleBook() + "\nRoom: "
                + getDepositRoom() + "\nLevel: " + getLevel() + "\nShelf: " + getShelf()
                + "\nPages: " + getNoPages() + "\nOn shelf: " + isOnShelf();
    }
}
