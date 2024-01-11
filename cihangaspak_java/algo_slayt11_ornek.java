package java_dersler.cihangaspak_java;

public class algo_slayt11_ornek {
    public static void main(String[] args) {
        //10.000 adet mesaj yazan uygulama for ile
        for(int i =1; i<=10000; i++){
            System.out.println("Merhaba "+i+".kez");
        }

        //10.000 adet mesaj yazan uygulama while ile
        int i = 1;
        while (i<=10000){
            System.out.println("Merhaba "+i+".kez");
            i++;
        }
    }
}
