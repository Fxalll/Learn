package Study2;
import java.util.*;

public class S1 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
        sites.remove(3);
        System.out.println(sites);
        System.out.println(sites.size());
    }
}
