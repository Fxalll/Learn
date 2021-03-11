package Study;

public class S2_salary extends S2_employee {
    private double salary;
    public S2_salary(String name,String address,int number,double salary){
        super(name,address,number);
        setSalary(salary);
    }
    public void mailCheck(){
        System.out.println("Salary of mailCheck");
        System.out.println("mailCheck to " + getName() + ",whose salary is " + salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }
    public double computePay(){
        System.out.println("Salary to " + getName());
        return salary/52;
    }
}
