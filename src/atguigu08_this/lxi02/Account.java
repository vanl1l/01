package atguigu08_this.lxi02;

public class Account {
    private double balance;
    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    //存钱
    public void deposit(double amt){
        if (amt>0){
            balance += amt;
            System.out.println("成功存入："+amt);
        }
    }

    //取钱
    public void withdraw(double amt){
        if(balance>= amt &&amt>0){
            balance -= amt;
            System.out.println("成功取出:"+amt);
        }else {
            System.out.println("取款数额有误或余额不知");
        }
    }
}




