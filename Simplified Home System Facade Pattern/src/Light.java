public class Light implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Lights are now on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights are now off!");
    }
}
