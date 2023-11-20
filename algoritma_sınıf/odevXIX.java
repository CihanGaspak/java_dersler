package algoritma_sınıf;

public class odevXIX{
    public static void main(String[]args) {
        //Math Yuvarlama fonksiyonları

        //ceil fonksiyonu üstteki en yakın tamsayıya yuvarlar
        System.out.println(Math.ceil(1.6));   //2.0
        System.out.println(Math.ceil(1.4));   //2.0
        System.out.println(Math.ceil(1.1));   //2.0
        System.out.println(Math.ceil(1.0000000001));  //2.0
        System.out.println(Math.ceil(-1.6));  // -1.0
        System.out.println("**************");
        
        //floor fonksiyonu alttaki en yakın tamsayıya yuvarlar
        System.out.println(Math.floor(1.3));  //1.0
        System.out.println(Math.floor(1.8));  //1.0
        System.out.println(Math.floor(-1.1));  //-2.0
        System.out.println("**************");

        //rint fonksiyonu en yakın tamsayıya yuvarlar iki sayıda eşit mesafede ise çift olana yuvarlar
        System.out.println(Math.rint(1.7));  //2.0
        System.out.println(Math.rint(1.4));  //2.0
        System.out.println(Math.rint(1.5));  //2.0
        System.out.println(Math.rint(4.5));  //4.0
        System.out.println("**************");

        //round fonksiyonu 
        //x, float ise (int)Math.floor(x + 0.5) sonucunu döndürür.
        //x, double ise (long)Math.floor(x + 0.5) sonucunu döndürür.
        System.out.println(Math.round(2.49));  //2
        System.out.println(Math.round(2.5));  //3
        System.out.println(Math.round(1.8f));  //2
        System.out.println("**************");

        //min,max,abs metodları 

        //min(x,y) metodu girilen iki sayıdan küçüğünü döndürür
        System.out.println(Math.min(1, 2));  //1
        System.out.println(Math.min(4.18, 4)); // 4.0
        System.out.println(Math.min(-4, -4.1)); //-4.1
        System.out.println("**************");

        //max(x,y) metodu girilen iki sayıdan büyüğünü döndürür
        System.out.println(Math.max(1, 2));  //2
        System.out.println(Math.max(4.18, 4)); // 4.18
        System.out.println(Math.max(-4, -4.1)); //-4.0
        System.out.println(Math.max('1', 'B')); //66
        System.out.println("**************");

        //abs() metodu girilen sayının mutlak değerini döndürür
        System.out.println(Math.abs(-12));   //12
        System.out.println(Math.abs(455)); //455
        System.out.println("**************");

        //random methodu
        // random methodu 0<= Math.random() <1 aralığında değer döndürür
        // a + (int)(Math.random()*b) işlemi a ile a+b aralığında değer dönderir
        // a<= random int değerler <a+b
        int deger = 10 + (int)(Math.random()*90); //[10,100) arasında değer gönderir.
        System.out.println(deger);
        System.out.println("**************");
        
        // char örnekleri 
        char ch = 'a';
        System.out.println(ch);  //a
        System.out.println(++ch); //b
        System.out.println(ch-32); //66
        System.out.println("**************");

        //char ve numerik tipler arasında çevirim
        char intToChar= (char)66; 
        System.out.println(intToChar); //B

        char floatToChar = (char)71.89;
        System.out.println(floatToChar);  //G

        int charToInt = (int)'H';
        System.out.println(charToInt);  //72

        //dönüşüm yapıldıgında hedef değişkene uyuyosa ilk örenkteki gibi yapılabilir. 
        //olmazsa aşağıdaki gibi yapılır

        byte a = 'a'; 
        System.out.println(a);  //97

        //byte b = '\uFFF4'; //hata verdi
        byte b = (byte)'\uFFF4';
        System.out.println(b); //-12

        //char nesnelerini karşılaştırabiliriz
        char charA= 'A';
        char charB= 'B';
        System.out.println(charA<charB); //true
        System.out.println('h'<'Z'); //false

        //sayfa 34de kaldık

    }
}