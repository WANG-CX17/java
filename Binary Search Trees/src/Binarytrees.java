public class Binarytrees<T> {
    public Binarytrees right;
    public T key;
    public Binarytrees left;

    public Binarytrees(T x) {
        this.key = x;
    }

    public Binarytrees(T x, Binarytrees right, Binarytrees left) {
        this.key = x;
        this.right = right;
        this.left = left;
    }

    public void add(T x) {
    if (this.compare(x,this.key)) {
        this.right = new Binarytrees(x);
    } else {
        this.left = new Binarytrees(x);
    }
    }

    
    }

}
