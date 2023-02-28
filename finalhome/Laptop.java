public class Laptop {

    private final String model;
    private final int year;
    private final String OS;
    private final boolean gamers;
    private final String color;
    private final int hardDiskSize;
    private final int ram;

    public Laptop(String model, int year, String OS, boolean gamers, String color, int hardDiskSize, int ram) {

        this.model = model;
        this.year = year;
        this.OS = OS;
        this.gamers = gamers;
        this.color = color;
        this.hardDiskSize = hardDiskSize;
        this.ram = ram;
    }

    public int getHardDiskSize() {
        return hardDiskSize;
    }

    public int getRam() {
        return ram;
    }

    public String getOS() {
        return OS;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public boolean isGamers() {
        return gamers;
    }

    @Override
    public String toString() {
        return this.model;
    }
}
