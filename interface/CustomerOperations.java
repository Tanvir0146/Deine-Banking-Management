public interface CustomerOperations
{
   public abstract void setCustomer(Customer c);
    Customer getCustomer(int nid);
    void insertCustomer(Customer c);
    void removeCustomer(Customer c);
    void showAllCustomers();
}
