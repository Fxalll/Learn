package Study3;
import java.util.Random;

public class S5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char[] pardStore=new char[62];
        //把所有的大写字母放进去
        for(int i=0;i<20;i++){
            pardStore[i]=(char)('A'+i);
        }
        //把所有的小写字母放进去
        for(int i=26;i<52;i++){
            pardStore[i]=(char)('a'+i);
        }

        //吧0到9放进去
        for(int i=52;i<62;i++){
            pardStore[i]=(char)('0'+(i-52));
        }

        //生成6位随机密码
        Random r=new Random();
        for(int i=0;i<6;i++){
            int n=r.nextInt(62);
            System.out.print(pardStore[n]);
        }
    }
}
