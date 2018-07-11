package org.cadenhead.ecommerce;
import java.util.*;

public class Storefront {
    private LinkedList catalog = new LinkedList();

    public void addItem(String id, String name,String price, String quant,boolean dis)
    {
        Item it=new Item(id,name,price,quant,dis);
        catalog.add(it);
    }

    public Item getItem(int i)
    {
        return (Item) catalog.get(i);
    }

    public int getSize(){
        return catalog.size();
    }

    public void sort()
    {
        Collections.sort(catalog);
    }
}