package algoritma1_cevaplar;

import java.util.Scanner;

class vize_soru2{
    public static void main(String[] args) {
        //kullanıcı tarafından girilen sayı alın
        //sayi tek ise 5 kez merhaba algoritma
        // çift ise 10 kez merhaba proglama yazdıran uygulama
        
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        int girilenSayi = input.nextInt();

        if(girilenSayi %2==0){
            for(int i =0;i<10;i++){
                System.out.println("Merhaba Programlama"+i);
            }
        }
        else{
            for(int i =0; i<5; i++){
                System.out.println("Merhaba Algoritma"+i);
            }
        }
        input.close();
    }
}