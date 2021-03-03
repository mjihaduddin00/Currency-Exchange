/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(5, 10));
        System.out.println(convertEurToUsd(10, 5));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double US = eur * exchangeRate;
        return US;
    }
}
