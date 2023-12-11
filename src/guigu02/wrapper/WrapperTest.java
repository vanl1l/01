package guigu02.wrapper;

import org.junit.Test;

public class WrapperTest {
    @Test
    public void test1(){
        int i1 = 10;
        Integer i2 = Integer.valueOf(i1);
        int i3 = i2.intValue();
        //拆箱装箱：直接赋值

    //---------------------
        // 基本数据类型，包装类->string：
            // 1.调用string重载的静态方法valueof()
            // 2.连接：基本数据类型变量+“”
        int a=10;
        String str = String.valueOf(a);                 //alt+回车：自动补全前面

        //string->基本数据类型，包装类：
            //调用包装类的静态方法:parsexxx()
        String str1 = "111";
        int i10 = Integer.parseInt(str1);


    }
}
