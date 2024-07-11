
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account firstAccount = new Account("Matthews account", 1000);
        Account secondAccount = new Account("My account", 0);
        
        firstAccount.withdrawal(100.0);
        secondAccount.deposit(100.0);
        
        System.out.println(firstAccount);
        System.out.println(secondAccount);
    }
}
