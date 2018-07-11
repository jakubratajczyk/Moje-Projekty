package org.cadenhead.ecommerce;

public class Petle {
    public static void main(String[] args)
    {
        int[][] tab=new int[][]{{1,2,3,4,5},{6,7,8,9,10,11,12}};

        for(int[] x:tab)
            for(int y:x)
                System.out.println(y);
    }
}
