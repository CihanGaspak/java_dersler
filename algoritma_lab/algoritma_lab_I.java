import java.util.Scanner;

public class algoritma_lab_I {
    public static void main(String[] args) {
        String metin = "Mehaba Gardas";
        
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kere yazdıralım: ");
        int sayi = input.nextInt();
        for(int sayac=0; sayac<sayi; sayac++){
            System.out.println(metin+" "+(sayac+1));
        } 

        input.close();
    }
}
