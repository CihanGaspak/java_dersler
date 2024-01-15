package java_dersler.cihangaspak_java;

import java.util.Scanner;

public class ymh22but {
    public static void main(String[] args) {
        final String passwd = "Yazilim2022";
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
        }
    }
}
