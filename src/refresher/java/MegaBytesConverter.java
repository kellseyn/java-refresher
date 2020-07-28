package refresher.java;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabytes = Math.round(kiloBytes / 1024);
        int remainKilobytes = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainKilobytes + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}
