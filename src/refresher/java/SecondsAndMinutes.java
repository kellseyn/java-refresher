package refresher.java;

public class SecondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDurationString(61, 59));
        System.out.println(getDurationString(3719));
    }

    public static String getDurationString (int minutes, int seconds){
        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)){
            int hours = minutes / 60;
            int remainMinutes = minutes % 60;
            String string = hours + "h " + remainMinutes + "m " + seconds + "s";
            return string;
        } else {
            return "Invalid value";
        }
    }
    public static String getDurationString (int seconds){
        if (seconds >= 0){
            int minutes = (seconds / 60);
            int remainSeconds = seconds % 60;
            return getDurationString(minutes, remainSeconds);
        } else {
            return "Invalid value";
        }
    }



}
