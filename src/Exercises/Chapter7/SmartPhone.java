package Exercises.Chapter7;

public class SmartPhone extends Computer{
    private String brand;

    public SmartPhone(String aBrand, double aScreenSize, double aMemorySize) {
        super(aScreenSize, aMemorySize);
        this.brand = aBrand;
    }

    public String brand() {
        if (brand == "iPhone") {
            return "Awesome!";
        } else {
            return "Why don't you have an iPhone?";
        }
    }
}
