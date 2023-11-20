package algoritma_sınıf;

import java.util.Scanner;


public class odevXVII {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("1 ile 7 arasında sayı giriniz: ");
        int girilenSayi = input.nextInt();

        switch(girilenSayi) {
            case 1: System.out.println("Bugün pazartesi");
                    break;
            case 2: System.out.println("Bugün salı");
                    break;
            case 3: System.out.println("bugün çarşamba");
                    break;
            case 4: System.out.println("bugun perşembe");
                    break;
            case 5: System.out.println("bugün cuma");
                    break;
            case 6: System.out.println("bugun cumartesi");
                    break;
            case 7: System.out.println("bugün pazar");
                    break;
            default: System.out.println("1  ile 7 arasında bir sayı giriniz!");
                System.exit(1); //  programı sonrandırır ve "cihan" metni basılmaz
        }
        input.close();
    }
}
