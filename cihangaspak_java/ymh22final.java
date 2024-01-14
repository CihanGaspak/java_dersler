package java_dersler.cihangaspak_java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


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
            Scanner input =new Scanner(System.in);
            System.out.print("Fibonacci Dizisi Kaç Elemanli Olsun?: ");
            int n = input.nextInt();
            List<Integer> sayilar = new ArrayList<Integer>();
            sayilar.add(0);
            sayilar.add(1);

            for(int i=2; i<n; i++){
                sayilar.add((sayilar.get(i-1)+sayilar.get(i-2)));
            }

            System.out.print(n+" elemanli fibonacci dizisi: ");
            for(int i=0; i<sayilar.size();i++){
                System.out.print(sayilar.get(i)+" ");
            }
    }
}
