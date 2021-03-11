package Study2;

public class S7 implements Cloneable{
    String name;
    int likes;
    public static void main(String[] args){
        S7 obj1 = new S7();
        obj1.name = "Runnoob";
        obj1.likes = 111;

        System.out.println(obj1.name);
        System.out.println(obj1.likes);

        try {
            S7 obj2 = (S7) obj1.clone();

            System.out.println(obj2.name);
            System.out.println(obj2.likes);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
