public class Project {
    public static int modified_fib(int n, int[] values) {
        if (n <= 1) {
            values[n] = n;
            return n;
        } else {
            int val = values[n-1];
            if (val == 0) {
                val = modified_fib(n-1, values) + modified_fib(n-2, values);
                values[n-1] = val;
            }
            return val;
        }
    }

    public static void main(String[] arg) {
        int n = 3;
        int[] values = new int[n];
        int p =Project.modified_fib(n,values);
        System.out.println(p);
    }
}
