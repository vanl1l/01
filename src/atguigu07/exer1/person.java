package atguigu07.exer1;

import javax.swing.text.StyleContext;

public class person {
    private int age;
    //设置age属性
    public void setAge(int a){
        if( a>=0 && a<=130){
            age=a;
        }else{
            System.out.println("你输入的数据非法!!");
    }
    }
    //获取age属性
    public int getAge(){
    return age;
    }
}