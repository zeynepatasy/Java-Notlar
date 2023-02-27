package day18_multiDimensionalArrays;

public class C07_MDA {
    public static void main(String[] args) {
        int[][] arr={{13,25,37},{41,12,23,34},{11,25},{17}};
        int istenenToplam=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>=20 && arr[i][j]<=40){
                    istenenToplam+=arr[i][j];
                    System.out.print(arr[i][j]+ ",");

                }
            }

        }
        System.out.println(" ");
        System.out.println(istenenToplam);
    }
}
