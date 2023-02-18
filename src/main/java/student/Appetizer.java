package student;

public class Appetizer implements Comparable<Appetizer> {
    private String name;
    private int price; // pennies
    //private final int PRICE_FORMATTER = 100;
    public Appetizer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        double price = this.getPrice();
        return String.format("%s ($%.2f)", this.getName(), price / 100);
    }

    public boolean equals(Appetizer other) {
        return (this.getName().equals(other.getName())) && (this.getPrice() == other.getPrice());
    }

    @Override
    public int compareTo(Appetizer other) {
        int smaller = Math.min(this.getName().length(), other.getName().length());
        for (int i = 0; i < smaller; i++) {
            if (this.getName().charAt(i) == other.getName().charAt(i)) {
                continue;
            } else if (this.getName().charAt(i) >= other.getName().charAt(i)) {
                return 1;
            } else {
                return -1;
            }
        }
        if (this.getPrice() < other.getPrice()) {
            return -1;
        } else if (this.getPrice() > other.getPrice()) {
            return 1;
        }
        return 0;
    }
}
