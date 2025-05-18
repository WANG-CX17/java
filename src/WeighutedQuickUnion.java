import java.util.Arrays;

public class WeighutedQuickUnion implements DisjointSet {
    private int[] item;
    public WeighutedQuickUnion(int x) {
        item = new int[x];
        Arrays.fill(item, -1);
    }

    private int find(int p) {
        int x = p;
        int y;
        while (item[p] >= 0) {
            p = item[p];
        }
        while (item[x] >= 0) {
            y = x;
            x = item[x];
            item[y] = p;
        }
        return p;
    }

    @Override
    public void connect(int a, int b) {
        int tree1 = find(a);
        int tree2 = find(b);
        if (item[tree1] < item[tree2]) {
            item[tree1] += item[tree2];
            item[tree2] = tree1;
        } else {
            item[tree2] += item[tree1];
            item[tree1] = tree2;
        }
    }

    @Override
    public boolean isConnected(int a, int b) {
        return find(a) == find(b);
    }
}
