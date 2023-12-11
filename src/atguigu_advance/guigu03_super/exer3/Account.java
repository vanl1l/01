package atguigu_advance.guigu03_super.exer3;

public class Account {
    private int id;
    private double ba;
    private double an;  //年利率
    public Account(int id,double ba,double an){
//super()
        this.id = id;
        this.ba = ba;
        this.an = an;
    }
    public void setAn(double an) {
        this.an = an;
    }
//    public void setBa(double ba) {
//        this.ba = ba;
//    }
    public void setId(int id) {
        this.id = id;
    }


    public double getAn() {
        return an;
    }
    public double getBa() {
        return ba;
    }
    public int getId() {
        return id;
    }


    public double getM(){
        return an / 12;
    }

    public void with(double amount){
        if (ba >=amount){
            ba-=amount;
        }else {
            System.out.println("余额不足");
        }
    }//取钱
    public void dep(double amount){
        if (amount>0){
            ba+=amount;
        }
    }//存钱(amount:要存钱的额度)

}
