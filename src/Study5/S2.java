package Study5;

import java.util.*;

public class S2 {
    public static void main(String[] args){
        HashMap<Integer,String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = List.of("♥","♦","♣","♠");
        List<String> numbers = List.of("3","4","5","6","7","8","9","10","J","Q","K","A","2");
        int index = 0;
//        index++;

        for (String num : numbers){
            for (String col : colors){
                poker.put(index,col+num);
                pokerIndex.add(index);
                index++;
            }
        }
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        Collections.shuffle(pokerIndex);
//        System.out.println(pokerIndex);


        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> finalCard = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++){
            Integer in = pokerIndex.get(i);
            if (i >= 51){
                finalCard.add(in);
            }else if (i % 3 == 0){
                player01.add(in);
            }else if (i % 3 == 1){
                player02.add(in);
            }else if (i % 3 == 2){
                player03.add(in);
            }
        }

        Collections.sort(finalCard);
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);

        lookPoker("王俊凯",poker,player01);
        lookPoker("王源",poker,player02);
        lookPoker("易烊千玺",poker,player03);
        lookPoker("底牌",poker,finalCard);


    }

    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        System.out.print(name+": ");
        for (Integer key : list){
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
