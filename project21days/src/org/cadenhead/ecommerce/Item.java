package org.cadenhead.ecommerce;


public class Item implements Comparable {
    private String id;     // identyfikator produktu
    private String name;   // nazwa produktu
    private double retail; // cena detaliczna
    private int quantity;  // ilość w magazynie
    private double price;  // cena sprzedaży
    private boolean discount; // zniżka

    /**
     * Konstructor klasy Item.
     * @param idIn: Identyfikator produktu.
     * @param nameIn Nazwa produktu.
     * @param retailIn Cena detaliczna.
     * @param qIn Ilosć w magazynie.
     * @param discountIn Zniżka True/False.
     */

    Item(String idIn, String nameIn, String retailIn, String qIn,boolean discountIn)
    {
        id=idIn;
        name=nameIn;
        retail=Double.parseDouble(retailIn);
        quantity=Integer.parseInt(qIn);
        if(discountIn)
        {
            if(quantity>400)
                price=retail *.5D;
            else if(quantity>200)
                price=retail *.6D;
            else
                price = retail * .7D;
            price=Math.floor(price*100+.5)/100;
        }else {
            price = Double.parseDouble(retailIn);
        }
    }


    public int compareTo(Object obj){
        Item temp=(Item)obj;
        if(this.price<temp.price) {
            return 1;
        }else if(this.price>temp.price){
            return -1;
        }
        return 0;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getRetail()
    {
        return retail;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getPrice()
    {
        return price;
    }
}
