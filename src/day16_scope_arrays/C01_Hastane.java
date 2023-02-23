package day16_scope_arrays;

public class C01_Hastane {
    public static void main(String[] args) {
        ADoktor dok1 = new ADoktor();//  Adoktor sınıfından doktor objesi olusturduk
        System.out.println(dok1.askerlikYaptıMı);
        dok1.isim="Kemal";
        dok1.soyisim="Yılmaz";
        dok1.dogumYili=1980;

        //System.out.println(isim); //Objesi olmadan bu scope da isim adında variable olmadığı için yazdırmaz
        System.out.println(dok1.isim); //Kemal

        ADoktor dok2=new ADoktor();
        System.out.println(dok2.isim); // null olur isim instance variable olduğu  için

        dok2.soyisim="Çelik";
        System.out.println(dok2.soyisim); //Çelik
    }
}