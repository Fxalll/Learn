package Study2;

public class S10 <T> {
    private T t;
    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }

    public static void main(String[] args){
        S10<Integer> integerS10 = new S10<>();
        S10<String> stringS10 = new S10<>();
        integerS10.add(10);
        stringS10.add("hello");
        System.out.printf("Integer: " + integerS10.get());
        System.out.printf("\nString: " + stringS10.get());
    }
}