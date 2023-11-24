package algoritma1_cevaplar; 

import java.util.Scanner;

class but_soru1{
    public static void main(String[] args) {
        // "Yazilim2023" diye şifre belirle
        //kullanıcı sifreyi girsin şifre yanlış ise bir daha sorsun
        // 5 kez yanlıs girilirse program kapansın dogruya 
        // dogruysa Hosgeldiniz! Program baslıyor desin
        final String passwd = "Yazilim2023";
        int yanlisDeger = 1;
        String girilenSifre;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullnici sifrenizi giriniz: ");
        girilenSifre= input.next();

        while(yanlisDeger<5){
            if(girilenSifre.equals(passwd)){
                System.out.println("giriş basarılı");
                break;
            }
            else{
                System.out.print("Sifre yanlsı tekrar giriniz: ");
                girilenSifre = input.next();
                yanlisDeger++;
            }
        }
        
        input.close();
    }
}


// hafızada fazla yer almasın diye bu yol da kulanılabilir

/*
 System.out.print("Kullnici sifrenizi giriniz: ");

        while(yanlisDeger<=5) {
            girilenSifre = input.next();

            if(girilenSifre.equals(passwd)){
                System.out.println("Hos geldin! Program baslıyor");
                break;
            }
            else if(yanlisDeger==5){
                break;
            }
            else{
                System.out.print("Sifre yanlis, tekrar giriniz: ");
                yanlisDeger++;

            }
        }
 */