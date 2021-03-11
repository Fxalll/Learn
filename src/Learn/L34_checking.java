package Learn;
import java.io.*;

public class L34_checking {
    private double balance;
    private int number;
    public L34_checking(int number){
        this.number = number;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount) throws L34_exception{
        if(amount <= balance){
            balance -= amount;
        }
        else{
            double needs = amount - balance;
            throw new L34_exception(needs);
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
    }
}
