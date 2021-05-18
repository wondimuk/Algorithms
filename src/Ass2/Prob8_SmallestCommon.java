package Ass2;
/*Java code to find the smallest common multiple.
* For this problem I have used gcd to find the smallest common multiple using single loop which O(n).
* Mathematically gcd(a,b) x lcd(a,b)=axb
*                  lcd(a,b)=(axb)/(gcd(a,b)).
* Author: Wondimu Kenea
* Purpose : Algorithm Course Lab assignment*/
public class Prob8_SmallestCommon {
    public static int smallestCommon(int x, int y) {
        if(x<0 || y<0) return -1;
        return (x*y)/gcd(x,y);
    }

    public static int gcd(int a, int b){
        int bound = (a>b)?b:a;
        int prevousGCD=-1;
        for(int i=1;i<=bound;i++){
            if(a%i==0 && b%i==0){
                prevousGCD = i;
            }
        }
        return prevousGCD;
    }

    public static void main(String[] args) {
        System.out.println(smallestCommon(4,6));
        System.out.println(smallestCommon(3,5));
        System.out.println(smallestCommon(7,14));
    }
}
