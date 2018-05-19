/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/5/19
 * Time: 11:40
 * To change this template use File | Settings | File Templates.
 */
public class TestClass {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,33,33.4f);
        weatherData.setMeasurements(83,22,36.4f);
        weatherData.setMeasurements(84,43,39.4f);

    }
}
