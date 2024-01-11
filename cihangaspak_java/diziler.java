package java_dersler.cihangaspak_java;

import java.util.Scanner;

public class diziler {
    public static void main(String[] args) {
        //en kucuk elemanı bul
        /*int[] tamSayilar = {57, 89, 33, 21, 17, 94, 58, 73, 39, 50, 2, 79, 67, 85, 25, 91, 60, 38, 72, 4,1,6};

        int enKucuk= tamSayilar[0];
        for (int i : tamSayilar) {
            if(i< enKucuk)
            enKucuk= i;
        }
        System.out.println("en küçük eleman: "+enKucuk);*/

        //kullanıcının girdiği listede en kucugu ve indisini bulan program
        Scanner input = new Scanner(System.in);
        int[] tamSayilar = new int[5];
        int enKucuk;
        int enKucukIndis=0;
        int sayac = 0;
        
        while(sayac<5){
            System.out.print((sayac+1) + ". elemani girin: ");
            tamSayilar[sayac] = input.nextInt();
            sayac++;
        }
        enKucuk= tamSayilar[0];
        for (int i=0; i<tamSayilar.length; i++) {
            if(tamSayilar[i]<enKucuk){
                enKucuk= tamSayilar[i];
                enKucukIndis=i;
            }
            
        }

        System.out.print("Liste: ");
        for (int i : tamSayilar) {
            System.out.print(i+", ");
        }
        System.out.println("\nEn küçük: "+enKucuk);
        System.out.println("En küçük sayinin indisi: "+enKucukIndis);
    }
}
