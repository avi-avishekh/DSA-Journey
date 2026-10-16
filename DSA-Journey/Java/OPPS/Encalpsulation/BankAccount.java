package OPPS.Encalpsulation;
public class BankAccount {
    public static void main(String[]args){
        A1 A=new A1();
        A.name="Avishekh";
        A.SetBalance(1000);
        A.SetAccountNo(34578986);

        A.display();
    }
}

class A1{
    String name;
    private int Balance;
    private int AccountNo;
    A1(){
        System.out.println("Account Created");
        
    }
    public void SetBalance(int Balance){
        this.Balance=Balance;
    }
    public int GetBalance(){
        return Balance;
    }
    public void SetAccountNo(int AccountNo){
        this.AccountNo=AccountNo;
    }
    public int GetAccountNo(){
        return AccountNo;
    }

    void display(){
        System.out.println("Account Holder Name:"+name);
        System.out.println("Account Holder Balance:"+Balance);
        System.out.println("Account Holder AccountNo:"+AccountNo);
    }
}

