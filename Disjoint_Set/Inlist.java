public class Inlist {
    public int first;
    public Inlist last;
    public Inlist(int first, Inlist last) {
        this.first = first;
        this.last = last;
    }
    public int size(){
        if(this.last == null){
            return 1;
        }
        return this.last.size() + 1;
    }
    public int iterativeSize(){
        int sum=0;
        while(this.last != null){
            sum += 1;
            this.last = last.last;
        }
        return sum;
    }
    public int get(int x){
        int sum;
        if(x+1>this.size()||x<0){
            return 0;
        }
        do{
            sum=this.first;
            this.first=this.last.first;
            x--;
        }while (x>=0);
        return sum;
    }
}
