package atguigu08_this.p2;

public class user {

}
class user1{
    String name;
    int age;
    public user1(){
        //模拟对象创建时需要初始化50行代码
    }
    public user1(String name){
        this();
        this.name = name;
    }
    public user1(String name,int age){
        this(name);//必须声明首行
        this.age = age;
    }
}
