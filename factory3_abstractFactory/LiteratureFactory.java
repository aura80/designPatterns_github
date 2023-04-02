package designPatterns_github.designPatterns_github.factory3_abstractFactory;

public class LiteratureFactory implements LibraryFactory{
    @Override
    public Library createMiddleSchool() {
        return new LiteratureFictionMS();
    }

    @Override
    public Library createHighSchool() {
        return new LiteratureNonFictionHS();
    }

    @Override
    public Library createUniversity() {
        return new LiteraturePoetryU();
    }
}
