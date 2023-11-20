import java.util.Scanner;

public class algoritma_lab_II {
    public static void main(String[] args) {
        String metin = "elma \"ali\"";
        String metin1 = "elma \"ali\"";
        String metin2 = "elma\rali"; //satırbaşı
        int tamSayi = 10;
        float virgulluSayi = 12.5f;

        System.out.println(metin);
        System.out.println(metin1);
        System.out.println(metin2);
        System.out.println(tamSayi);
        System.out.println(virgulluSayi);

        while(tamSayi<0) {
            //tamSayi++;
            System.out.println(tamSayi);
            
        }
        System.out.println("bitti");
        Scanner input = new Scanner(System.in);
        System.out.print("en giriniz: ");
        int en= input.nextInt();

        System.out.print("boy giriniz: ");
        int boy = input.nextInt();

        for(int i= 0 ;i<boy; i++){
            for(int j= 0; j<en; j++){
                System.out.print("*");

            }
            System.out.println();
        }
        input.close();
    
        
    }
}
