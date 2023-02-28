package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_getSet {
    public static void main(String[] args) {
        List<Integer>sayılar=new ArrayList<>();
        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(18);
        sayılar.add(2);
        System.out.println(sayılar);//[1, 3, 18, 2]
        System.out.println(sayılar.get(0));//1

        sayılar.get(sayılar.size()-1);//2

        //2 elemntini 12 yapın
        System.out.println(sayılar.set(2, 7)); //18 değiştirdiğini getirdi
    }
}
