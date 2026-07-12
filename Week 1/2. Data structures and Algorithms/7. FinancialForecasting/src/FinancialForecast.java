public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double currentValue, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return currentValue;
        }

        // Recursive case
        return futureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double currentValue = 10000;   // Initial investment
        double growthRate = 0.10;      // 10% annual growth
        int years = 5;

        double future = futureValue(currentValue, growthRate, years);

        System.out.println("Current Value : ₹" + currentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : ₹%.2f%n", future);
    }
}