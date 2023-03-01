package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {
    public static void main(String[] args) {
        List<String>isimler=new ArrayList<>();
        isimler.add("kübra");
        isimler.add("mustafa");
        isimler.add("emre");
        isimler.add("ferhat");
        isimler.add("erdal");

        System.out.println(isimler);
        System.out.println(isimler.get(2));//emre
        System.out.println(isimler.indexOf("ferhat"));//3
        System.out.println(isimler.lastIndexOf("ferhat")); //sondan baslayarak bakacak lastIndex old için 1
        System.out.println(isimler.indexOf("hilal")); //-1 olmadığı için
        System.out.println(isimler.lastIndexOf("elif")); //-1
        
        isimler.add("mustafa");
        System.out.println(isimler.indexOf("mustafa")); // 1
        System.out.println(isimler.lastIndexOf("mustafa")); //5
    }
}
