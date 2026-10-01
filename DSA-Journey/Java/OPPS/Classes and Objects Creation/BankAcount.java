public class BankAcount {
    public static void main (String[]args){

        Account a1=new Account();
        a1.accountholder="Avishekh";
        a1.balance=100000;

        a1.deposit(10579);
        a1.withdraw(10000);

        a1.displayBalance();
    }
    
}

class Account{
    String accountholder;
    double balance;

    void deposit(int amount){
        balance=balance+amount;
        System.out.println("Current Balance:"+ balance);
    }
    void withdraw(int amount){
        balance=balance-amount;
        System.out.println("Balance After Withdraw:"+balance);
    }

    void displayBalance(){
        System.out.println("Accountholder:"+accountholder);
        System.out.println("Balance:"+balance);
    }

}