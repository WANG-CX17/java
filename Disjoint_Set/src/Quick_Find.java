public class Quick_Find implements DisjointSet{

    private int[] item;
    public Quick_Find(int x) {
        item = new int[x];
        for (int p =0;p < x; p++) {
            item[p] = p;
        }
    }
    @Override
    public void connect(int a, int b) {
        int sum1 = item[a];
        int sum2 = item[b];
        for (int x = 0; x < item.length; x++) {
            if (sum2 == item[x]) {
                item[x] = sum1;
            }
        }
    }
    @Override
    public boolean isConnected(int a,int b) {
        if (item[a] == item[b]) {
            return true;
        }
        return false;
    }
}
