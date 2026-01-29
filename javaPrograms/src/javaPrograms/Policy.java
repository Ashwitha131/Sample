package javaPrograms;


public class Policy {
    private final double premium;
    private final double taxRate;

    public Policy(double premium, double taxRate) {
        this.premium = premium;
        this.taxRate = taxRate;
    }

    public double netPayable(double discount) {
        double base = premium - discount;
        return base + base * taxRate;
    }

    public static void main(String[] args) {
        Policy policy = new Policy(2500.0, 0.18);
        double discount = 125.0;
        double payable = policy.netPayable(discount);
        System.out.println("Net Payable = " + payable); 
    }
}
