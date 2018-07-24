package impl;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/7/24
 * Time: 21:17
 * To change this template use File | Settings | File Templates.
 */
public class Factory {

    public static Product create(String s){
        if("benchi".equals("s")){
            return new BenchiProduct();
        }
        if("baoma".equals("s")){
            return new baomaProduct();
        }
        if("Audi".equals("s")){
            return new AudiProduct();
        }
        return null;
    }
}
