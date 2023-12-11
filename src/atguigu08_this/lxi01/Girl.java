package atguigu08_this.lxi01;

public class Girl {
    private String name;
    private int age;

    public Girl(){
    }
    public Girl(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void marry(Boy boy){
        System.out.println("你是一个一个一个:"+boy.getName());
        boy.marry(this);
    }

    /*
    比较两个girl对象的大小
     */
    public int compare(Girl girl){
        if (this.age>girl.age){
            return 1;
        } else if(this.age < girl.age) {
            return -1;
        }else {
            return 0;
        }
    }

}
