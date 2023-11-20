package cihangaspak_java;

import java.util.Scanner;

public class tas_kagıt_makas {
    public static void main(String[] args){
        int randomNumber = (int)((Math.random()*10)%3);
        int userNumber;
        String oyuncuKazandi = "Sen Kazandın";
        String pcKazandi = "Bilgisayar Kazandı";
        String berabere = "Berabere";
        String tas = "Taş";
        String kagit = "Kağıt";
        String makas = "Makas";
        String pcTercihi = "";
        String oyuncuTercihi = "";
        String kimKazandi= "";
        boolean gameBool = true;

        Scanner input = new Scanner(System.in);

        while(gameBool){
          System.out.println("Taş(0)\nKağıt(1)\nMakas(2)\nOyundan çıkış(9)");
        System.out.print("Seçiminiz: ");
          userNumber = input.nextInt();
       if(userNumber==9){
            System.out.println("Oyun kapatılıyor...");    
            gameBool= false;
       } 
       else if((userNumber >2) || userNumber <0){
          System.out.println("Lütfen belirtilen aralıktan büyük sayı girmeyiniz.");
       }    
       else if(randomNumber==0 && userNumber==0){
          pcTercihi= tas;
          oyuncuTercihi= tas;
          kimKazandi= berabere;
       }
       else if(randomNumber==0 && userNumber==1){
          pcTercihi= tas;
          oyuncuTercihi= kagit;
          kimKazandi= oyuncuKazandi;
       } 
       else if(randomNumber==0 && userNumber==2){
          pcTercihi= tas;
          oyuncuTercihi= makas;
          kimKazandi= pcKazandi;
       } 

       else if(randomNumber==1 && userNumber==0){
          pcTercihi= kagit;
          oyuncuTercihi= tas;
          kimKazandi= pcKazandi;
       } 
       else if(randomNumber==1 && userNumber==1){
          pcTercihi= kagit;
          oyuncuTercihi= kagit;
          kimKazandi= berabere;
       }
       else if(randomNumber==1 && userNumber==2){
          pcTercihi= kagit;
          oyuncuTercihi= makas;
          kimKazandi= oyuncuKazandi;
       }
       else if(randomNumber==2 && userNumber==0){
          pcTercihi= makas;
          oyuncuTercihi= tas;
          kimKazandi= oyuncuKazandi;
       }
       else if(randomNumber==2 && userNumber==1){
          pcTercihi= makas;
          oyuncuTercihi= kagit;
          kimKazandi= pcKazandi;
       }
       else if(randomNumber==2 && userNumber==2){
          pcTercihi= makas;
          oyuncuTercihi= makas;
          kimKazandi= berabere;
       }
       System.out.println("Sen: "+oyuncuTercihi);
       System.out.println("PC tercihi: "+pcTercihi);
       System.out.println("Kazanan: ***"+kimKazandi+"***");
     }
     input.close();
    }
}
