package refresher.java;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Int Min Val = " + myMinIntValue);
        System.out.println("Int Max Val = " + myMaxIntValue);
        System.out.println("Int Busted Val = " + (myMaxIntValue + 1));
        System.out.println("Int Busted Val = " + (myMinIntValue - 1));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short Min Val = " + myMinShortValue);
        System.out.println("short Max Val = " + myMaxShortValue);

        long myLongValue = 100L;

        int myTotal = (myMinIntValue / 2);


        //casting
        byte newByteVal = (byte)(myMinIntValue / 2);
        short newShortVal = (short)(myMinIntValue / 2);

        //challenge
        byte challByte = 120;
        short challShort = 30000;
        int challInt = 2500000;
        long challLong = 50000L + (10L * ( challByte + challShort + challInt));
        System.out.println(challLong);

        int intVal = 5 / 3;
        float floatVal = 5f / 3f;
        double doubleVal = 5d / 3d;
        System.out.println("int val = " + intVal );
        System.out.println("f val = " + floatVal );
        System.out.println("d val = " + doubleVal );

        //double challenge
        double pound = 200;
        double kilogram = 0.45359237;

        System.out.println(pound * kilogram);

        char myChar = 'D';
        char uniCode = '\u0044';
        boolean isTrue = true;
        System.out.println(myChar);
        System.out.println(uniCode);

        String numString = "250";
        String secStringNum = "2.5";

        System.out.println();

    }
}
