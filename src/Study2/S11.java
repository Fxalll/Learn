package Study2;
import java.util.*;

public class S11 {
    public static void main(String[] args){
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("ico");
        name.add("ok");
        age.add(18);
        number.add(110);

        getData(name);
        getData(age);
        getData(number);
    }
    public static void getData(List<?> data){
        System.out.println("data: " + data.get(0));
    }
}
