package designPatterns_github.designPatterns_github.factory3_abstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        BookType bookType1 = BookType.LITERATURE;
        BookType bookType2 = BookType.SCIENCE;
        System.out.println(bookType1);
        System.out.println(bookType2);
        System.out.println();
        FactoryFamilyProviders providers = new FactoryFamilyProviders();
        System.out.println(providers.createAbstractFactory(bookType1).createHighSchool());
        System.out.println(providers.createAbstractFactory(bookType1).createMiddleSchool());
        System.out.println(providers.createAbstractFactory(bookType1).createUniversity());
        System.out.println();
        System.out.println(providers.createAbstractFactory(bookType2).createHighSchool());
        System.out.println(providers.createAbstractFactory(bookType2).createMiddleSchool());
        System.out.println(providers.createAbstractFactory(bookType2).createUniversity());
        System.out.println();
        System.out.println(BookType.UNIVERSITY);
        LibraryFactory libraryFactory1 = new FactoryFamilyProviders().createAbstractFactory(bookType1);
        System.out.println(libraryFactory1.createUniversity().getNameAuthor() + "  -  "
        + libraryFactory1.createUniversity().getTitleBook() + "  -  " + libraryFactory1.createUniversity().isOnShelf());
        LibraryFactory libraryFactory2 = new FactoryFamilyProviders().createAbstractFactory(bookType2);
        System.out.println(libraryFactory2.createUniversity().getNameAuthor() + "  -  "
        + libraryFactory2.createUniversity().getTitleBook() + "  -  " + libraryFactory2.createUniversity().isOnShelf());
        System.out.println();
        System.out.println(BookType.HIGH_SCHOOL);
        LibraryFactory libraryFactory3 = new FactoryFamilyProviders().createAbstractFactory(bookType1);
        System.out.println(libraryFactory3.createUniversity().getNameAuthor() + "  -  "
        + libraryFactory3.createUniversity().getTitleBook() + "  -  " + libraryFactory3.createUniversity().isOnShelf());
        LibraryFactory libraryFactory4 = new FactoryFamilyProviders().createAbstractFactory(bookType2);
        System.out.println(libraryFactory4.createUniversity().getNameAuthor() + "  -  "
        + libraryFactory4.createUniversity().getTitleBook() + "  -  " + libraryFactory4.createUniversity().isOnShelf());
        System.out.println();
        System.out.println(BookType.MIDDLE_SCHOOL);
        LibraryFactory libraryFactory5 = new FactoryFamilyProviders().createAbstractFactory(bookType1);
        System.out.println(libraryFactory5.createUniversity().getNameAuthor() + "  -  "
        + libraryFactory5.createUniversity().getTitleBook() + "  -  " + libraryFactory5.createUniversity().isOnShelf());
        LibraryFactory libraryFactory6 = new FactoryFamilyProviders().createAbstractFactory(bookType2);
        System.out.println(libraryFactory6.createUniversity().getNameAuthor() + "  -  "
        + libraryFactory6.createUniversity().getTitleBook() + "  -  " + libraryFactory6.createUniversity().isOnShelf());
    }
}
