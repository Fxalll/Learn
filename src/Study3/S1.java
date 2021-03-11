package Study3;
//1.模拟酒店房间管理系统，需要如下几个功能：
//
//        1、1 in 房间号 客人名字 入住功能
//
//        1、2 out 房间号 退房功能
//
//        1、3 search 房间号 查询房间状态 如果房间号为-1 则输出所有房间状态
//
//        1、4 quit 或 exit 退出
//
//        提示：酒店所有的房间用二维数组来实现

import java.util.Scanner;

public class S1 {
    //写在类里面，则每个方法都可以访问到，避免了参数传递的繁琐；
    static int h=5,w=10;
    static String[][] rooms=new String[5][10];
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("请输入  in,out,search,quit:");
            String temp=s.next();
            int room=0;
            if("in".equals(temp)){//防止出现空指针异常；
                System.out.println("输入房间号：");
                room=s.nextInt();
                System.out.println("输入名字：");
                String name=s.next();
                if(in(room,name)) System.out.println("入住完成！");
                System.out.println("room"+room+"name"+name);
            }else if("out".equals(temp)){
                System.out.println("输入房间号：");
                room=s.nextInt();
                if(out(room)) System.out.println("退房完成！");
                System.out.println("out"+room);
            }else if("search".equals(temp)){
                System.out.println("输入房间号（-1代表全部）：");
                room=s.nextInt();
                search(room);
            }else if("quit".equals(temp)||"exit".equals(temp)){
                break;
            }else{
                System.out.println("命令错误！");
            }
        }
    }

    private static boolean search(int room) {
        if(room==-1){
            //打印所有的信息；
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    int room2=(i+1)*100+j+1;
                    System.out.print(room2+"\t\t");
                }
                System.out.println();
                for(int k=0;k<w;k++){
                    System.out.print(rooms[i][k]==null?"empty":rooms[i][k]);
                    System.out.print("\t");
                }
                System.out.println();
                System.out.println();
            }
            return true;

        }else{
            int r=room/100-1;
            int c=room%100-1;
            if(r<0||r>=h||c<0||c>=w){
                System.out.println("房间号错误！");
                return false;
            }
            System.out.println(rooms[r][c]==null?"empty":rooms[r][c]);
            return true;
        }
    }

    private static boolean out(int room) {
        int r=room/100-1;
        int c=room%100-1;
        if(r<0||r>=h||c<0||c>=w){
            System.out.println("房间号错误！");
            return false;
        }
        if(rooms[r][c]==null||"".equals(rooms[r][c])){//
            System.out.println("此房间没有人！");
            return false;
        }
        rooms[r][c]=null;
        return true;
    }

    private static boolean in(int room, String name) {
        int r=room/100-1;
        int c=room%100-1;
        if(r<0||r>=h||c<0||c>=w){
            System.out.println("房间号错误！");
            return false;
        }
        if(rooms[r][c]!=null){//
            System.out.println("此房间已经有人！");
            return false;
        }

        rooms[r][c]=name;
        return true;

    }

}