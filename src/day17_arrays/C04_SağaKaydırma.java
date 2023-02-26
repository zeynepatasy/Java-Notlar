package day17_arrays;

import java.util.Arrays;

public class C04_SağaKaydırma {
    public static void main(String[] args) {
        //verilen int bir arraydeki elementleri bir sağa kaydırın
        //sondaki elementide en basa alıp kaydırın

        //orn: [3,4,5,6]--> [6,3,4,5]
        int[]arr={3,4,5,6};
        int temp=arr [arr.length-1];
        //3455 / 3445 / 3345 / 6345

        for (int i = 0; i <arr.length-1 ; i++) {
            arr[arr.length-1-i]=arr[arr.length-2-i];
            //son indextekine son indexten bir öncekini atadik..i ekleyince dinamik oldu
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
        }
    }

