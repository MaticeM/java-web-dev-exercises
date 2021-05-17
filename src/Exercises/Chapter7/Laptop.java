package Exercises.Chapter7;

public class Laptop extends Computer{
    private String operatingSystem;

    public Laptop(String aOperatingSystem, double aScreenSize, double aMemorySize) {
        super(aScreenSize, aMemorySize);
        this.operatingSystem = aOperatingSystem;
    }

    public String teamWindows(String operatingSystem) {
        if (operatingSystem == "Mac") {
            return "Ew.";
        } else {
            return "You're amazing!";
        }
    }

}
