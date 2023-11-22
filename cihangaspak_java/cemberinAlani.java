package cihangaspak_java;
import java.util.Scanner;

class cemberinAlani{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float yariCap ;
        float alan;
        float cevre ;

        System.out.print("Cemberin yaricapini giriniz: ");
        yariCap = input.nextFloat();
        alan = (float) (Math.PI*yariCap*yariCap);
        cevre = (float) (2*Math.PI*yariCap);

        System.out.println("Yaricapi "+ yariCap+ " olan cemberin alani: "+alan);
        System.out.println("Yaricapi "+ yariCap+ " olan cemberin cevresi: "+ cevre);   
        input.close();
    }
}