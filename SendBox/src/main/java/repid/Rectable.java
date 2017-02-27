package repid;

/**
 * Created by ISS on 02.02.2017.
 */
public class Rectable {
    public double a;
    public double b;

    public Rectable(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double area(){
        return this.a*this.b;
    }
}
