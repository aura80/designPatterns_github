package designPatterns_github.designPatterns_github.singleton;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ElementNotFoundException {

        // Lazy Singleton

        BankAccountSingleton client1 = BankAccountSingleton.getInstance();
        BankAccountSingleton client2 = BankAccountSingleton.getInstance();
        BankAccountSingleton client3 = BankAccountSingleton.getInstance();
        BankAccountSingleton client4 = BankAccountSingleton.getInstance();
        BankAccountSingleton client5 = BankAccountSingleton.getInstance();
        System.out.println(client1.str1 + client1.getAccountMoney());
        client1.addMoney(1000);
        System.out.println(client1);
        client1.withdrawMoney(50);
        System.out.println(client1);
        client1.addMoney(200);
        System.out.println(client1);
        client2.addMoney(5000);
        System.out.println(client2);
        client2.addMoney(500);
        client5.withdrawAll();
        client2.addMoney(1254);
        client2.withdrawMoney(35);
        System.out.println(client2);
        client3.addMoney(3000);
        client4.addMoney(2500);
        client3.addMoney(4000);
        client5.addMoney(7550);
        client4.addMoney(300);
        System.out.println(client4);
        client3.withdrawMoney(35);
        System.out.println(client3);
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client4);
        System.out.println(client5);
        System.out.println(client4.str7 + Messages.str9 + client5.getName() + Messages.str9 +
                client2.getSurname() + Messages.str9 + client3.getAccountNumber() + BankAccountSingleton.str9 +
                client4.getAccountMoney() + client5.str5 + client1.getMoneyType() + Messages.str9 +
                BankAccountSingleton.str7);
        System.out.println(Messages.str8);
        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client3.hashCode());
        System.out.println(client4.hashCode());
        System.out.println(client5.hashCode());
        System.out.println();
        System.out.println(Messages.str12 + client1.equals(client2) + Messages.str9 + Messages.str23
                + client2.equals(client3) + BankAccountSingleton.str9 + Messages.str34 + client3.equals(client4)
                + Messages.str9 + Messages.str45 + client4.equals(client5));
        System.out.println();

        // Eager Singleton

        EagerClassSingleton eager1 = EagerClassSingleton.getInstanceEager();
        EagerClassSingleton eager2 = EagerClassSingleton.getInstanceEager();
        System.out.print("Do all the references point to the same object? - ");
        System.out.println(eager1 == eager2);
        System.out.printf("Do all the objects have the same content? - ");
        System.out.println(eager1.equals(eager2));
        System.out.println();
        System.out.println("Hashcode first object before adding students: " + eager1.hashCode());
        System.out.println("Hashcode second object before adding students: " + eager2.hashCode());
        System.out.println();
        System.out.println(eager1.getNoStudents());
        eager1.addNewStudents(2);
        System.out.println(eager2.getNoStudents());
        eager1.addNewStudents(3);
        eager1.addNewStudents(4);
        System.out.println(eager1.getNoStudents());
        eager1.addNewStudents(10);
        eager1.addNewStudents(3);
        eager1.addNewStudents(3);
        eager1.addNewStudents(5);
        System.out.println(eager1.getNoStudents());
        System.out.println();
        System.out.println("Hashcode first object after adding students: " + eager1.hashCode());
        System.out.println("Hashcode second object after adding students: " + eager2.hashCode());
        System.out.println();

        // Eager Singleton with Enum

        EagerEnumSingleton eagerEnum1 = EagerEnumSingleton.INSTANCE;
        EagerEnumSingleton eagerEnum2 = EagerEnumSingleton.getInstanceEnum();
        EagerEnumSingleton eagerEnum3 = EagerEnumSingleton.INSTANCE;

        System.out.println(eagerEnum1 == eagerEnum2 && eagerEnum2 == eagerEnum3 && eagerEnum1 == eagerEnum3);
        System.out.println(eagerEnum1.equals(eagerEnum2) && eagerEnum2.equals(eagerEnum3) && eagerEnum1.equals(eagerEnum3));
        System.out.println("Hashcode object 1 before adding subjects: " + eagerEnum1.hashCode());
        System.out.println("Hashcode object 1 before adding subjects: " + eagerEnum2.hashCode());
        System.out.println("Hashcode object 1 before adding subjects: " + eagerEnum3.hashCode());

        System.out.println(EagerEnumSingleton.getInstanceEnum());
        System.out.println(EagerEnumSingleton.INSTANCE);

//        System.out.println(eagerEnum3.getLista());    // will throw an ElementNotFoundException

        eagerEnum3.addLista("English");
        eagerEnum3.addLista("French");
        eagerEnum3.addLista("Biology");
        eagerEnum3.addLista("Mate");
        eagerEnum3.addLista(null);
        System.out.println(eagerEnum3.getLista());
        System.out.println(eagerEnum2.getLista());
        System.out.println(eagerEnum1.getLista());
        System.out.println(eagerEnum1.INSTANCE);
        System.out.println(eagerEnum2.getInstanceEnum());
        System.out.println(eagerEnum3);

        System.out.println("Hashcode object 1 after adding subjects: " + eagerEnum1.hashCode());
        System.out.println("Hashcode object 2 after adding subjects: " + eagerEnum2.hashCode());
        System.out.println("Hashcode object 3 after adding subjects: " + eagerEnum3.hashCode());

        System.out.println(eagerEnum1 == eagerEnum2 && eagerEnum2 == eagerEnum3 && eagerEnum1 == eagerEnum3);
        System.out.println(eagerEnum1.equals(eagerEnum2) && eagerEnum2.equals(eagerEnum3) && eagerEnum1.equals(eagerEnum3));

    }
}
