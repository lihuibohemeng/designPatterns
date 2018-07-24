import implement.Observer;
import implement.Subject;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/5/19
 * Time: 11:21
 * To change this template use File | Settings | File Templates.
 */
//（1）当一个对象的数据更新时需要通知其他对象，但这个对象又不希望和被通知的那些对象形成紧耦合。
//（2）当一个对象的数据更新时，这个对象需要让其他对象也各自更新自己的数据，但这个对象不知道具体有多少对象需要更新数据。
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    @Override
    public void notifyObserver() {
       for(int i = 0;i<observers.size();i++){
      Observer observer = (Observer)observers.get(i);
      observer.update(temperature,humidity,pressure);
      }
    }
    public void measurementsChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
