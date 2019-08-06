import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number = scanner.nextInt();

        while (number-- > 0) {
            int k = scanner.nextInt(), m = scanner.nextInt(), n = scanner.nextInt();

            int s = (int) (Math.log(n) / Math.log(m)) + 1;
            int[] c = new int[s];
            c[0] = 1;
            for (int i = 1; i < s; i++) {
                c[i] = m * c[i - 1];
            }

            int[] r = new int[n + 1];
            r[0] = 1;

            for (int i = 0; i < s; i++) {
                for (int j = c[i]; j <= n; j++) {
                    r[j] += r[j - c[i]];
                }
            }
            System.out.println(k + " " + r[n]);


        }

    }

}


