public class Main {
    public static void main(String[] arg) {
        int x = 7;
        DisjointSet p = new WeighutedQuickUnion(x);
        p.connect(0,1);
        p.connect(1,2);
        p.connect(3,5);
        p.connect(2,5);
        boolean b = p.isConnected(3,0);
        System.out.println(b);
    }
}
