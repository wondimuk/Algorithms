package Ass2;
/*Java code that generate fibonacci number of a given number.
 * For this problem I have used recursion function which is really inefficient since a
 * lot of stack call made to compute the next serious from two previous serious numbers.
 * This algorithm asymptotic analysis will done in few days a head to optimize the inefficiency of this algorithm
 * Author: Wondimu Kenea
 * Purpose : Algorithm Course Lab assignment*/
public class Prob7_Fibonacci {
    public static int generate(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return generate(n-1) + generate(n-2);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 20; ++i) {
            generate(i);
            System.out.println(generate(i));
        }
    }
}
