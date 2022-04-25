package task3;


public class PrintSpooler {
    private static final PrintSpooler INSTANCE = new PrintSpooler();

    private PrintSpooler() {}

    public static PrintSpooler getInstance() {
        return INSTANCE;
    }


}

