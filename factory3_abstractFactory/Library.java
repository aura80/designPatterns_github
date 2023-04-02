package designPatterns_github.designPatterns_github.factory3_abstractFactory;

import java.lang.reflect.Type;

public interface Library {
    BookType getType();
    String getTitleBook();
    String getNameAuthor();
    int getNoPages();
    int getShelf();
    boolean isOnShelf();
    String getDepositRoom();
    int getLevel();
}
