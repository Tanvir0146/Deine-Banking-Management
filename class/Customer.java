public class Customer extends Bank implements AccountOperations
{
    String name;
    int nid;
    Account accounts[] = new Account[500];
    void setName(String name){this.name = name;}
    void setNid(int nid){this.nid = nid;}
    String getName(){return name;}
    int getNid(){return nid;}
    void setAcc(Account a)
    {

        for(int i=0; i<accounts.length; i++)
        {
            if(accounts[i] != null)
            {
                accounts[i]=a;
                break;
                }
            }
     // accounts = a;
        }

    Account[] getAcc(){return accounts;}


    @Override
    public void insertAccount(Account a)
    {
        for(int i=0; i<accounts.length; i++)
        {
            if(accounts[i] == null)
            {
                accounts[i] = a;
                System.out.println("Account inserted");
                break;
            }
        }
      // accounts =a;
    }

    @Override
    public void removeAccount(Account a)
    {
       for(int i=0; i<accounts.length; i++)
        {
            if(accounts[i] == a)
            {
                accounts[i] = null;
                System.out.println("Account removed");
                break;
            }
        }
     // accounts=null;
    }

    @Override
    public Account getAccount(int accountNumber)
    {
        Account a = null;

        for(int i=0; i<accounts.length; i++)
        {
            if(accounts[i] != null)
            {
                if(accounts[i].getAccountNumber() == accountNumber)
                {
                    a = accounts[i];
                    break;
                }
            }
        }
        return a;
    }

    @Override
    public void showAllAccounts()
    {
        for(int i=0;i<accounts.length;i++)
        {
            if(accounts[i] != null)
            {
                accounts[i].showInfo();
            }
        }
    }
}
