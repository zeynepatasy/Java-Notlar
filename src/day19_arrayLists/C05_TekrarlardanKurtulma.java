package day19_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarlardanKurtulma {
    public static void main(String[] args) {
        //tekrarlı sayıları silip
        //her elementin tek kullanıldığı bir hale dönüştürün
        int[]arr={2,3,3,4,5,4,6,7,8,9,5};
        List <Integer>benzersizElementler=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!benzersizElementler.contains(arr[i])){
                benzersizElementler.add(arr[i]);
            }
        }
        System.out.println(benzersizElementler);//[2, 3, 4, 5, 6, 7, 8, 9]
        //istenen listeyi list olarak elde ettik.
        arr=new int[benzersizElementler.size()];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]= benzersizElementler.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
