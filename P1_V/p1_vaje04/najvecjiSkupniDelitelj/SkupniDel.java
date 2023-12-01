import java.util.Scanner;

public class SkupniDel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int g = sc.nextInt();

        for (int i = g; i <= n; i = i + g) {
            for (int j = i ; j <= n; j = j + g) {
                if (gcd(i, j) == g) {
                    System.out.printf("(%d, %d)%n", i, j);
                }
            }
        }

        sc.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
