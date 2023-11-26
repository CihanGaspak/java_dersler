package cihangaspak_java;

import java.util.Scanner; 

class sayiTahminOyunu{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomSayi = 1+(int)(Math.random()*1000); 
        int tahmin;
        boolean gameBool = true;
        int denemeSayisi = 1;

        while(gameBool){
            System.out.print("1 ile 1000 arasinda sayi giriniz: ");
            tahmin = input.nextInt();

            if(tahmin<1) {
                System.out.println("Sayi 1'den küçük değildir. Tekrar deneyin!");
                denemeSayisi += 1 ;
            }
            else if(tahmin>1000) {
                System.out.println("Sayi 1000'den büyük değildir. Tekrar deneyin!");
                denemeSayisi +=1;

            }
            else if(tahmin>randomSayi) {
                System.out.println("Büyük girdiniz. Azaltin.");
                denemeSayisi +=1;

            }
            else if(tahmin<randomSayi) {
                System.out.println("Kücük girdiniz. Arttirin.");
                denemeSayisi +=1;

            }
            else if(tahmin==randomSayi){
                System.out.print("Tebrikler dogru bildiniz sayi: "+randomSayi+"\'dir. ");
                System.out.println(denemeSayisi+ ". denemede buldunuz. ");
                gameBool = false;
                System.out.println("Oyun kapatiliyor...");
            }
        }
        input.close();
    }
}
