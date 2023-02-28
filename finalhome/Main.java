public class Main {

    public static void main(String[] args) {
        LaptopManager laptopManager = new LaptopManager();
        CommandManager commandManager = new CommandManager();
        laptopManager.addLaptop("aboba", 2020, null, true, "blue", 256, 16);
        laptopManager.addLaptop("abobi", 2019, "Windouws", false, "blue", 256, 16);
        laptopManager.addLaptop("abobo", 2020, "linux", true, "blue", 512, 32);
        laptopManager.addLaptop("abobu", 2021, "macOS", true, "blue", 128, 64);
        commandManager.doCommand(laptopManager.getArrayList());
    }
}
