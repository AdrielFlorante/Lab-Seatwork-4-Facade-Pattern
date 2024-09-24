public class HomeInterface {
    private HomeService light;
    private HomeService tv;
    private HomeService ac;

    public HomeInterface(HomeService light, HomeService tv, HomeService ac) {
        this.light = light;
        this.tv = tv;
        this.ac = ac;
    }

    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        ac.turnOn();
    }

    public void turnOffAll() {
        light.turnOff();
        tv.turnOff();
        ac.turnOff();
    }

}
