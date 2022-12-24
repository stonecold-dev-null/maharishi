package saiPackage;

public class Question145OlympicArrary{
    public static void main(String[] args){
        System.out.println("{3,2,1}              : " + isOlympic(new int[]{3,2,1}));
        System.out.println("{2,2,1,1}            : " + isOlympic(new int[]{2,2,1,1}));
        System.out.println("{1,1000,100,10000,2} : " + isOlympic(new int[]{1,1000,100,10000,2}));
        System.out.println("{1,2,1,3,2}          : " + isOlympic(new int[]{1,2,1,3,2}));
        System.out.println("{1,2,-1,2,2}         : " + isOlympic(new int[]{1,2,-1,2,2}));
        System.out.println("{1,99,99,1000,100,10000,2} : " + isOlympic(new int[] {1,99,99,1000,100,10000,2}));

    }

    static int isOlympic(int[] a){

        for (int x = 0; x < a.length; x++)
        {
            int sum = 0;

            for (int y = 0; y < a.length; y++)
            {
                if (a[y] < a[x])
                sum += a[y];
            }

            if (a[x] < sum)
                return 0;
        }

            return 1;

    }

}
