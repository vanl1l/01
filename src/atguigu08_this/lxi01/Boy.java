package atguigu08_this.lxi01;

public class Boy {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public Boy(){

    }
    public Boy(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void marry(Girl girl){
        System.out.println("我想娶"+ girl.getName());
    }

    public void shout(){
        if (age>=22){
            System.out.println("oh,yesr!!");
        }else {
            System.out.println("fakeyou");
        }
    }
}
