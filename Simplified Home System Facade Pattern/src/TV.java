public class TV implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("TV is now on!");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is now off!");
    }
}
