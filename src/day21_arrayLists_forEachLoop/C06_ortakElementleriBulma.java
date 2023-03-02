package day21_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ortakElementleriBulma {
    public static void main(String[] args) {
        int[]arr={2,3,6,7,4,7};
        int[]arr2={1,3,5,7,9,3};

        /*Soru 5- Verilen iki array’in elementlerini karsilastirip,
        ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.*/
        List<Integer>ortakElementlerListei=new ArrayList<>();

        for (Integer each1:arr) {
            for (Integer each2:arr2
                 ) {
                if (each1==each2 && !ortakElementlerListei.contains(each1)){
                    ortakElementlerListei.add(each1);
                }
            }
        }
        System.out.println(ortakElementlerListei);
        }
    }

