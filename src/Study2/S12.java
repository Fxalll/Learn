package Study2;
import java.util.*;

public class S12 {
    public static void main(String[] args){
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> num = new ArrayList<>();

        name.add("icon");
        age.add(18);
        num.add(314);

//        getUperNumber(name);
        getUperNumber(age);
        getUperNumber(num);

    }
//    public static void getData(List<?> data){
//        System.out.println("data: " + data.get(0));
//    }

    public static void getUperNumber(List<? extends Number> data){
        System.out.println("data: " + data.get(0));
    }
}
