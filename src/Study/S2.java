package Study;

public class S2 {
    public static void main(String args[]){
        S2_salary s = new S2_salary("Tom","Beijing",3,3600.00);
        S2_employee e = new S2_salary("Jarry","Shanghai",2,2400.00);
        System.out.println("Using Salary to use mailCheck -- ");
        s.mailCheck();
        System.out.println("\nUsing Employee to use mailCheck -- ");
        e.mailCheck();
    }
}
