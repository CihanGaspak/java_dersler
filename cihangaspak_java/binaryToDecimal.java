package cihangaspak_java;

public class binaryToDecimal {

    static int binaryToDec(int num){
        String numStr = String.valueOf(num);
        int result = 0;
        for(int i = 0; i < numStr.length(); i++){
            int digit = Character.getNumericValue(numStr.charAt(i));
            result += digit * Math.pow(2, numStr.length()-1-i);
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(binaryToDec(10111));
    }
}
