
public class Interview {

    /**
     * Coins: 50, 25, 10, 5, 1
     * Print how many coins value param can have starting from MAX nominal
     * Example1: 126 - 2x:50 + 1x:25 + 1x:1
     * Example2: 507 - 10x:50 + 1x:5 + 2x:1
     * Example3: 999 - 19x:50 + 1x:25 + 2x:10 + 4x:1
     **/

    public static void countCoins(int value) {

        int fiftyCount = value / 50;
        value = value - 50 * fiftyCount;

        int twenyFiveCount = value / 25;
        value = value - 25 * twenyFiveCount;

        int tenCount = value / 10;
        value = value - 10 * tenCount;

        int fiveCount = value / 5;
        value = value - 5 * fiveCount;

        int oneCount = value / 1;
        value = value - 1 * oneCount;

        System.out.println("50 Count : " + fiftyCount);
        System.out.println("25 Count : " + twenyFiveCount);
        System.out.println("10 Count : " + tenCount);
        System.out.println("5 Count : " + fiveCount);
        System.out.println("1 Count : " + oneCount);

    }


    public static void main(String[] args) throws Exception {
        countCoins(999);
    }
}
