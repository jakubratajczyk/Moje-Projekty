package TypySparametryzowane;

public class KlasaGeneryczna<T,W> {

    private T poleGeneryczne;
    private W drugiePoleGeneryczne;


    public KlasaGeneryczna()
    {}

    public KlasaGeneryczna(T zm1, W zm2)
    {
        this.poleGeneryczne=zm1;
        this.drugiePoleGeneryczne=zm2;
    }


    public void nazwaTypuGenerycznego()
    {
        System.out.println("Typ1 : "+ poleGeneryczne.getClass().getName());
    }


    public T getPoleGeneryczne() {
        return poleGeneryczne;
    }


    public void setPoleGeneryczne(T zm1, W zm2) {
        this.poleGeneryczne = zm1;
        this.drugiePoleGeneryczne=zm2;
    }


    public void wyswietl()
    {
        System.out.println(poleGeneryczne.toString() + " " + drugiePoleGeneryczne.toString());
    }
}
