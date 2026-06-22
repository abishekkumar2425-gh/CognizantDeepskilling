import java.util.Scanner;
public class FinancialForecastMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Present Value: ");
        double presentValue = sc.nextDouble();

        System.out.print("Enter Growth Rate (in decimal): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();
        FinancialForecast forecast = new FinancialForecast();

        double futureValue = forecast.calculateFutureValue(
                presentValue,
                growthRate,
                years
        );

        System.out.println("Present Value: " + presentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.println("Future Value: " + futureValue);
    }
}