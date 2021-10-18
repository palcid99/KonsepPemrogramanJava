package Tugas;

import java.util.stream.*;

/**
 * @author Panji Ramadan Saputra
 * @NIM    2103126342
 */
public class Array {
    public static void main(String[] args) {
        int[] angka = {15, 15, 15, 15, 16, 16, 17, 17, 20, 21, 23, 23, 28, 30, 32, 35, 37,
                38, 40, 41, 41, 43, 45, 45, 49, 50, 53, 54, 55, 55, 59, 59, 60, 63,
                65, 65, 67, 70, 71, 72, 72, 75, 75, 78, 80, 82, 83, 84, 85, 85, 85,
                88, 89, 89, 90, 92, 93, 94, 95, 95, 96, 96, 97, 97, 98, 98, 98, 99,
                99, 99, 99, 99, 99, 99, 99 };
        // Total
        int total = IntStream.of(angka).sum();
        System.out.println("Total = " + total);

        //Rata-rata
        double rataRata = total / angka.length;
        System.out.println("Rata-rata = " + rataRata);

        //Kuartil
        int jumlahArray = angka.length;
        int letakQ1 = jumlahArray / 4;
        int letakQ2 = jumlahArray * 2 / 4;
        int letakQ3 = jumlahArray * 3 / 4;

        System.out.println("Letak q1: x19 = " + angka[letakQ1]);
        System.out.println("Letak q2: x38 = " + angka[letakQ2]);
        System.out.println("Letak q3: x57 = " + angka[letakQ3]);

    }
}
