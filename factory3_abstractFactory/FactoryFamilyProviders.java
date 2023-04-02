package designPatterns_github.designPatterns_github.factory3_abstractFactory;

public class FactoryFamilyProviders {
    public LibraryFactory createAbstractFactory(final BookType bookType) {
        switch (bookType) {
            case SCIENCE: return new ScienceFactory();
            case LITERATURE: return new LiteratureFactory();
        }
        throw new UnsupportedOperationException("Factory can't be produced!");
    }
}
