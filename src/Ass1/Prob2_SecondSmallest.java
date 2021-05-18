package Ass1;

public class Prob2_SecondSmallest {
    public static int secondSmallest(int[] arr) {
        if(arr==null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        int temp;
        int len = arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] < arr[j]) {
                    temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[len-2];
    }

    public static void main(String[] args) {
        int[] a={1,4,2,3};
        int[] b= {3, 3, 4, 7};
        int[] c={9};
        System.out.println(secondSmallest(a));
        System.out.println(secondSmallest(b));
        System.out.println(secondSmallest(c));
    }
}
