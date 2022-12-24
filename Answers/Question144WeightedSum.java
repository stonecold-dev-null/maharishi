package saiPackage;

public class Question144WeightedSum{
    public static void main(String[] args){
        System.out.println("{1,2,3,4,5} : " + computeWeightedSum(new int[] {1,2,3,4,5}));
        System.out.println("{1,3,5}     : " + computeWeightedSum(new int[] {1,3,5}));
        System.out.println("{2,4,6}     : " + computeWeightedSum(new int[] {2,4,6}));
        System.out.println("{1}         : " + computeWeightedSum(new int[] {1}));
        System.out.println("{2}         : " + computeWeightedSum(new int[] {2}));
        System.out.println("{0,0,0,0}   : " + computeWeightedSum(new int[] {0,0,0,0}));

    }

    static int computeWeightedSum(int[] a){
        int sumOfEven =0;
        int sumOfOdd  =0;
        int ans       =0;

        for(int i=0; i<a.length; i++){
            if(a[i]%2 ==0) 
                sumOfEven +=a[i];
            else
                sumOfOdd +=a[i];
        }

        ans = (2*sumOfEven + 3*sumOfOdd);

        return ans;
    }
}

