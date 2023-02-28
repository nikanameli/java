import java.util.ArrayList;
import java.util.Objects;

public class GameFilter implements Command {
    public ArrayList<Laptop> doFilter(ArrayList<Laptop> arrayList, String command, String arg) {
        arrayList.removeIf(laptop -> (laptop.isGamers() && Objects.equals(arg, "0")) || (!laptop.isGamers() && !Objects.equals(arg, "0")));
        return arrayList;
    }
}
