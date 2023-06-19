public class PhysicalBook extends Book {
    private double weight;

    public PhysicalBook(String title, String author, double price, int quantity, double weight) {
        super(title, author, price, quantity);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateShippingCost() {
        double shippingCost = 4.50;
        double additionalWeight = weight - 500;

        if (additionalWeight > 0) {
            int extraCharge = (int) Math.ceil(additionalWeight / 250);
            shippingCost += extraCharge;
        }

        return shippingCost;
    }

    public double getWeightInPounds() {
        return weight * 0.00220462; // 1 gram = 0.00220462 pounds
    }
}


