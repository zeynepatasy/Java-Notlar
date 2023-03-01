package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {
        //verilen bir array'i list olarak kaydetmek istersek
        //tek tek olmadan, pratik olarak  bir array olusturup
        //loop ile tüm elementleri list'e ekleyebilriz

        int[]arr={1,2,3,4,5,6,7,8,9};

        List<Integer>sayılar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayılar.add(arr[i] );

        }
        System.out.println(sayılar); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(sayılar.contains(3)); //var mı yok mu -->true yazdırır
        sayılar.clear();
        System.out.println(sayılar);//[]
    }
}
