package day17_arrays;

import java.util.Arrays;

public class C01_MethodİleElementleriArttırma {
    public static void main(String[] args) {
        //verilen bir int array'in elemanlarını 2 arttırıp bize döndüen bir method olusturun
        //Eski array'i yeni halliyle kaydedin
        int[]arr={3,4,5,6}; //[5, 6, 7, 8]
       arr= arrayElementleriniArttır(arr,2);
        System.out.println(Arrays.toString(arr)); ////[5, 6, 7, 8]
    }

    public static int[]arrayElementleriniArttır(int[] ilkArr,int artış){
        for (int i = 0; i <ilkArr.length ; i++) {
            ilkArr[i]+=2;
        }
        return ilkArr;
    }
}
