package ioc;

/**
 * @ClassName: Framework
 * @Author: liugui
 * @Date: 2019-12-09 09:14
 **/
public class Framework {
    private Bottom bottom;
    Framework(int size){
        this.bottom = new Bottom(size);
    }
}
