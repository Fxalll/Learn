package Learn;
import java.io.*;

public class L34_exception extends Exception{
    private double amount;
    public L34_exception(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}
