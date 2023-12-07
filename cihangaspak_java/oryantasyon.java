package cihangaspak_java;

public class oryantasyon {
    public static void main(String[] args) {
        //Teknoloji Fakültesi 
        //Yazılım Mühendisliği
        //Cihan GASPAK 220541121



        //1)Ekrana “Merhaba Dünya” yazdıran bir program yazın.
        //System.out.println("Merhaba Dunya");
        
        
        //2)Kullanıcıdan bilgi alan ve bunu yazdıran program   
        Scanner input = new Scanner(System.in);
        //System.out.print("Sayi giriniz: ");
        //String mesaj = input.next();
        //System.out.println("girilen sayi: "+mesaj);
        
        //3)Yarıçapı girilen çemberin çevresi
        /*System.out.print("Yaricap degeri: ");
        double yariCap = input.nextDouble();
        double cevre = 2*3.14*yariCap;
        System.out.println("Yaricapi "+yariCap+" olan cemberin cevresi: "+cevre);*/
        
        //4)Klavyeden girilen iki sayıyı toplayan,farkını bulan çarpan ve bölen program
        /*System.out.print("birinci sayi:");
        int sayi1= input.nextInt();
        System.out.print("ikinci sayi:");
        double sayi2= input.nextDouble();
        
        System.out.println("toplam: "+(sayi1+sayi2));
        System.out.println("fark: "+(sayi1-sayi2));
        System.out.println("carpim: "+(sayi1*sayi2));
        System.out.println("bolum: "+(sayi1/sayi2));*/
        
        //5)İstenen mesajı istenilen kadar yazdıran program
        /*System.out.print("Ne yazdıralım?: ");
        String mesaj = input.nextLine();
        System.out.print("Kaç kere yazdıralım?: ");
        int sayac = input.nextInt();
        
        for(int i =0; i<sayac; i++){
            System.out.println((i+1)+".kez "+mesaj);
        }
        */
        
        //6)Girilen 3 sayısı sıralayan program
        /*System.out.print("1.sayı: ");
        int sayi1 = input.nextInt();
        System.out.print("2.sayı: ");
        int sayi2= input.nextInt();
        System.out.print("3.sayı: ");
        int sayi3 = input.nextInt();
        
        if((sayi1>sayi2) && (sayi1>sayi3)){
            if(sayi2>sayi3){
                System.out.println(sayi1+">"+sayi2+">"+sayi3);
            }
            else{
                System.out.println(sayi1+">"+sayi3+">"+sayi2);
            }
        }
        else if((sayi2>sayi1) && (sayi2>sayi3)) {
            if(sayi1>sayi3){
                System.out.println(sayi2+">"+sayi1+">"+sayi3);
            }
            else{
                System.out.println(sayi2+">"+sayi3+">"+sayi1);
            }
        }
        else if((sayi3>sayi1) && (sayi3>sayi2)) {
            if(sayi1>sayi2){
                System.out.println(sayi3+">"+sayi1+">"+sayi2);
            }
            else{
                System.out.println(sayi3+">"+sayi2+">"+sayi1);
            }
        }
        else if((sayi1==sayi2)&& (sayi2==sayi3)){
            System.out.println("uc sayıda eşittir");
        }
        */
        //7)Girilen iki sayıya seçilem işlemi uygulayan program
        /*System.out.print("1.sayı: ");
        int sayi1 = input.nextInt();
        System.out.print("2.sayı: ");
        int sayi2= input.nextInt();
        System.out.println("toplama için 0\ncikarma için 1\ncarpma için 2\nbolme icin 3 \nmod hesaplama icin 4'e basınız: ");
        int islem = input.nextInt();
        
        if(islem==0){
            System.out.println(sayi1+" + "+sayi2+" = "+(sayi1+sayi2));
        }
        else if(islem==1){
            System.out.println(sayi1+" -  "+sayi2+" = "+(sayi1-sayi2));
        }
        else if(islem==2){
            System.out.println(sayi1+" * "+sayi2+" = "+(sayi1*sayi2));
        }
        else if(islem==3){
            System.out.println(sayi1+" / "+sayi2+" = "+((sayi1*1.0)/sayi2));
        }
        else if(islem==4){
            System.out.println(sayi1+" % "+sayi2+" = "+(sayi1%sayi2));
        }else{
            System.out.println("Lütfen geçerli bir işlem seçiniz!");
        }
        */
        //8)İstenilen kadar sayının toplamı ve ortalamasını veren uygulama
        /*double toplam = 0;
        int sayi;
        int sayac =0;
        while(true){
            System.out.print("1.sayı: ");
                sayi = input.nextInt();
            if(sayi==0){
                break;
            }
            else{
                toplam += sayi;
                sayac++;
            }
            
            
        }
        System.out.println("girilen sayıların toplamı: "+toplam+" girilen sayi adedi: "+sayac+" ortalama: "+(toplam/sayac)); */
        
        //9)Ekrana en*boy şeklinde istenilen ölçüde dikdörtgen çizdiren uyuglama
        /*System.out.print("kac satir: ");
        int yatay = input.nextInt();
        
        System.out.print("kac sutun: ");
        int dikey = input.nextInt();
        
        for(int i=0; i<yatay; i++){
            for(int j =0;j<dikey;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        
        
        //10)Sayı Tahmin oyunu (0-100)
        int randomSayi = (int)(Math.random()*100);
        int denemeSayisi=1;
        
        while(true){
            System.out.print("Sayiyi tahmin et 0-100: ");
            int tahmin = input.nextInt();
            if((tahmin>100) && (tahmin<0)){
                System.out.println("Sayi 0 ile 100 arasında 0 dahil!");
                denemeSayisi++;
            }
            else if(tahmin<randomSayi){
                System.out.println("Sayiyi buyult");
                denemeSayisi++;
            }
            else if(tahmin>randomSayi){
                System.out.println("Sayiyi kucult");
                denemeSayisi++;
            }
            else if(tahmin==randomSayi){
                System.out.println("TEBRIKLER DOGRU BILDINIZ sayi: "+randomSayi+"dir. "+denemeSayisi+".denemede bildiniz.");
            }
        }
    }
}
