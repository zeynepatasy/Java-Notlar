package day16_scope_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdırma {
    public static void main(String[] args) {
        int[] arr={3,5,6,7,8,1,2};

        //Tüm array yazdır

        System.out.println(Arrays.toString(arr)); //bu array olur

        //Array'in tüm elementlerini yanyana aralarında bir bosluk olacak sekilde yazdırın

        for (int i = 0; i <arr.length ; i++) { //<= dersek length-1
            System.out.print(arr[i] + " "); //bu arrayin elementleri
        }

    }
}
