package Learn;

public class L22 {
    public static void main(String args[]){
        int num1 = 1;
        int num2 = 2;
        System.out.println("num1 before: " + num1 + "\nnum2 before: " + num2);
        swap(num1,num2);
    }
    public static void swap(int n1,int n2){
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("USING SWAP...");
        int temp = n1;
        n1 = n2;
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        n2 = temp;
        System.out.println("done.");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("num1 after: " + n1 + "\nnum2 after: " + n2);
    }
}
