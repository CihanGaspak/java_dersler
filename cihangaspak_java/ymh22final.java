package java_dersler.cihangaspak_java;

import java.util.ArrayList;
import java.util.Scanner;


public class ymh22final {
    public static void main(String[] args) {
        
        ///TAS KAĞIT MAKAS
        /*String[] nesneler = {"Tas","Kagit","Makas"};
        int pcSelected= (int) (Math.random()*3);
        
        Scanner input= new Scanner(System.in);
        System.out.print("Tas(0), Kagit(1), Makas(2)\nSecimini Yap: ");
        int userSelected= input.nextInt();

        if(pcSelected==userSelected){
            System.out.println("Bilgisayar: "+nesneler[pcSelected]);
            System.out.println("Sen: "+nesneler[userSelected]);
            System.out.println("Kazanan yok. Durum berabere!");
        }
        else if(
            (pcSelected==0 && userSelected==2) ||
            (pcSelected==1 && userSelected==0) ||
            (pcSelected==2 && userSelected==1)
            )
            {
                System.out.println("Bilgisayar: "+nesneler[pcSelected]);
                System.out.println("Sen: "+nesneler[userSelected]);
                System.out.println("Bilgisayar kazandi.");
            }
            else {
                System.out.println("Bilgisayar: "+nesneler[pcSelected]);
                System.out.println("Sen: "+nesneler[userSelected]);
                System.out.println("Sen kazandin.");
            }*/

            /*//Çıktı Sorusu
            int a= 2222, b=1111; //b=3333;
            System.out.print("a+b:");
            System.out.println(a + ++b); //3334
            System.out.println("a+b:"+ a + b); //22221112
            b= -a++; //b= -2221
            System.out.printf("a+b:000%-5d", a+b); //0001 */
            
            //Fibonacci List sorusu
            /*Scanner input =new Scanner(System.in);
            System.out.print("Fibonacci Dizisi Kaç Elemanli Olsun?: ");
            int n = input.nextInt();
            int[] sayilar = new int[n];
            sayilar[0]= 0;
            sayilar[1]= 1;

            for(int i=2; i<n; i++){
                sayilar[i]= (sayilar[i-1] + sayilar[i-2]);
            }

            System.out.print(n+" elemanli fibonacci dizisi: ");
            for(int i=0; i<sayilar.length;i++){
                System.out.print(sayilar[i]+" ");
            }*/

            /*double sira[] = {0.1, 1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.0};
            double sayi1;
            double sayi2; 

            for(int i=0; i<sira.length; i++){
                for(int j=i+1; j<sira.length; j++){
                    if(sira[i]< sira[j]){
                        sayi1 = sira[i];
                        sayi2 = sira[j];
                        sira[i]= sayi2;
                        sira[j]= sayi1;
                    }
                }
            }

            for(int i=0;i<sira.length;i++){
                System.out.print(sira[i]+" ");
            }*/

            
            Scanner input= new Scanner(System.in);
            System.out.print("Kaç satir olsun: ");
            int satir= input.nextInt();
            System.out.print("Kaç sutun olsun: ");
            int sutun= input.nextInt();

            System.out.print("!!!!");
            for(int i=1; i<=sutun; i++){
                System.out.printf("!!!%d",i);
            }
            System.out.println();

            System.out.print("----");
            for(int i=1; i<=sutun; i++){
                System.out.printf("----");
            }
            System.out.println();

            for(int i=1; i<=satir; i++){
                System.out.printf("%d>**",i);
                for(int j=1; j<=sutun; j++){
                    System.out.printf("-%d0%d",i,j);
                }
                System.out.println();
            }

    }
}
