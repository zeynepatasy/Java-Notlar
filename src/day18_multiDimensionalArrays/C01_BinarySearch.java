package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C01_BinarySearch {
    public static void main(String[] args) {
        //verilen Array de istenen elemanın olup olmadığını bulma

        int[]arr={4,9,1,5,11,3,7,4,6};
        System.out.println(Arrays.binarySearch(arr, 5));// -2
        System.out.println(Arrays.binarySearch(arr, 11));// 4
        System.out.println(Arrays.binarySearch(arr, 1));// -1
        System.out.println(Arrays.binarySearch(arr, 7));// -2

        //Array'de binarySearch'nun doğru çalışması için
        //öncelikle sort çalıştırılmalıdır

        Arrays.sort(arr);//1,3,4,4,5,6,7,9,11
        System.out.println(Arrays.binarySearch(arr, 5));// 4
        System.out.println(Arrays.binarySearch(arr, 11));// 8
        System.out.println(Arrays.binarySearch(arr, 1));// 0
        System.out.println(Arrays.binarySearch(arr, 7));// 6
        System.out.println(Arrays.binarySearch(arr, 4)); //2

        //binarySearch aranan elemntin index'ini döner

        System.out.println(Arrays.binarySearch(arr, 2)); //-2
        System.out.println(Arrays.binarySearch(arr, 8));// -8
        System.out.println(Arrays.binarySearch(arr, 10)); //-9
        System.out.println(Arrays.binarySearch(arr, 13));//-10

        //olmayan bir element aratılırsa önce Array'de olsaydı nerde olurdu bunu buluyoruz
        //sonra olması gereken sıranın - işaretli değerini veriyoruz.
        //Bu mantıkla en küçük elementten daha küçük sayılar için  -1
        //en büyük elementten büyük sayılar içinse -lenght-1 değeri döndürür

    }
}
