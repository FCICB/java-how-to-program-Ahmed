public class CurrentConditionsDisplay implements Observer , DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;
    public CurrentConditionsDisplay(Subject weatherData){
        weatherData.register(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
    public void display() {
        System.out.println("current condition "+temperature+" degree and "+humidity +" %humidity");
    }
}


