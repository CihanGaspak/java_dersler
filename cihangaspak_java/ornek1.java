package cihangaspak_java;


public class ornek1 {
    void decToBinary(int n) {
        if (n > 0) {
            decToBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    static int binaryToDecimal(int n) {
        int num = n;
        int dec_value = 0;

        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;
    }

    public static void main(String[] args) {
        int n = 1111;
        //ornek1 m = new ornek1();
        //m.decToBinary(n);
        //System.out.println();
        System.out.println(binaryToDecimal(n));
    }

}


