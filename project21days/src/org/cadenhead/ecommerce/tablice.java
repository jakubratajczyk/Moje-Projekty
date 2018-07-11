package org.cadenhead.ecommerce;

public class tablice {
    public static void main(String[] args) {

        int[][][] tab = new int[][][]{
                {{1,2},{3,4}},
                {{5,6},{7,8}}
        };

        for(int i=0;i<tab.length;i++)
        {
            for(int j=0;j<tab[i].length;j++){
                for(int k=0;k<tab[i][j].length;k++){
                    System.out.print(tab[i][j][k]+" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


