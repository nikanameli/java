import java.util.ArrayList;

public class ModelFilter implements Command{
    public ArrayList<Laptop> doFilter(ArrayList<Laptop> arrayList, String command, String arg) {
        arrayList.removeIf(laptop -> !(laptop.getModel().contains(arg)));
        return arrayList;
    }
}