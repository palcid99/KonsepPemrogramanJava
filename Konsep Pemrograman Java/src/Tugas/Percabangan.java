package Tugas;

public class Percabangan {
    // Gaji karyawan A
    public static void main(String[] args) {
        double upah_per_jam = 2000;
        double upah_lembur_per_jam = 4000;
        double jumlah_jam_kerja_normal = 200;
        double jumlah_hari_kerja = 26;
        double jumlah_jam_kerja_per_hari = 9;

        double total_jam_kerja = jumlah_hari_kerja*jumlah_jam_kerja_per_hari;
        double total_jam_lembur = total_jam_kerja%jumlah_jam_kerja_normal;

        double Gaji_normal_karyawan_A = upah_per_jam*jumlah_jam_kerja_normal;
        double Upah_lembur_karyawan_A = upah_lembur_per_jam*total_jam_lembur;

        double Upah_bulanan = Gaji_normal_karyawan_A+Upah_lembur_karyawan_A;
        double Tunjangan = Upah_bulanan*25/100;

        double Gaji_total_karyawan_A = Upah_bulanan+Tunjangan;

        // Perbandingan gaji karyawan A dan B
        double Gaji_karyawan_B = 700000;
        String Perbandingan_Gaji = (Gaji_karyawan_B>Gaji_total_karyawan_A)?" Karyawan B":" Karyawan A";

        System.out.println("Gaji Karyawan A = Rp."+Gaji_total_karyawan_A);
        System.out.println("Gaji Karyawan B = Rp."+Gaji_karyawan_B);
        System.out.println("Gaji Karyawan yang terbesar ="+Perbandingan_Gaji);
        System.out.println("Besar gaji karyawan yang terbesar = Rp."+Gaji_karyawan_B);


    }

}
