package org.cadenhead.ecommerce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odczyt {
    public static void main(String[] args)
    {
        int[] tab={1,2,3,4,5};
        BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
        int index=-1;

        System.out.print("Podaj ineks: ");
        boolean czyPoprawne = false;
        while(!czyPoprawne)
        {
            try {
                index=Integer.parseInt(odczyt.readLine());
            }catch(NumberFormatException e)
            {
                System.out.println("Niewłaściwa wartość");
            }catch(IOException e)
            {
                System.out.println("Błąd oczytu danych");
            }
            czyPoprawne=index==-1?false:true;
        }
        try{
            System.out.println(tab[index]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Niepoprawna wartość. Tablica ma "+tab.length+" elementów");
        }
    }
}
