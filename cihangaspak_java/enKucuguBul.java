package cihangaspak_java;

public class enKucuguBul {
    public static void main(String[] args) {
        int[] tamSayiDizisi = {1,2,45,77,65,3,-5};
        int enKucuk= tamSayiDizisi[0];

        for(int i =1; i<tamSayiDizisi.length;i++){
            if(enKucuk>tamSayiDizisi[i]) {
                enKucuk=tamSayiDizisi[i];
            }
        
        }
        System.out.println("En küçük eleman: "+enKucuk);
    }
}