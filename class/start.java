import java.util.*;
public class start
{
    public static void main(String args[])
    {
        int temp;
        Scanner int_input = new Scanner(System.in);
        Scanner s_input = new Scanner(System.in);
       // menu m = new menu();
       // EmployeeOperations e1 = new Employee();
        Bank b = new Bank();

        while (true)
        {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management ");
            System.out.println("3. Account Transactions");
            System.out.println("4. Exit");
            temp = int_input.nextInt();

            if(temp == 1)
            {
                while (true) {
                    System.out.println("1. Insert New Employee");
                    System.out.println("2. Remove Existing Employee");
                    System.out.println("3. Show All Employees");
                    System.out.println("4. Going Back");
                    temp = int_input.nextInt();

                    if (temp == 1)
                    {

                        System.out.println("enter name :");
                        String n = s_input.nextLine();
                        System.out.println("enter salary :");
                        double s = int_input.nextDouble();
                        System.out.println("enter ID :");
                        String e = s_input.nextLine();

                        Employee emp = new Employee();

                        emp.setName(n);
                        emp.setSalary(s);
                        emp.setEmpId(e);

                        b.insertEmployee(emp);

                    }
                    else if (temp == 2)
                    {
                        System.out.print("Enter employee ID: ");
                        String str = s_input.nextLine();
                        Employee e = b.getEmployee(str);
                        if(e!=null)
                        {
                            b.removeEmployee(e);
                        }
                    }
                    else if (temp == 3)
                    {
                        b.showAllEmployees();
                    }
                    else if (temp == 4)
                    {
                        break;
                    }
                    else {
                        System.out.println("Choose an option from 1 - 4 !");
                       // temp = int_input.nextInt();
                    }
                }
            }
            else if(temp == 2)
            {
                while (true) {

                    System.out.println("1. Insert New Customer");
                    System.out.println("2. Remove Existing Customer");
                    System.out.println("3. Show All Customer");
                    System.out.println("4. Going Back");
                    temp = int_input.nextInt();

                    if (temp == 1) {
                        System.out.println("enter name :");
                        String n = s_input.nextLine();
                        System.out.println("enter NID :");
                        int i = int_input.nextInt();
                        System.out.println("enter account number :");
                        int acnum = int_input.nextInt();


                        Customer cus = new Customer();
                        Account acc = new Account();
                        acc.setAccountNumber(acnum);
                        acc.setBalance(0);
                        cus.setName(n);
                        cus.setNid(i);

                        cus.setAcc(acc);
                        b.insertCustomer(cus);
                    } else if (temp == 2) {
                        System.out.print("Enter Customer NID: ");
                        int nid1 = int_input.nextInt();

                        Customer c1 = b.getCustomer(nid1);

                        if (c1 != null) {
                            b.removeCustomer(c1);
                        }
                    } else if (temp == 3) {
                        b.showAllCustomers();
                    } else if (temp == 4) {
                        break;
                    } else {
                        System.out.println("Choose an option from 1 - 4 !");
                       // temp = int_input.nextInt();
                    }
                }
            }
            else if(temp == 3)
            {
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Going Back");
                temp = int_input.nextInt();

                while (true) {
                    if (temp == 1)
                    {
                        boolean f = false;
                        //for (int i=0;i<(b.customers).length;i++)
                     /*   while (true)
                        {
                            int i=0;
                            if (b.customers[i] == null)
                                {
                                    System.out.println("Create an account first !");
                                    f = true;
                                    break;
                                }
                            i++;
                        }*/
                        if(f==false)
                        {
                                System.out.println("how much to deposit :");
                                int d = int_input.nextInt();
                                System.out.println("Enter nid :");
                                int nid2 = int_input.nextInt();
                                System.out.println("Enter acc number :");
                                int acc_no = int_input.nextInt();

                                Customer c= b.getCustomer(nid2);
                                Account a=c.getAccount(acc_no);
                                a.deposit(d);
                        }


                    }
                    else if (temp == 2)
                    {
                        boolean f = false;
                        for (int i=0;i<(b.customers).length;i++)
                        {


                            if (b.customers[i] == null) {
                                System.out.println("Create an account first !");
                                f= true;
                                break;
                            } }
                        if(f==false){
                            System.out.println("how much to withdraw :");
                            int w = int_input.nextInt();
                            System.out.println("Enter nid :");
                            int nid2 = int_input.nextInt();
                            System.out.println("Enter acc number :");
                            int acc_no = int_input.nextInt();

                            (b.getCustomer(nid2)).getAccount(acc_no).withdraw(w);
                        }
                    } else if (temp == 3) {
                        break;
                    } else {
                        System.out.println("Choose an option from 1 - 3 !");
                        temp = int_input.nextInt();
                    }
                }
            }
            else if(temp == 4)
            {
                break;
            }
            else
                {
                    System.out.println("Choose an option from 1 - 4 !");
                    //temp = int_input.nextInt();
                }
        }
    }
}
