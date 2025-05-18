import java.util.Arrays;

public class Quick_Union implements DisjointSet{
    private int[] item;
    public Quick_Union (int x) {
        item = new int[x];
        Arrays.fill(item,-1);
    }

    /** find a root of tree and tree has only one root,if tow tree's root is identical,
     * they are same tree.
     */

    private int find(int p) {
        while (item[p] >= 0) {
            p = item[p];
        }
        return p;
    }

    @Override
    public void connect(int a, int b) {
        int root1 = find(a);
        int root2 = find(b);
        item[root1] = root2;
    }

    @Override
    public boolean isConnected(int a, int b) {
        return find(a) == find(b);
    }
}
