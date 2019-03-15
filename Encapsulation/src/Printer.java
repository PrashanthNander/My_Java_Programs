public class Printer {
    private int tonnerLevel = 100;
    private String nonOfPages;
    public String duplexPrinter;

    public Printer (int tonnerLevel, String nonOfPages, String duplexPrinter) {

        if (this.tonnerLevel >0 && this.tonnerLevel <=100) {
            this.tonnerLevel += tonnerLevel;
        }
        this.nonOfPages = nonOfPages;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(int value) {

    }

    public void printPage() {
        nonOfPages +=nonOfPages;
    }

    public int getTonnerLevel() {
        return this.tonnerLevel;
    }
}
