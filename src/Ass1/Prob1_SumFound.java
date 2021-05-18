package Ass1;

public class Prob1_SumFound {
    public static boolean sumFound(int[] arr, int z) {
        if (arr == null || arr.length < 2)
            return false;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j])
                    return false;
                if (arr[i] + arr[j] == z)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 3};
        int[] b = {3, 3, 4, 7};
        System.out.println(sumFound(a, 5));
        System.out.println(sumFound(b, 6));
    }
}
