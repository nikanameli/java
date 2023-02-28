import java.util.ArrayList;

interface Command {
    ArrayList<Laptop> doFilter(ArrayList<Laptop> arrayList, String command, String arg);
}
