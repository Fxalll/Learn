package Learn;

public class L39 {
    public int test(){
        System.out.println("test1");
        return 1;
    }
    public void test(int a){
        System.out.println("test2");
    }
    public String test(int a,String s){
        System.out.println("test3");
        return "returntest3";
    }
    public String test(String s,int a){
        System.out.println("test4");
        return "returntest4";
    }
    public static void main(String[] args){
        L39 o = new L39();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1,"test3"));
        System.out.println(o.test("test4",1));
    }

}
