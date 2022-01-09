import java.lang.*;
public class Account extends Customer implements ITransactions
{
    int accountNumber;
    double balance;
    Account(){}
    void setAccountNumber(int accountNumber){this.accountNumber = accountNumber;}
    void setBalance(double balance){this.balance = balance;}
    int getAccountNumber(){return this.accountNumber;}
    double getBalance(){return this.balance;}
    void showInfo()
    {
        for(int i=0;i<accounts.length;i++)
        {
            if(accounts[i] != null)
            {
                System.out.println("account number :"+accounts[i].getAccountNumber());
                System.out.println("account balance :"+accounts[i].getBalance());
            }
            else break;
        }
    }

    @Override
    public void deposit(double amount)
    {
        this.balance+=amount;
    }

    @Override
    public void withdraw(double amount)

    {
        if (this.balance==0){System.out.println("no balance in your account!");}
        else {
            if (amount > this.balance) {
                System.out.println("Insufficient balance !");
            } else {
                this.balance -= amount;
            }
        }
    }
}
