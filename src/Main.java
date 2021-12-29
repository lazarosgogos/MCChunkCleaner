import java.io.File;

public class Main {

    Options options;
    Deleter deleter;


    public Main() {
        Option option = new Option();
        boolean debug = false;
        options = new Options(debug);

        deleter = new Deleter(this);
        if (debug) {
            options.setSaveFolderFile(new File("/home/lazaros/.minecraft/saves/1_18world/region"));
            option.setMaxY(256);
            option.setRadius(2);
            option.setMinY(0);
            String[] blockArray = {"minecraft:white_wool"};
            option.setBlockIDs(blockArray);
            options.getOptionsList().add(option);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.deleter.loadWorld();
        System.out.println("\n");

        main.deleter.enqueue();
        System.out.println("\n");

        main.deleter.delete();
        System.out.println("\n");
        main.deleter.unloadWorld();
    }

    public Options getOptions() {
        return options;
    }
}
