package day19_arrayLists;

public class C01_MDA {
    public static void main(String[] args) {
        int[][]arr={{3,4,5},{2,3,6,7}};
        //ortak index bulmak için en kısa yolu bulalım

        int enKısaArrayLength=arr[0].length;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length<enKısaArrayLength){
                enKısaArrayLength=arr[i].length;
            }
        }
        //toplamları koymak için yeni bir array olusturalım

        int[]toplamlarArrayi=new int[enKısaArrayLength];
    }
}
