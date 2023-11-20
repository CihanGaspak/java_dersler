package cihangaspak_java;

import java.util.Scanner;

public class decimalToOktal {

    static void decToOktal(int num) {
        if(num>0){
            decToOktal(num/8);
            System.out.print(num%8);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Desimal tabandaki sayıyı giriniz: ");
        int num = input.nextInt();

        System.out.print("Desimal tabandaki sayıyının oktal karşılığı: ");
        decToOktal(num);
        input.close();
    }
}
