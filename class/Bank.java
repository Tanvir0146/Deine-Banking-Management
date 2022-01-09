public class Bank implements CustomerOperations, EmployeeOperations
{
    Customer customers[] = new Customer [500];
    Employee employees[] = new Employee [100];

    Bank(){}


    @Override
    public void setEmployees(Employee e) {}

    @Override
    public Employee getEmployee(String empId)
    {
        Employee e = null;

        for(int i=0; i<employees.length; i++)
        {
            if(employees[i] != null)
            {
                if(employees[i].getEmpId() == empId)
                {
                    e = employees[i];
                    break;
                }
            }
        }
        return e;
    }

    @Override
    public void insertEmployee(Employee e)
    {
        for(int i=0; i<employees.length; i++)
        {
            if(employees[i] == null)
            {
                employees[i] = e;
                System.out.println("Employee created");
                break;
            }
        }
    }

    @Override
    public void removeEmployee(Employee e)
    {
        for(int i=0; i<employees.length; i++)
        {
            if(employees[i] == e)
            {
                employees[i] = null;
                System.out.println("Employee removed");
                break;
            }
        }
    }

    @Override
    public void showAllEmployees()
    {
        for(int i=0;i<employees.length;i++)
        {
            if(employees[i] != null)
            {
                System.out.println("Employee Name: "+ employees[i].getName());
                System.out.println("Employee ID: "+ employees[i].getEmpId());
                System.out.println("Salary: "+ employees[i].getSalary());
               // System.out.println();
            }
        }
    }

    @Override
    public void setCustomer(Customer c) {

    }

    @Override
    public Customer getCustomer(int nid)
    {
        Customer c = null;

        for(int i=0; i<customers.length; i++)
        {
            if(customers[i] != null)
            {
                if(customers[i].getNid() == nid)
                {
                    c = customers[i];
                    break;
                }
            }
        }
        return c;
    }

    @Override
    public void insertCustomer(Customer c)
    {
        for(int i=0; i<customers.length; i++)
        {
            if(customers[i] == null)
            {
                customers[i] = c;
                System.out.println("new Customer created");
                break;
            }
        }
    }

    @Override
    public void removeCustomer(Customer c)
    {
        for(int i=0; i<customers.length; i++)
        {
            if(customers[i] == c)
            {
                customers[i] = null;
                System.out.println("Customer removed");
                break;
            }
        }
    }

    @Override
    public void showAllCustomers()
    {
        for(int i=0;i<customers.length;i++)
        {

            if(customers[i] != null)
            {
                System.out.println("----------------------------------");
                System.out.println("Customer Name: "+ customers[i].getName());
                System.out.println("Customer NID: "+ customers[i].getNid());
                System.out.println("----------------------------------");
               // customers[i].showAllAccounts();

            }
            else
                {
                    break;
                }
        }
    }
}
