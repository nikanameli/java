import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CommandManager {

    LaptopFilterManager laptopFilterManager;
    Scanner sc;

    public CommandManager() {
        this.laptopFilterManager = new LaptopFilterManager();
        this.sc = new Scanner(System.in);
    }

    public void doCommand(ArrayList<Laptop> arrayList) {
        System.out.println("Введите команду (help - список команд)");
        String line = sc.nextLine();
        if (Objects.equals(line, "help")) {
            System.out.println("""
                    onlyGames n >> только игровые ноутбуки (при n = 0 наоборот)
                    exit >> выйти из магазина
                    ramFilter n >> ноутбуки с Ram >= n
                    modelFilter n >> поиск по модели (n - входная строка)
                    osFilter n >> поиск по OS (n - входная строка)
                    """);
        } else if (Objects.equals(line, "exit")) {
            this.sc.close();
            System.out.println("Заходите еще!");
            return;
        } else {
            try {
                String[] args = line.split(" ");
                if (args.length < 2) {
                    System.out.println("Недостаточное количество аргументов (введите через пробел команду и n)");
                } else {
                    String command = args[0];
                    arrayList = this.laptopFilterManager.doFilter(arrayList, command, args[1]);
                    System.out.println(arrayList);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        doCommand(arrayList);
    }

}
