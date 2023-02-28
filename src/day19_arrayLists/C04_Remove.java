package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");
        harfler.add("D");

        System.out.println(harfler.remove("B")); //true
        System.out.println(harfler);//[A, K, D]
        System.out.println(harfler.remove(2));//D sildiiği elemnti getirdi
        System.out.println(harfler);//[A, K]

        List<Integer>sayılar=new ArrayList<>();
        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(18);
        sayılar.add(2);

        //Eğer sayılardan olusan bir list varsa
        //remove methoduna yazacağınız sayıyı index olarak kabul eder.
        //eğer sayıyı silmek isterseniz remove methodundan önce o sayıyı bir objeye atayıp
        //remove methodunda obje ismini yazabiliriz

        sayılar.remove(1);//obje sectiğim halde
        Integer silinecekSayı=1; //non primitive olması lazım, obje olacağı için
        System.out.println(sayılar.remove(silinecekSayı)); //true
        System.out.println(sayılar); //[18, 2]


    }
}
