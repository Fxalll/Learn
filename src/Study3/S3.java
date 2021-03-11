package Study3;
import java.util.Scanner;

public class S3 {
    static int i,j,k,l = 0;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("多少人？");
        int people = s.nextInt();
        System.out.println("多少砖块？");
        int brick = s.nextInt();
        System.out.println("题目描述：有" + people + "个人，" + brick + "块砖，每人搬了一次，正好搬完。其中男每人每次搬4块，女每人每次搬3块，小孩两人每次搬一块。问 男、女、小孩各多少人？");
        int c = 1;
        for (i = 0; i < brick/4; i++){
            for (j = 0; j < brick/3; j++){
                if ((i*4+j*3)+(people-i-j)*0.5 == brick && (people-i-j) % 2 == 0 && people-i-j > 0){
                    System.out.println("可能" + c + ":");
                    System.out.println("男人: " + i);
                    System.out.println("女人: " + j);
                    System.out.println("小孩: " + (people-i-j));
                    System.out.println();
                    c++;
                    l = 1;
                }k++;
            }
        }
        System.out.println();
        if (l == 0) {
            System.out.println("我们运算了" + k + "次，没有答案可以满足题目要求。");
        }
    }
}
