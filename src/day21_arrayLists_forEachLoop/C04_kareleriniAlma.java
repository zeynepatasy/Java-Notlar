package day21_arrayLists_forEachLoop;

public class C04_kareleriniAlma {
    public static void main(String[] args) {
        int[]arr={2,3,5};
        karelerToplamınıYazdırMethodu(arr);

    }
    public static void karelerToplamınıYazdırMethodu(int[] arr){
        int karelerToplamı=0;

        for (int each:arr
             ) {
            karelerToplamı+=each*each;
        }
        System.out.println("verilen arraydeki elementlerin kareleri toplamı: " + karelerToplamı);
    }
}
