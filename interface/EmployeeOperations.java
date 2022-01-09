public interface EmployeeOperations
{
    void setEmployees(Employee e);
    Employee getEmployee(String empId);
    void insertEmployee(Employee e);
    void removeEmployee(Employee e);
    void showAllEmployees();
}
