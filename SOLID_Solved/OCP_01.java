package SOLID;

import java.util.HashMap;
import java.util.Map;

interface DiscountStrategy {
    double calculate(double amount);
}


class RegularDiscount implements DiscountStrategy {
    public double calculate(double amount) {
        return amount * 0.1;
    }
}

class PremiumDiscount implements DiscountStrategy {
    public double calculate(double amount) {
        return amount * 0.2;
    }
}

public class OCP_01 {

    public static class DiscountCalculator {
        private Map<String, DiscountStrategy> strategies = new HashMap<>();

        public void registerStrategy(String customerType, DiscountStrategy strategy) {
            strategies.put(customerType, strategy);
        }

        public double calculateDiscount(String customerType, double amount) {
            DiscountStrategy strategy = strategies.get(customerType);
            if (strategy != null) {
                return strategy.calculate(amount);
            }
            return 0.0;
        }
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

       
        calculator.registerStrategy("Regular", new RegularDiscount());
        calculator.registerStrategy("Premium", new PremiumDiscount());

        double regularDiscount = calculator.calculateDiscount("Regular", 100.0);
        double premiumDiscount = calculator.calculateDiscount("Premium", 100.0);

        System.out.println("Regular Discount: " + regularDiscount);
        System.out.println("Premium Discount: " + premiumDiscount);

        
        calculator.registerStrategy("Gold", amount -> amount * 0.3);
        double goldDiscount = calculator.calculateDiscount("Gold", 100.0);
        System.out.println("Gold Discount: " + goldDiscount);
    }
}
