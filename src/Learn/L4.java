package Learn;
import java.io.*;

public class L4{
    public String name;
    private double salary;
    public L4(String empName){
        name = empName;
    }
    public void setSalary(double empSalary){
        salary = empSalary;
    }
    public void printEmp(){
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
    public static void main(String[] args){
        L4 empOne = new L4("Tom");
        empOne.setSalary(5500.0);
        empOne.printEmp();
    }
}