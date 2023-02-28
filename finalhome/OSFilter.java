import java.util.ArrayList;
import java.util.Objects;

public class OSFilter implements Command{
    public ArrayList<Laptop> doFilter(ArrayList<Laptop> arrayList, String command, String arg) {
        arrayList.removeIf(laptop -> !(laptop.getOS().contains(arg)));
        return arrayList;
    }
}