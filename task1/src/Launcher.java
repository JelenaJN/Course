public class Launcher {

    public static void main(String[] args) {
        Car car = new Car();

        car. setModel("Tesla Model M");
        car. setYear(2021);
        car.setNew(true);

        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.isNew());

    }
}
