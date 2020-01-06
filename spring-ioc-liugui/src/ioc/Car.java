package ioc;

/**
 * @ClassName: Car
 * @Author: liugui
 * @Date: 2019-12-09 09:14
 **/
public class Car {
    private Framework framework;
    Car(int size){
        this.framework = new Framework(size);
    }

    public void run(){
        System.out.println("点火**********************");
        System.out.println("换1挡*********************");
        System.out.println("放手刹-起步");
        System.out.println("轮胎大小：" );
    }

}
