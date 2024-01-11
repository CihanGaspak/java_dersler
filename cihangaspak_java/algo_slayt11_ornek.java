package java_dersler.cihangaspak_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class algo_slayt11_ornek {
    public static void main(String[] args) {
        //10.000 adet mesaj yazan uygulama for ile
        /*for(int i =1; i<=10000; i++){
            System.out.println("Merhaba "+i+".kez");
        }
        */

        //10.000 adet mesaj yazan uygulama while ile
        /*int sayac = 1;
        while (sayac<=10000){
            System.out.println("Merhaba "+sayac+".kez");
            sayac++;
        }
        */

        /*for(int i =1; i<=10; i++){
            if(i%2==1) 
            System.out.println("Merhaba -"+i);
            else
            System.out.println("Cok calismaliyiz cokk -"+i);
        }
        */
        
        //10.000 mesajı tek print ile yazdır
        /*String mesaj ;
        for(int i =1; i<=10000; i++){
            if(i%2==1) 
            mesaj = "Yazilim Muhendisligi";
            else
            mesaj = "Cok calismaliyiz cokk";

            System.out.println(mesaj+" "+i);            
        }*/
        /*ArrayList<String> ad_soyad = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("ad_soyad.txt"))) {
            String line;
            int arananIndex;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                arananIndex = line.indexOf(" ");
                if(arananIndex != -1) {
                    ad_soyad.add("SAYIN " + line.substring(0, arananIndex).toUpperCase() + " " + line.substring(arananIndex + 1).toUpperCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ad_soyad_sayin.txt"))) {
            for(String sayin_ad_soyad: ad_soyad){
                writer.write(sayin_ad_soyad);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        /*ArrayList<String> duzenlenmisIsimler = new ArrayList<>();

        // Dosyadan okuma işlemi
        try (BufferedReader reader = new BufferedReader(new FileReader("ad_soyad.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Satır başı ve sonundaki boşlukları kaldır ve birden fazla boşluğu tek boşlukla değiştir
                line = line.trim().replaceAll("\\s+", " ");
                // Tüm isimleri büyük harfe çevir ve "SAYIN" ile başlat
                duzenlenmisIsimler.add("SAYIN " + line.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Dosyaya yazma işlemi
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("SN_ISIMLER.txt"))) {
            for (String isim : duzenlenmisIsimler) {
                writer.write(isim);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        //sayı toplama
        /*int sayi1 = (int) (Math.random()*10);
        int sayi2 = (int) (Math.random()*10);
        int sonuc;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print(sayi1 +" + "+ sayi2 +" sonuc nedir? : ");
            sonuc = input.nextInt();
        } while (sonuc != sayi1+sayi2);
        System.out.println("tebrikler!");*/

        //sayı tahmin
        int sayi = (int) (Math.random()*101);
        int sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("0 ile 100 arasindaki sayiyi tahmin edin: ");
            sonuc = input.nextInt();

        do {
            if(sayi>sonuc) 
            System.out.print("küçük ");
            else if(sayi<sonuc) 
            System.out.print("büyük ");
            System.out.print("tekrar deneyin: ");
            sonuc = input.nextInt();
        } while (sonuc != sayi);
        System.out.println("tebrikler!");


    }
}
