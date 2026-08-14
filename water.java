public class water {

    public static int numWaterBottles(int numBottles, int numExchange) {

        int ans = numBottles;

        while (numBottles >= numExchange) {

            int newBottles = numBottles / numExchange;
            int remainBottles = numBottles % numExchange;

            ans = ans + newBottles;

            numBottles = newBottles + remainBottles;
        }

        return ans;
    }

    public static void main(String[] args) {

        int numBottles = 9;
        int numExchange = 3;

        int result = numWaterBottles(numBottles, numExchange);

        System.out.println("Total bottles drunk: " + result);
    }
}