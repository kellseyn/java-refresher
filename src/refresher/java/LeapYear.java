package refresher.java;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if (year % 4 == 0){
                if(year % 100 == 0){
                    if (year % 400 == 0){
                        if (year % 400 == 0 && year % 100 == 0){
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else{
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        } else {
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
//                    break;
                case 2:
                    if (isLeapYear(year)){
                        return 29;
                    } else{
                        return 28;
                    }
//                    break;
                case 4: case 6: case 9: case 11:
                    return 30;
//                    break;

                default:
                    return -1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(1924));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2015));
    }
}
