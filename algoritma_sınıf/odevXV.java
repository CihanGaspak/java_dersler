package algoritma_sınıf;
 
/*Aşağıdaki algoritmayı Java koduna dönüştürünüz (yazınız)
Adım 1: Başlangıç değeri 100 olan mil isimli bir double değişken tanımlayınız.
Adım 2: Değeri 1.609 olan KILOMETRE_MIL_KATSAYISI isimli bir double sabit
tanımlayınız.
Adım 3: kilometre isimli bir double değişken tanımlayınız, mil ve
KILOMETRE_MIL_KATSAYISI nı çarpınız ve sonucu kilometreye atayınız.
Adım 4: kilometreyi konsolda gösteriniz.
Adım 4’ten sonra kilometre nedir? 
*/


public class odevXV {
    public static void main(String[] args ){
        double mil = 100;
        final double KILOMETRE_MIL_KATSAYISI = 1.609;
        double kilometre = mil*KILOMETRE_MIL_KATSAYISI;

        System.out.println(kilometre); //160.9
    }
}
