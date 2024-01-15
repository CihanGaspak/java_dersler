package java_dersler.cihangaspak_java;

import java.util.Scanner;

public class ymh22but {
    public static void main(String[] args) {
        //Soru 1
        /*final String passwd = "Yazilim2022";
        String girilenSifre;
        int sayac =0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici sifresi giriniz:");
        girilenSifre = input.next();
        sayac++;

        if(passwd.equals(girilenSifre)){
            System.out.println("Hos geldiniz! Program basliyor...");
            sayac++;
        }
        else{
            while (sayac<5){
                System.out.print("Sifre yanlis, tekrar giriniz:");
                girilenSifre = input.next();
                sayac++;
                if(passwd.equals(girilenSifre)){
                    System.out.println("Hos geldiniz! Program basliyor...");
                    break;
                }
            }
        }*/

        /*//Soru 3 
        char a = '0', b = '1';
        int c = (int)b, d = (int)a;
        System.out.println(a + ":" + c);
        System.out.println(b + ":" + d);
        System.out.print((char)d + ":"+ a + "--");
        System.out.println((char)c + ":" + b);
        System.out.println(a + "--" + b);
        //çıktısı nedir?

        //0:49
        //1:48
        //0:0--1:1
        //0--1
        */

        //Soru 4 
        int[] sayilar = {5,1,4,2,3,88,9};
        int enkInd, n = sayilar.length;
        int enk, temp;

        for(int i=0; i<sayilar.length; i++){
            enk = sayilar[i];
            enkInd = i;
            for(int j=i; j<n; j++){
                if(sayilar[j]<enk){
                    enk = sayilar[j];
                    enkInd = j; 
                }
            }
            temp = sayilar[i];
            sayilar[i] = sayilar[enkInd];
            sayilar[enkInd] = temp;
        }

        for(int i=0; i<sayilar.length; i++){
            System.out.print(sayilar[i]+ " ");
        }

    }
}
