public class Account {
    private String name;
    private int balance;
    private String bankName;
    private String iban;

    //constructor
    public Account(String name, int balance, String bankName, String iban) {
        this.name = name;
        this.balance = balance;
        this.bankName = bankName;
        this.iban = iban;
    }
    
    //this function transfers money to another account
    public void transferMoney(int money, Account toAccount){
        removeMoney(money);
        toAccount.addMoney(money);
    }

    //this function adds money to account
    public void addMoney(int money){
        System.out.println("For account holder " + name);
        System.out.println("Old money: " + balance);
        balance += money;
        System.out.println("New money: " + balance);
    }
    //this function removes money from account
    public void removeMoney(int money){
        System.out.println("For account holder " + name);
        System.out.println("Old money: " + balance);
        balance -= money;
        System.out.println("New money: " + balance);
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
