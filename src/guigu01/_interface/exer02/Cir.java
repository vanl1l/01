package guigu01._interface.exer02;

public class Cir {
    private double r;
    public Cir(){}
    public Cir(double r){
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Cir{" +
                "r=" + r +
                '}';
    }
}
