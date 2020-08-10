package refresher.java;

public class Printer {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;


    public Printer(int tonerLevel, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int addToner(int tonerAmount){
       if (tonerAmount > 0 && tonerAmount <= 100){
           if (this.tonerLevel + tonerAmount > 100){
               return -1;
           } else {
               this.tonerLevel += tonerAmount;
               return this.tonerLevel;
           }
       } else {
           return -1;
       }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplexPrinter){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted+= pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }


}
