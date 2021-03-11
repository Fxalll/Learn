package Study;

//enum Color{
//    red,green,blue;
//}
public class S4 {
    enum Color{
        red,green,blue;
    }
    public static void main(String[] args){
        Color c1 = Color.red;
        System.out.println(c1 + "\n");

        for (Color i : Color.values()){
            System.out.println(i);
        }
    }
}
