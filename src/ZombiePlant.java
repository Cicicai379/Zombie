public class ZombiePlant {
    private int p;
    private int t;

    public ZombiePlant(int p, int t){
        this.p=p;
        this.t=t;
    }

    public int getPotencyRequired(){
        return p;
    }
    public int treatmentsNeeded(){

        return t;
    }
    public boolean isDangerous(){
        return t>=1;
    }
    public void treat(int x){
        if(x<=p && t!=0){

            t-=1;

        }

    }



}
