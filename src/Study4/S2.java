package Study4;
import java.util.*;
import java.io.*;

/*
* 首先输入多少人，多少钱
* 然后选择普通红包和手气红包
* 普通红包的最后一个红包要包括余数
* 手气红包最大不能超过剩下人均金额的两倍，最少不能低于一分钱
* */

public class S2 {

    public static void main(String[] args) throws Exception{


        Scanner s = new Scanner(System.in);
        System.out.println("请输入群里人数： ");
        int numPerson = s.nextInt();
        System.out.println("请输入红包总金额： ");
        double sumMoney = s.nextDouble();
        System.out.println("done.");


        while (true){
            System.out.println("请选择输入： normal（普通红包），luck（随机红包），q（退出）");
            String select = s.next();
            if (select.equals("normal")) {
                call(numPerson);
                normalRedPocket(numPerson,sumMoney);
                ask();
            }else if (select.equals("luck")) {
                call(numPerson);
                luckRedPocket(numPerson,sumMoney);
                ask();
            }else if (select.equals("q")) {
                break;
            }else {
                System.out.println("输入错误，请重新输入。");
            }
        }
    }

    private static void call(int numPerson) throws Exception{
        System.out.println();
        System.out.println();
        System.out.println("                   开心家族（" + numPerson + "）"                    );
        System.out.println();
        System.out.println("(群主)卢佳康：各位注意了啊，我一会儿要发巨额红包！");
        System.out.println("(群员)" + personName() + ": 感动！");
        System.out.println("(群员)" + personName() + ": 老板大气，快发吧！");
        System.out.println("(群员)" + personName() + ": 老板大气！");
        System.out.println("(群员)" + personName() + ": 老板大气！");
        System.out.println();
    }

    private static void ask() throws Exception{
        System.out.println();
        System.out.println("(群员)" + personName() + ": ?");
        System.out.println("(群员)" + personName() + ": ?");
        System.out.println("(群员)" + personName() + ": ?");
        System.out.println("(群员)" + personName() + ": ?");
    }

    private static String personName() throws Exception{
        S1 test = new S1();
        int key = test.num();
        int num = test.rand(2, key, 1);
        String name = test.test(num, 1);
        return name;
    }

    private static void normalRedPocket(int numPerson, double sumMoney) throws Exception{
        double meanMoney = sumMoney / numPerson ;
        double lastLeftMoney = sumMoney % numPerson ;
        double lastMoney = lastLeftMoney + meanMoney;
        for (int i = 1; i <= numPerson - 1; i++){
            System.out.print("（群员）" + personName() + "抢了： ");
            System.out.printf("%.2f",meanMoney);
            System.out.println();
        } System.out.print("（群员）" + personName() + "抢了： ");
            System.out.printf("%.2f",lastMoney);
            System.out.println();

    }

    private static void luckRedPocket(int numPerson, double sumMoney) throws Exception{
        double meanMoney = sumMoney / numPerson ;
        for (int i = 1; i <= numPerson - 1; i++) {
            double randMoney = random(0.01,meanMoney * 2);
            System.out.print("（群员）" + personName() + "抢了： ");
            System.out.printf("%.2f",randMoney);
            System.out.println();
            sumMoney = sumMoney - randMoney;
            meanMoney = sumMoney / (numPerson - i);
        }
        System.out.print("（群员）" + personName() + "抢了： ");
        System.out.printf("%.2f",meanMoney);
        System.out.println();
    }

    public static double random(double min, double max) throws Exception {
        double rand = 0;
        rand = new Random().nextDouble() * (max - min) + min;
        return rand;
    }

}
