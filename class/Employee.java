public class Employee extends Bank
{
    String name;
    String empId;
    double salary;


   // Employee[] emp_array;
    //int arr_size = 0;
   //Employee[] emp_array = new Employee[100];
    Employee()
    {
    }


    void setName(String name){this.name = name;}
    void setEmpId (String empId){this.empId = empId;}
    void setSalary(double salary){this.salary = salary;}
    String getName(){return name;}
    String getEmpId (){return empId;}
    double getSalary(){return salary;}

}
