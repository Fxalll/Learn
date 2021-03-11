package Learn;

public class L6{
    private static int num = 500;
    protected static int getCount(){
        return num;
    }
    private static void add(){
        num++;
    }
    L6(){
        L6.add();
    }
    public static void main(String[] args){
        System.out.println("Starting with " + L6.getCount() + " instances");
        for (int i = 0; i < 500; ++i){
            new L6();
        }
        System.out.println("Created " + L6.getCount() + " instances");
    }
}