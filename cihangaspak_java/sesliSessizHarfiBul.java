package cihangaspak_java;
import java.util.Scanner;

class sesliSessizHarfBul{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String metin= "";
        int sesliHarfsayisi = 0;
        int sessizHarfsayisi= 0;
        int kelimeSayisi= 1;
        String sesliHarfler = "aeıioöuü";
        char c = ' ';

        System.out.print("Metin giriniz: ");
        metin = input.nextLine();
        metin= metin.toLowerCase();

        for(int j=0; j<metin.length();j++){
            c = metin.charAt(j);
            if(sesliHarfler.indexOf(c) != -1){
                sesliHarfsayisi++;
            }
            else if(c == ' '){
                kelimeSayisi++;
            }
        } 

        sessizHarfsayisi= metin.length() - (sesliHarfsayisi+kelimeSayisi)+1;

        System.out.println("Sesli: "+sesliHarfsayisi);
        System.out.println("Sessiz: "+sessizHarfsayisi);
        System.out.println("Kelime sayisi: "+kelimeSayisi);
        input.close();
    }
}