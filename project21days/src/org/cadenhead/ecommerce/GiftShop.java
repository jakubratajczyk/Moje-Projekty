package org.cadenhead.ecommerce;

public class GiftShop {

    public static void main(String[] args)
    {
        Storefront store = new Storefront();
        store.addItem("C01","KUBEK,","9.99","150",false);
        store.addItem("C02","DUŻY KUBEK","12.99","82",false);
        store.addItem("C03","PODKŁADKA","10.49","800",true);
        store.addItem("D01","KOSZULKA","16.99","90",false);
        store.sort();

        for(int i=0;i<store.getSize();i++)
        {
            Item show=store.getItem(i);
            System.out.println("\nIdentyfikator elementu: "+show.getId()+
            "\nNazwa: "+show.getName()+
            "\nCena detaliczna: "+show.getRetail()+
            "\nCena: "+show.getPrice()+
            "\nSztuk: "+show.getQuantity());
        }
    }


}
