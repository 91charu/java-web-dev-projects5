package technology;

public class SmartPhone extends Computer {
    private String operatingSystem;

    public SmartPhone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void makeCall() {
        // Implementation for smartphone-specific method
    }
}
