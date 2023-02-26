package day17_arrays;

public class C03_EnUzunElementiYazdırma {
    public static void main(String[] args) {
        //Verilen String bir Array'deki
        //en uzun ve en kısa kelimeleri yazdıran bir method olusturun

        String[]arr={"melike","burkay","inci","eda","emre"};
        enUzunEnKısaYazdır(arr); //Array'deki en uzun kelime: melike
                                 //Array'deki en kısa kelime: eda
    }
    public static void enUzunEnKısaYazdır(String[]arr){
         String enuzunkelime=arr[0];
         String enkısakelime=arr[3];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()>enuzunkelime.length()){ //== koyunca bir sonrakini alır burkay gibi
                enuzunkelime=arr[i];
            }
            if (arr[i].length()<enkısakelime.length()){
                enkısakelime=arr[i];
            }
        }
        System.out.println("Array'deki en uzun kelime: " + enuzunkelime);
        System.out.println("Array'deki en kısa kelime: " + enkısakelime);
    }
}
