package Learn; //不用管
import java.util.Scanner; //导入java里面的一个Scanner包，拓展以获得输入功能
/*
* 为宝贝而想的一个需求：
* 给很多个数字，然后比较大小，输出那个数字大的
* */

public class L40 { //对L40组的 （L40是我的文件名）
    public static int num (int num1,int num2){ //num方法，int是整型的意思（是数字而且是整数）；括号是导入两个整型的变量
        return (num1 > num2 ? num1 : num2);
    }
    public static void main(String[] args){ //程序主入口，没有这个就不能运行
        Scanner s = new Scanner(System.in); //新建一个输入对象 叫s，专门用来输出
        int[] number = new int[10]; //新建一个数组对象 叫number，里面最多10个数字
        for (int i = 0;i < number.length; i++) { //for循环遍历
            number[i] = s.nextInt(); //将每一个数字都变成数组里面的数字
        }
        int getMax = number[0]; //让新建一个整型getMax 让getMax等于数组number的第一个数字
        for (int i = 0; i < number.length; i++){ //for循环遍历
            if (getMax < num(getMax,number[i])){ //如果getMax比用num函数返回的数字还小
                getMax = number[i]; //那getMax就等于num函数返回的数字
            }
        }
        System.out.println(getMax); //循环结束，输出getMax
    }
}


