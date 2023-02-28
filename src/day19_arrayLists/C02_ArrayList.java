package day19_arrayLists;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {
        /*
        ArrayList uzunluğu esnek bir listedir,
        Array altyapısnı kullanır.
        Ancak ekleme ve silme gibi işlemlerde daha avantajlıdır
         */
        List<String>harfler=new ArrayList<>(); //boş bir list olusturur

        System.out.println(harfler); // []
        harfler.add("s");
        harfler.add("l");
        harfler.add("a");
        System.out.println(harfler); //[s, l, a]
    }
}
