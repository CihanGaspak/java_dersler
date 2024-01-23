package java_dersler.cihangaspak_java;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;
import javax.swing.text.html.parser.Element;

public class oryantasyon2 {
    public static void main(String[] args) {
    //Teknoloji Fakültesi 
    //Yazılım Mühendisliği
    //Cihan GASPAK 220541121

        //1) Ekrana “Merhaba Hocam" yazdıran bir program yazın.
        //System.out.println("Merhaba hocam");


        //2) Klavyeden girilen isimi yazdırma
        /*Scanner input = new Scanner(System.in);
        System.out.print("İsminizi giriniz: ");
        String isim = input.nextLine();

        System.out.println("isminiz: "+isim);*/

        //3) Yarıçapı girilen çemberin alanı
        /*Scanner input = new Scanner(System.in);

        System.out.print("Cember yaricapi:");
        double yaricap = input.nextDouble();

        double sonuc = 3.14*yaricap*yaricap;
        System.out.println("Cemberin alani: "+sonuc);*/

        //4) Klavyeden girilen metini istenildiği kadar yazdırma
        /*Scanner input = new Scanner(System.in);
        System.out.print("Metin giriniz:");
        String metin = input.nextLine();
        System.out.print("Kaç kere yazdiralim?:");
        int sayac = input.nextInt();

        for(int i= 0; i<sayac; i++){
            System.out.println(metin);
        }*/



        //5) Klavyeden girilen sayının faktöriyelini bulan program
        Scanner input = new Scanner(System.in);
        /*System.out.print("Sayi giriniz: ");
        int sayi = input.nextInt();
        int sonuc=1;

        for(int i= 1; i<=sayi; i++){
            sonuc*= i;
        }
        System.out.println(sayi+"!: "+sonuc);*/

        //6) Belirtilen iki sayı arasındaki sayıları toplayan program
        /*System.out.print("1. Sayiyi giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("2. Sayiyi giriniz: ");
        int sayi2 = input.nextInt();
        int toplam=0;

        for(int i= sayi1; i<=sayi2; i++){
            toplam+= i;
        }

        System.out.println("Sonuc: "+toplam);*/

        //7) İstenilen kadar sayı girilen dizideki sayıları küçükten büyüğe sıralayan program
        /*System.out.print("kaç elemanli olsun: ");
        int uzunluk = input.nextInt();
        int[] dizi = new int[uzunluk];
        int eleman=0;
        int sayac =0;

        while(uzunluk>sayac){
            System.out.print("elemanı giriniz: ");
            eleman = input.nextInt();
            dizi[sayac] = eleman;
            sayac++;
        }

        int k;
        int l;
        int temp;

        for(int i = 0; i<dizi.length; i++){
            k= dizi[i];
            l = i;
            for(int m=i; m< dizi.length; m++ ){
                if(dizi[m]<k){
                    k=dizi[m];
                    l = m;
                }
            }
            temp= dizi[i];
            dizi[i]= k;
            dizi[l]= temp;
        }

        for(int i=0; i<dizi.length; i++){
            System.out.println(dizi[i]);
        }*/

        //8) Birbirine dik iki kenarı girilen dik üçgenin hipotenüsünü hesaplayan program
        /*System.out.print("1. kenari giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("2. kenari giriniz: ");
        int sayi2 = input.nextInt();

        double sonuc = sayi1*sayi1+ sayi2*sayi2;
        System.out.println(Math.pow(sonuc, 0.5));*/


        //9) Ekrana en*boy şeklinde istenilen ölçüde dikdörtgen çizdiren uyuglama
        /*System.out.print("yukseklik giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("genislik giriniz: ");
        int sayi2 = input.nextInt();

        for(int i = 0; i<sayi1; i++){
            for(int j = 0; j<sayi2; j++){
                System.out.print("*");
                
            }
            System.out.println();
        }*/

        //10)Sayı Tahmin oyunu (0-100)
        int random = (int) (Math.random()*100);
        while (true) {
            System.out.print("tahmin(cıkmak için 0'a basin): ");
            int tahmin = input.nextInt();
            if(tahmin==0){
                
                    System.out.println("Program kapatiliyor...");
                    break;
            
            }
            else{
                 if(tahmin==random){
                    System.out.println("Tebrikler Bildiniz");
                    break;
                }
                else if(tahmin<random){
                    System.out.println("arttir");
                }
                else if(tahmin>random){
                    System.out.println("azalt");
                }
            }
        }
    }
}
