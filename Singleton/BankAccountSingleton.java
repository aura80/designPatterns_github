package designPatterns_github.Singleton;

import java.util.Objects;

public class BankAccountSingleton implements Messages{

    private static BankAccountSingleton instance = null;
    private String name;
    private String surname;
    private String accountNumber;
    private int accountMoney;
    private String moneyType;

    public BankAccountSingleton(String name, String surname, String accountNumber, String moneyType) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.accountMoney = 0;
        this.moneyType = moneyType;
    }

    public static BankAccountSingleton getInstance() {
        if (instance == null) {
            instance = new BankAccountSingleton(constr1, constr2, constr3, constr4);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAccountMoney() {
        return this.accountMoney;
    }

    public int addMoney(int sum) {
        System.out.println(str2 + sum + str5 + getMoneyType() + str4);
        return this.accountMoney += sum;
    }

    public int withdrawMoney(int sum) {
        System.out.println(str3 + sum + str5 + getMoneyType() + str4);
        return this.accountMoney -= sum;
    }

    public void withdrawAll() {
        System.out.println(str6);
        this.accountMoney = 0;
    }

    public String getMoneyType() {
        return moneyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccountSingleton that = (BankAccountSingleton) o;
        return accountNumber == that.accountNumber && accountMoney == that.accountMoney
                && Objects.equals(name, that.name) && Objects.equals(surname, that.surname)
                && Objects.equals(moneyType, that.moneyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, accountNumber, accountMoney, moneyType);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{")
                .append(this.name).append(", ").append(this.surname).append(", ").append(this.accountNumber)
                .append(" - ").append(this.accountMoney).append(" ").append(this.moneyType).append("}");
        return stringBuilder.toString();
    }
}
