/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/7/24
 * Time: 21:33
 * To change this template use File | Settings | File Templates.
 */
public class Sington {
    // 静态的Sington
    public static Singleton sington = null;
    private Sington(){
    }

    public  static Singleton getSington(){
       if(sington == null){
             sington = new Singleton();
       }
       return sington;
    }
}
