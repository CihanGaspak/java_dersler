package cihangaspak_java;

import java.util.Scanner;

class basilanTusuSoyleme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String girileString = "";
        char girilenChar;
        
        while(true){
            System.out.print("Bir tuşa basın, hangi tuşa bastığınızı söyleyelim(Çıkmak için 0'a basın): ");
            girileString = input.next();
            if(girileString.equals("0")) {
                System.out.println("Uygulama kapatılıyor...");
                break;
            }
            else{
                girilenChar = girileString.charAt(0);
            System.out.println("Bastığınız tuş: '" + girilenChar+ "'");
            }
        }
        input.close();
    }
}