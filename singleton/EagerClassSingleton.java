package designPatterns_github.designPatterns_github.singleton;

import java.util.Objects;

public class EagerClassSingleton {
    // static field which keeps the singleton reference
    private static final EagerClassSingleton INSTANCE = new EagerClassSingleton("IV-B");
    private int noStudents = 0;
    private String yearOfStudents;


    // getter for singleton reference
    public static EagerClassSingleton getInstanceEager() {
        return INSTANCE;
    }

    // hidden constructor
    public EagerClassSingleton(String yearOfStudents) {
        this.yearOfStudents = yearOfStudents;
    }

    public String getNoStudents() {
        String result = "";
        if (this.noStudents >= 0 && this.noStudents <= 25) {
            result = "Students in class: " + this.noStudents;
        }
        return result;
    }

    public void addNewStudents(int newStudent) {
        this.noStudents += newStudent;
        if (this.noStudents >= 0 && this.noStudents <= 25) {
            System.out.println("Class " + yearOfStudents + " has " + this.noStudents + " students");
        } else {
            System.out.println("Too many students to add. Limit of 25 exceeded!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EagerClassSingleton that = (EagerClassSingleton) o;
        return noStudents == that.noStudents && Objects.equals(yearOfStudents, that.yearOfStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noStudents, yearOfStudents);
    }
}
