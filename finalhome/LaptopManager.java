import java.util.ArrayList;
import java.util.Map;

public class LaptopManager {

    private final ArrayList<Laptop> arrayList;

    public LaptopManager() {
        this.arrayList = new ArrayList<>();
    }

    public Laptop addLaptop(String model, int year, String OS, boolean gamers, String color, int hardDiskSize, int ram) {
        Laptop laptop = new Laptop(model, year, OS, gamers, color, hardDiskSize, ram);
        this.arrayList.add(laptop);
        return laptop;
    }

    public ArrayList<Laptop> getArrayList() {
        return arrayList;
    }
}
