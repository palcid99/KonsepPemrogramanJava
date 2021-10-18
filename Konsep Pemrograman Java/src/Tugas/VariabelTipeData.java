package Tugas;

public class VariabelTipeData {

    public static void main(String[] args) {
        int Jumlahhari = 2;
        int Jumlahjam = 3;
        int Jumlahmenit = 5;
        int Jumlahdetik = 28;

        int A = Jumlahhari*86400;
        int B = Jumlahjam*3600;
        int C = Jumlahmenit*60;
        int TotalDetik = A+B+C+Jumlahdetik;

        System.out.print("Total = ");
        System.out.println( TotalDetik + " detik");

    }
}

