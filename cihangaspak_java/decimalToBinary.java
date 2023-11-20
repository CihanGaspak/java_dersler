package cihangaspak_java;

public class decimalToBinary {
    
    static void decToBinary(int num) {
        if(num>0) {
            decToBinary(num/2);
            System.out.print(num%2);

        }else{
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        decToBinary(91);
    }

}
