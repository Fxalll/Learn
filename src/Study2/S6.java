package Study2;
import java.util.*;

public class S6 {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<String, String> Sites = new HashMap<String, String>();
        // 添加键值对
        Sites.put("one", "Google");
        Sites.put("two", "Runoob");
        Sites.put("three", "Taobao");
        Sites.put("four", "Zhihu");
        System.out.println(Sites.get("one"));
    }
}
