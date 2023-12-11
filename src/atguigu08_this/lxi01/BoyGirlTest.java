package atguigu08_this.lxi01;

public class BoyGirlTest {
    public static void main(String[] args) {

        Boy boy1 = new Boy("van",24);
        Girl girl1 = new Girl("魔男",18);

        girl1.marry(boy1);
        boy1.shout();

        Girl gir2 = new Girl("香蕉君",30);
        int compare = girl1.compare(gir2);
        if (compare>0){
            System.out.println(girl1.getName()+"大");
        } else if (compare<0) {
            System.out.println(gir2.getName() + "大");
        }else {
            System.out.println("一样大");
        }
    }
}
