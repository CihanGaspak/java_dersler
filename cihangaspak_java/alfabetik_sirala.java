package java_dersler.cihangaspak_java;
import java.util.Scanner;


public class alfabetik_sirala {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. şehri giriniz: ");
        String sehir1 = input.next();

        System.out.print("2. şehri giriniz: ");
        String sehir2 = input.next();

        if(sehir1.compareToIgnoreCase(sehir2)<0) {
            System.out.println(sehir1+", "+sehir2+"'den önce gelir.");
        }
        else if(sehir1.compareToIgnoreCase(sehir2)==0){
            System.out.println(sehir1+", "+sehir2+" ile ayni siradadir.");
        }
        else {
            System.out.println(sehir2+", "+sehir1+"'den önce gelir.");
        }
        System.out.println(sehir1.compareTo(sehir2));
    input.close();
    }
}
