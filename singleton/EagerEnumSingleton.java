package designPatterns_github.designPatterns_github.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum EagerEnumSingleton {
    INSTANCE;

    private List<String> values = new ArrayList<>();

    EagerEnumSingleton() {
        System.out.println("Eager enum");
    }

    public static EagerEnumSingleton getInstanceEnum() {
        return INSTANCE;
    }

    public List<String> getLista() throws ElementNotFoundException {
        if (values.isEmpty()) {
            throw new ElementNotFoundException("List is empty");
        }
        return values;
    }

    public void addLista(String val) {
        values.add(val);
    }

}
