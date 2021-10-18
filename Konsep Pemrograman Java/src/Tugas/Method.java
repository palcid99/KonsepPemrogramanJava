package Tugas;

public class Method {
    public static void main(String[] args) {

    }
    // Soal No. 1
    public static String login(String username, String password) {
        if (username.equals("sammi")) {
            if (password.equals("sammi123")) {
                return "sammi berhasil login";
            } else {
                return "password sammi salah";
            }
        }
        if (username.equals("faren")) {
            if (password.equals("faren123")) {
                return "faren berhasil login";
            } else {
                return "password faren salah";
            }
        }
        return "akun tidak ditemukan";
    }

    // Soal No. 2
    public static void polaAngka(int N) {
        int z = 0;
        for (int x = 1; x <= N; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(z);
                if (z == 9) {
                    z = 0;
                } else {
                    z++;
                }

            }
            System.out.println();
        }

    }

    // Soal No. 3
    public static String agakPrima(int N) {
        int k = 2;
        int l = (N / 2) + 1;

        for (int i = 2; i <= l; i++) {
            if (N % i == 0) {
                k = k + 2;
                l = (N / i) - 1;
            }
        }
        if (k <= 4) {
            return "YA";
        }
        return "BUKAN";
    }
}