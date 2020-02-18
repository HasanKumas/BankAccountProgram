public class AccountApplication {
    public static void main(String[] args) {
        //creating accounts
        Account account1 = new Account("Piet Mondrian", 2000, "ING", "NL 91 INGB 12345");
        Account account2 = new Account("Mona Lisa", 5000, "ABN AMRO", "NL 91 ABNA 12345");
        Account account3 = new Account("John Doe", 10000, "RABOBANK", "NL 91 RABO 12345");

        //adding and removing money
        account1.addMoney(1000);
        account2.removeMoney(3000);
        account3.removeMoney(15000);
        account1.addMoney(1500);
        account1.removeMoney(100);
        account3.addMoney(5500);
        account2.removeMoney(142);

        //transferring money to another account
        account2.transferMoney(500, account3);
        account1.transferMoney(400, account2);
    }
}
