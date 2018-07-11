package Car;

public class CarDealer {
    public static void main(String[] args)
    {
        Information[] vehicles = new Information[]{
                new Car("Focus Mk2","Ford",2006),
                new Car("Cordoba Vario","Seat",1999),
                new Bus("Sun 1260","Solaris",2016,40),
                new Bus("Temsa MD 9LE","Kasp",2015,38)
        };
        vehicles[0].turnOn();
        vehicles[2].turnOn();
        vehicles[3].turnOn();
        for(Information i:vehicles)
        {
            i.information();
            System.out.println();
        }

    }
}
