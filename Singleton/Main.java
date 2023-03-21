package designPatterns_github.designPatterns_github.Singleton;


public class Main {
    public static void main(String[] args) {
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
    }
}
