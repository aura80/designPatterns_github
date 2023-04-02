package designPatterns_github.designPatterns_github.factory3_abstractFactory;

public class ScienceFactory implements LibraryFactory{
    @Override
    public Library createMiddleSchool() {
        return new ScienceMathMS();
    }

    @Override
    public Library createHighSchool() {
        return new ScienceBiologyHS();
    }

    @Override
    public Library createUniversity() {
        return new ScienceHistoryU();
    }
}
