package cihangaspak_java;
import java.util.Scanner;

class vizeFinalHarflendir{
    public static void main(String[]args){
        float vizeNotu;
        float finalNotu;
        float ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Vize notunuzu girin: ");
        vizeNotu = input.nextFloat(); 
        System.out.print("Final notunuzu girin: ");
        finalNotu = input.nextFloat();
        
        ortalama = (float) (vizeNotu*0.4 + finalNotu*0.6);

        if(finalNotu<50){
            System.out.println("Final notun 50'den düşük olduğu için kaldın FF");
        }
        else if(ortalama>90){
            System.out.println("Ortalaman: "+ortalama+" AA ile geçtin.");
        }
        else if(ortalama>80){
            System.out.println("Ortalaman: "+ortalama+" BA ile geçtin.");
        }      
        else if(ortalama>70){
            System.out.println("Ortalaman: "+ortalama+" CB ile geçtin.");
        }
        else if(ortalama>60){
            System.out.println("Ortalaman: "+ortalama+" CC ile geçtin.");
        }
        else if(ortalama>50){
            System.out.println("Ortalaman: "+ortalama+" DD ile geçtin.");
        }
        else {
            System.out.println("Lütfen tekrar deneyiniz.");
        }  
        input.close();
    }
}