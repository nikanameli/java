import java.util.ArrayList;

public class RamFilter implements Command{
    public ArrayList<Laptop> doFilter(ArrayList<Laptop> arrayList, String command, String arg) {
        arrayList.removeIf(laptop -> (laptop.getRam() < Float.parseFloat(arg)));
        return arrayList;
    }
}