public class HomeApp {

    public static void main(String[] args) {
        HomeService lights = new Light();
        HomeService tv = new TV();
        HomeService ac = new AirConditioning();

        HomeInterface homeFacade = new HomeInterface(lights, tv, ac);

        homeFacade.turnOnAll();
        homeFacade.turnOffAll();
    }

}
