package Car;

public class Bus implements Information{
    String name;
    String carBrand;
    int year;
    int seats;

    public Bus(String name, String carBrand, int year, int seats) {
        this.name = name;
        this.carBrand = carBrand;
        this.year = year;
        this.seats = seats;
    }
    public void information() {
        System.out.println("Marka: " + carBrand);
        System.out.println("Model autobusu: " + name);
        System.out.println("Rocznik: " + year);
        System.out.println("Liczba miejsc: " + seats);
    }

    @Override
    public void turnOn() {
        System.out.println("Silnik autobusu został włączony.");

    }

    @Override
    public void turnOff() {
        System.out.println("Silnik autobusu został wyłączony");
    }
}
