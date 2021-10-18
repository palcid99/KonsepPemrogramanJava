package Tugas;

/**
 * @author Panji Ramadan Saputra
 */

public class UTS {
    public static void main(String[] args) {
        for (int i = 1; i <=5000000; i++) {
            if(i % 10 == 0){
                System.out.println("ini bil kelipatan 10 bro");
            }
            else if (i % 2 == 0){
                System.out.println("ini bil genap bro");
            }
            else {
                System.out.println("ini bil ganjil bro");
            }

        }
    }
}