
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account A = new Account("A", 100.00);
        Account B = new Account ("B", 0.00);
        Account C = new Account("C", 0.00);
        transfer(A, B, 50.0);
        transfer(B, C, 25.0);
        
    }
    public static void transfer(Account from, Account to, double howmuch) {
        from.withdrawal(howmuch);
        to.deposit(howmuch);
    }

}
