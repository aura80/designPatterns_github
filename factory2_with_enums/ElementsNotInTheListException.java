package designPatterns_github.designPatterns_github.factory2_with_enums;

public class ElementsNotInTheListException extends RuntimeException{
    public ElementsNotInTheListException(String message) {
        super(message);
    }
}
