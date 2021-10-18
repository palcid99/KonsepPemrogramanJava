package Tugas;

public class Perulangan {
    public static void main(String[] args) {
        soalNo1();
        soalNo2();
    }

    public static void soalNo1() {
        int total=0;
        for(int ab = 10; ab <= 700; ab++) {
            if (ab % 3 == 0 || ab % 5 == 0 ) {
                total=total+ab;
            }
        }
        System.out.println("total = "+ total);
    }


    public static void soalNo2() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if ( i==5 && j==5 ) {
                    System.out.print("# ");
                } else if ( i == j ) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
    }
}