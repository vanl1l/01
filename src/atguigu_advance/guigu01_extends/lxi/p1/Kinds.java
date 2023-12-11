package atguigu_advance.guigu01_extends.lxi.p1;

public class Kinds extends ManKind{

    private int yearsold;
    public Kinds(){}
    public Kinds(int yearsold){
        this.yearsold = yearsold;
    }
    public Kinds(int sex,int salary,int yearsold){
        this.yearsold = yearsold;
        setSex(sex);
        setSalary(salary);
    }
}
