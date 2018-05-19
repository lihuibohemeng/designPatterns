package implement;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/5/19
 * Time: 11:15
 * To change this template use File | Settings | File Templates.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
