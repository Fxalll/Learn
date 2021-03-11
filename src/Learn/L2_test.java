package Learn;
import Learn.*;

public class L2_test {
    public static void main(String[] args) {
        L2 empOne = new L2("Tom");
        L2 empTwo = new L2("Jarry");
        empOne.empAge(26);
        empOne.empDesignation("Boss");
        empOne.empSalary(20000);
        empOne.printEmployee();

        empTwo.empAge(26);
        empTwo.empDesignation("Boss");
        empTwo.empSalary(20000);
        empTwo.printEmployee();
    }
}
