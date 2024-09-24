public class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is on!");
    }
    @Override
    public void turnOff() {
        System.out.println("Air Conditioner is off!");
    }
}
