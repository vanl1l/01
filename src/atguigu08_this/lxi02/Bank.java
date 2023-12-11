package atguigu08_this.lxi02;

//银行类
public class Bank {
    private Customer[] cusotomers;//保存多个客户
    private int numberOfCustomer;//记录存储的客户个数
    public  Bank(){
        cusotomers = new Customer[10];
    }

    public void addCustomer(String f,String l){  //将指定姓名的客户保存在银行列表中
        Customer cust = new Customer(f,l);
        cusotomers[numberOfCustomer++] = cust;
//        cusotomers[numberOfCustomer] = cust;
//        numberOfCustomer++;
    }

    public int getNumberOfCustomer(){//获取客户个数
        return numberOfCustomer;
    }
    public Customer getCustomer(int index){//获取指定索引位置上的客户
        if(index < 0|| index >= numberOfCustomer){
            return null;
        }else {
            return cusotomers[index];
        }
    }

}
