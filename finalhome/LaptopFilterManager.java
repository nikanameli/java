import java.util.*;

public class LaptopFilterManager {

    final HashMap<String, Command> map;

    public LaptopFilterManager() {
        this.map = new HashMap<>();
        map.put("onlyGames", new GameFilter());
        map.put("modelFilter", new ModelFilter());
        map.put("osFilter", new OSFilter());
        map.put("ramFilter", new RamFilter());
    }

    public ArrayList<Laptop> doFilter(ArrayList<Laptop> arrayList, String command, String arg) {
        if (this.map.containsKey(command)) {
            return this.map.get(command).doFilter(arrayList, command, arg);
        }
        System.out.println("Команда " + command + " не найдена!ы");
        return arrayList;
    }
}
