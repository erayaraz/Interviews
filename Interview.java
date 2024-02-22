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
        value %= 50;

        int twentyFiveCount = value / 25;
        value %= 25;

        int tenCount = value / 10;
        value %= 10;

        int fiveCount = value / 5;
        value %= 5;

        int oneCount = value;

        System.out.println("50 Count : " + fiftyCount);
        System.out.println("25 Count : " + twentyFiveCount);
        System.out.println("10 Count : " + tenCount);
        System.out.println("5 Count : " + fiveCount);
        System.out.println("1 Count : " + oneCount);

    }


    public static void main(String[] args) throws Exception {
        countCoins(126);
    }
}
