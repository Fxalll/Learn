package Learn;
import java.util.*;

public class L34 {
    public static void main(String args[]){
        System.out.println("Please enter the number you want to deposite: ");
        L34_checking c = new L34_checking(101);
        Scanner cash = new Scanner(System.in);
        System.out.println("Depositing $" + cash.nextDouble() + "...");
        c.deposit(cash.nextDouble());
        try{
            Scanner cash2 = new Scanner(System.in);
            System.out.println("Withdrawing $" + cash2.nextDouble() + "...");
            c.withdraw(cash2.nextDouble());
        }catch (L34_exception e){
            System.out.println("Sorry,but you are short $" + e.getAmount());
//            e.printStackTrace();
        }
    }
}
