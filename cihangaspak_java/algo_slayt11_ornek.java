package java_dersler.cihangaspak_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

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
        ArrayList<String> ad_soyad = new ArrayList<>();
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
    }
}
