package Study4;

import java.io.*;
import java.util.*;

public class S1 {

    public static int num() throws Exception {
        BufferedReader reade = new BufferedReader(new FileReader("/Users/fxalll/IdeaProjects/Learn/src/Study4/name.csv"));
        String line = null;
        int index = 0;
        while ((line = reade.readLine()) != null) {
            String[] item = line.split(",");
            index++;
        }
        return index;
    }

    public static int rand(int min, int max, int num) {
        int rand = 0;
        for (int i = 0; i < num; i++) {
            rand = new Random().nextInt(max - min) + min;
        }
        return rand;
    }

    public static void main(String[] args) throws Exception {
        S1 test = new S1();
        int key = num();
        int num = rand(2, key, 1);
        System.out.println(test.test(num, 1));
    }

    public String test(int row, int col) throws Exception {
        BufferedReader reade = new BufferedReader(new FileReader("/Users/fxalll/IdeaProjects/Learn/src/Study4/name.csv"));
        String line = null;
        int index = 0;
        String name = null;
        while ((line = reade.readLine()) != null) {
            String[] item = line.split(",");
            if (index == row - 1 && item.length >= col - 1) {
                String last = item[col - 1];
                name = last;
            }
            index++;
        }
        return name;
    }
}