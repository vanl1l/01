package atguigu_advance.guigu03_super.exer3;

public class CheckAccount extends Account {
    private double ove;//可透支限额
    public CheckAccount(int id,double ba,double an){
        super(id, ba, an);//父类无空参构造器
    }
    public CheckAccount(int id,double ba,double an,double ove){
        super(id, ba, an);
        this.ove = ove;
    }

    public double getOve() {
        return ove;
    }

    public void setOve(double ove) {
        this.ove = ove;
    }

    //针对于可透支账户（需要重写）with
    public void with(double amount){
        if(getBa()>=amount){
            super.with(amount);
        } else if (getBa()+ove>= amount) {
            ove -= amount-getBa();
            super.with(getBa());
        }else {
            System.out.println("超过可透支限额");
        }
    }
}
