package day16_scope_arrays;

import java.util.Arrays;

public class C04_ArrayinTümElementleriniArttırma {
    public static void main(String[] args) {
        int[] fiyatlar = {15, 20, 30, 10, 50};

        //tüm ürünlere 3 lira fiyat düzenlemesi yapın
        for (int i = 0; i < fiyatlar.length; i++) {
            fiyatlar[i] += 3;
            System.out.print(fiyatlar[i] + " "); //18 23 33 13 53 Array elementlerini verir
        }
        System.out.println(Arrays.toString(fiyatlar)); // [18, 23, 33, 13, 53] Array'in kendisini verir.

    }
}