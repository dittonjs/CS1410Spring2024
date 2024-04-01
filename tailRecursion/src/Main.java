public class Main {
    public static void main(String[] args) {
        System.out.println(sum(100000, 0));
    }

    public static int sum(int n, int sum) {
        if (n == 0) return sum;
        return sum(n - 1, n + sum);
    }
}
