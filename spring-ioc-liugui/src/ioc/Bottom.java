package ioc;

/**
 * @ClassName: Bottom
 * @Author: liugui
 * @Date: 2019-12-09 09:13
 **/
public class Bottom {
    private Tire tire;
    Bottom(int size){
        this.tire = new Tire(size);
    }
}
