package technology;

public class Program {
    public static void main(String[] args) {
        Computer desktop = new Computer("Dell", "XPS", 999.99);
        Laptop laptop = new Laptop("HP", "Envy", 799.99, 15);
        SmartPhone smartphone = new SmartPhone("Apple", "iPhone 13", 1099.99, "iOS");

        desktop.turnOn();
        laptop.sleepMode();
        smartphone.makeCall();
    }
}
