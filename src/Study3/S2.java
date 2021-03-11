package Study3;
import java.util.Scanner;

public class S2{
    static int h = 5, w = 10;
    static String [][] rooms = new String[5][10];
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Please Enter: i(in) o(out) s(search) q(quit): ");
            String temp = s.next();
            int number = 0;
            if ("i".equals(temp)){
                System.out.println("Please enter number you want: ");
                number = s.nextInt();
                System.out.println("Please enter your name: ");
                String name = s.next();
                in(number,name);
            }
            if ("o".equals(temp)){
                System.out.println("Please enter number you want: ");
                number = s.nextInt();
                System.out.println("Please enter your name: ");
                String name = s.next();
                out(number,name);
            }
            if ("s".equals(temp)){
                System.out.println("Please enter number you want: (enter'-1' can search all)");
                number = s.nextInt();
                search(number);
            }
            if ("q".equals(temp)){
                break;
            }
        }

    }

    private static boolean search (int number){
        if (number == -1){
            for (int i=0; i<h; i++){
                for (int j=0; j<w; j++){
                    int num1 = (i + 1)* 100 + j + 1;
                    System.out.print(num1 + "\t\t");
                }
                System.out.println();
                for (int k=0; k<w; k++){
                    System.out.print(rooms[i][k] == null ? "empty" + "\t": rooms[i][k] + "\t");
                }
                System.out.println();
                System.out.println();
            }
            return true;
        }else {
            int r = (number / 100 ) -1;
            int k = (number % 100 ) -1;
            if (r<0 || r>=h || k<0 || k>=w){
                System.out.println("number ERROR.");
                return false;
            }else{
                System.out.print(rooms[r][k] == null ? "empty" : rooms[r][k] + "\t");
                System.out.println();
                return true;
            }
        }
    }

    private static boolean in (int number, String name){
        int r = (number / 100 ) -1;
        int k = (number % 100 ) -1;
        if (r<0 || r>=h || k<0 || k>=w) {
            System.out.println("number ERROR.");
            return false;
        }else if (rooms[r][k] != null){
            System.out.println("Sorry,this room can't be checked in.");
            return false;
        }else if (rooms[r][k] == null){
            rooms[r][k] = name;
            System.out.println("in done.");
            System.out.println();
            return true;
        }
        return false;
    }

    private static boolean out (int number,String name){
        int r = (number / 100 ) -1;
        int k = (number % 100 ) -1;
        if (r<0 || r>=h || k<0 || k>=w) {
            System.out.println("number ERROR.");
            return false;
        }
        if (rooms[r][k] == null || "".equals(rooms[r][k])){
            System.out.println("Sorry,this room can't be checked out for it's empty.");
            return false;
        }
        if ("".equals(rooms[r][k]) != "".equals(name)){
            System.out.println("Sorry,your name is not signed in this room.");
            return false;
        }
        rooms[r][k] = null;
        System.out.println("out done.");
        System.out.println();
        return true;
    }
}