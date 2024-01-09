
package java_dersler.cihangaspak_java;

/**
 * trigonometrik_ornekler
 */
public class trigonometrik_ornekler {
    public static void main(String[] args) {
        System.out.println(Math.toDegrees(Math.PI/2)); //Radyanı dereceye çevirir.
        System.out.println(Math.toRadians(90)); //Dereceyi radyana çevirir.
        System.out.println(Math.sin(0)); //sinüs 0 değeri 
        System.out.println(Math.sin(Math.PI/6)); //sinüs 30 değeri
        System.out.println(Math.sin(Math.PI/2)); //sinüs 90 değeri 
        System.out.println(Math.cos(Math.PI/3)); //cosinus 60 değeri
        System.out.println(Math.cos(0)); //cosinus 0 değeri 
        System.out.println(Math.tan(Math.PI/4)); //tanjant 45 değeri 
        System.out.println(Math.atan(Math.PI/4)); //arctan 45 değeri  
        System.out.println(Math.min(12, 23));
        System.out.println(Math.max(12, 23));
        System.out.println(Math.abs(-45));
    }
}
