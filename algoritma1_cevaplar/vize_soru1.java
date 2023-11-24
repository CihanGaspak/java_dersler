package algoritma1_cevaplar;

import java.util.Scanner;

class vize_soru1{
    public static void main(String[] arg) {
        //Degeri 3.141593 olan PI sabiti tanımalayınız
        // kullanıcıdan yaricap degeri alınız
        //cevreyi hesaplayıp ekrana bilgileri yazdırın
        final double PI = 3.141593;
        double yariCap ;
        double cevre; 

        Scanner input = new Scanner(System.in);

        System.out.print("Yaricap degerini giriniz: ");
        yariCap = input.nextDouble();
        cevre = 2*PI*yariCap;

        System.out.println("yaricapi "+ yariCap+" olan cemberin cevresi: "+cevre+"'dir");
        input.close();
    }
}