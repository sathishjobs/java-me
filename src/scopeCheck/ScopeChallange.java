package scopeCheck;

public class ScopeChallange {
    private int x;
    public ScopeChallange(int x){
        this.x = x;
    }
    public void x(){
        for(int x = 1;x<13;x++){
            System.out.println(x+" times "+ ScopeChallange.this.x +" equals "+ x * this.x);
        }
    }
}
