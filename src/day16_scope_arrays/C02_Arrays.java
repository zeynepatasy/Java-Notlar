package day16_scope_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] isimler={"Nurefşan","Berke","Mustafa"}; //burda sayı belirtmedik ama kendisi burdaki sayıya göre Array olsturur
        int[] sayılar={3,4,5,6,7,8,9};     //köşeli parantez array ooldugunu gösterir
        char[] karakterler={'a','b','%'};

        //array non-primitive data türüdür.,
        //eğer array'i liste şeklinde olusturmayıp
        //new keyword kullanıyorsak
        //uzunluğunu yazmak zorundayız

        String[] arr=new String[4];

        //bir Array tanımlanan uzunluktan daha fazla veya az eleman alamaz.

        //bir Array'i yazdırmak istersek

        System.out.println(isimler); //[Ljava.lang.String;@568db2f2 ..referanas verir bize direkt yazdırılmaz

        System.out.println(Arrays.toString(isimler));//[Nurefşan, Berke, Mustafa ]
        System.out.println(Arrays.toString(sayılar));//[3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(arr)); //[null, null, null, null]

        int[] a=new int[7];
        System.out.println(Arrays.toString(a)); //[0, 0, 0, 0, 0, 0, 0]
        a[0]=4; //a nın 0 indexine 4 değerini atadık  //[4, 0, 0, 0, 0, 0, 0]
        a[3]=7;
        a[7]=8; //7. index olmadığı için hata verdi
        System.out.println(Arrays.toString(a)); //ArrayIndexOutOfBoundsException

          //Array uzunluğu atandıktan sonra değiştirilemez, 0 la basalyıp sonradan eklenebilir.

        System.out.println(sayılar[4]); //7 Array'in 4. elementi int. olduğu için yazdırır
        System.out.println(isimler[1]);//Berke verir, String olduğu için bu sekilde yazdırır.


    }
}
