package Car;

public class Car implements Information{
    String name;
    String carBrand;
    int year;

    public Car(String name, String carBrand, int year) {
        this.name = name;
        this.carBrand = carBrand;
        this.year = year;
    }


    @Override
    public void information() {
        System.out.println("Marka: " + carBrand);
        System.out.println("Model: " + name);
        System.out.println("Rocznik: " + year);
    }

    @Override
    public void turnOn() {
        System.out.println("Silnik samochodu został włączony.");

    }

    @Override
    public void turnOff() {
        System.out.println("Silnik samochodu został wyłączony");
    }
}
