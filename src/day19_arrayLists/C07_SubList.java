package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_SubList {
    public static void main(String[] args) {
        List<Integer>sayılar=new ArrayList<>();
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(2);
        sayılar.add(13);
        sayılar.add(53);
        sayılar.add(22);
        System.out.println(sayılar.subList(2, 5)); //[2, 13, 53] --> 2 dahil 5 değil

        List<Integer>yeniList=sayılar.subList(2,5);
        System.out.println(yeniList); //[2, 13, 53]

    }
}
