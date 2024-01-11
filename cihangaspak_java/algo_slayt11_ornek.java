package java_dersler.cihangaspak_java;

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
        String mesaj ;
        for(int i =1; i<=10000; i++){
            if(i%2==1) 
            mesaj = "Yazilim Muhendisligi";
            else
            mesaj = "Cok calismaliyiz cokk";

            System.out.println(mesaj+" "+i);            
        }
    }
}
