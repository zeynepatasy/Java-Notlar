package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_add {
    public static void main(String[] args) {
        List<Integer> sayılar=new ArrayList<>();
        //List data türüü olarak primitive kabul etmez yani int olmaz.
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(2);
        System.out.println(sayılar); //[3, 5, 2]

        //3 ile 5 arasına element olarak 7 ekleyin

        sayılar.add(1,7); //hangi inedx hangi element olacaksa
        System.out.println(sayılar);

        List<Integer>ekler=new ArrayList<>();
        ekler.add(4);
        ekler.add(6);
       sayılar.addAll(ekler);
        System.out.println(sayılar);//[3, 7, 5, 2, 4, 6]

        //7 ile 5 arasına ekler i ekle

        sayılar.addAll(2,ekler);
        System.out.println(sayılar);//[3, 7, 4, 6, 5, 2, 4, 6]


    }
}
