package java_dersler.cihangaspak_java;

import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class ad_soyad_ayir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ad ve soyad bilgilerinizi girin: ");
        String ad_soyad = input.nextLine();
        String ad;
        String soyad;
        int arananIndex =- 1;
        boolean girisDegeri = false;
        for(int i =0; i<ad_soyad.length();i++){
            if(ad_soyad.charAt(i) ==' '){
                arananIndex=i;
                girisDegeri = true;
            }
        }
        if(girisDegeri){
            ad= ad_soyad.substring(0, arananIndex);
            soyad= ad_soyad.substring(arananIndex);
            System.out.println("ad: "+ad);
            System.out.println("Soyad: "+soyad);
        }
        else{
            System.out.println("Girdiğiniz değer hatalıdır");
        }
    }
}
