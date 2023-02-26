package day17_arrays;

public class C03_ArraydeİstenenElemanıBulma {
    public static void main(String[] args) {
        //verilen bir array'de istenen bir elemanın var olup olmadığını
        //varsa kaç kez kullanıldığını yazdıran bir method olusturun

        int[]arr1={2,4,5,2,6,4,7,3,5};
        String[]arr2={"e","h","z","a","z"};
        elemanSayısıYazdır(arr1,3);//1
        elemanSayısıYazdır(arr1,2);//2
        elemanSayısıYazdır(arr1,5);//2
        elemanSayısıYazdır(arr2,"z");


        //elemanSayısıYazdır(arr2); bunu kabul etmez, argumentler ve parametreler uymaz..String/İnt

    }
    public static void elemanSayısıYazdır (int[] arr, int arananSayı){
        int sayac=0;
        for (int i = 0; i <arr.length; i++) {
              if (arr[i]==arananSayı){
                  sayac++;
              }
        }
        System.out.println(sayac);
    }
    public static void elemanSayısıYazdır(String[] arr, String arananEleman){
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals(arananEleman)){
                sayac++;
            }
        }
        System.out.println(sayac);//2
    }
}
