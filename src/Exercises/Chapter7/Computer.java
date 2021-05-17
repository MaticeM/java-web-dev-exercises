package Exercises.Chapter7;

public abstract class Computer {
    private boolean isRechargeable = true;
    private double screenSize;
    private double memorySize;

    public Computer(double aScreenSize, double aMemorySize) {
        screenSize = aScreenSize;
        memorySize = aMemorySize;
        }

    public boolean getIsRechargeable() {
        return isRechargeable;
    }

    public void setIsRechargeable(boolean aIsRechargable) {
        isRechargeable = aIsRechargable;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double aScreenSize) {
        screenSize = aScreenSize;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double aMemorySize) {
        memorySize = aMemorySize;
    }

    public String notEnoughMemory(double memorySize) {
        if (memorySize < 5) {
            return "There is not enough memory.";
        } else {
            return "Memory is sufficient.";
        }
    }

    public void checkRechargable(boolean isRechargeable) {
        if (!isRechargeable) {
            isRechargeable = false;
        }
    }

    }
