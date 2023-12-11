package atguigu_advance.guigu03_super.exer3;

public class cheA_Test {
    public static void main(String[] args) {
        CheckAccount cc =new CheckAccount(111,20000,0.045,5000);
        cc.with(5000);//取钱
        System.out.println("余额"+cc.getBa());
        System.out.println("可透支"+cc.getOve());

        System.out.println("---------------");
        cc.with(18000);
        System.out.println("余额"+cc.getBa());
        System.out.println("可透支"+cc.getOve());

        System.out.println("---------------");
        cc.with(3000);
        System.out.println("余额"+cc.getBa());
        System.out.println("可透支"+cc.getOve());
    }
}
