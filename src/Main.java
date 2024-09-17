//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.
//TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
// for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
public class Main {
    public static void main(String[] args) {
        firstTask();

    }
    static void firstTask() {
        //TIP1. Оголосити змінні всіх примітивних типів: без ініціалізації, ініціалізацією та з
//обчисленням при ініціалізації. Роздрукувати їх значення (System.out.println(),
//System.out.printf()). Цілочисленні значення вивести у десятковому та
//шістнадцятковому форматі.
        System.out.println("\nType: boolean");
        boolean boolNoInit;
        boolNoInit = true; //
        System.out.println("boolNoInit = " + boolNoInit);
        boolean boolWithInit = false;
        System.out.printf("boolWithInit = %b \n", boolWithInit);
        boolean boolWithCalc = boolNoInit || boolWithInit; // Операція 'або' між двума змінними типу Boolean
        System.out.println("boolNoInit || boolWithInit = " + boolWithCalc);
        //
        System.out.println("\nType: char");
        char charNoInit;
        charNoInit = '!';
        System.out.println("charNoInit = " + charNoInit + " = " + (int) charNoInit + " in Unicode");
        char charWithInit = '!';
        System.out.printf("charWithInit = %c = %d in Unicode\n", charWithInit, (int) charWithInit);
        char charWithCalc = (char) (charNoInit + charWithInit);
        System.out.println("charNoInit + charWithInit = " + charWithCalc + " = " + (int) charWithCalc + " in Unicode");
        //
        System.out.println("\nType: byte");
        byte byteNoInit;
        byteNoInit = 90;
        System.out.println("byteNoInit = " + byteNoInit + " = " + Integer.toHexString(byteNoInit)  + " in hex");
        byte byteWithInit = 80;
        System.out.printf("byteWithInit = %d = %s in hex\n", byteWithInit, Integer.toHexString(byteWithInit));
        byte byteWithCalc = (byte) (byteNoInit - byteWithInit);
        System.out.println("byteNoInit - byteWithInit = " + byteWithCalc  + " = " + Integer.toHexString(byteWithCalc)  + " in hex");
        //
        System.out.println("\nType: short");
        short shortNoInit;
        shortNoInit = 4080;
        System.out.println("shortNoInit = " + shortNoInit + " = " + Integer.toHexString(shortNoInit)  + " in hex");
        short shortWithInit = 15;
        System.out.printf("shortWithInit = %d = %s in hex\n", shortWithInit, Integer.toHexString(shortWithInit));
        short shortWithCalc = (short) (shortNoInit + shortWithInit +1);
        System.out.println("shortNoInit + shortWithInit + 1 = " + shortWithCalc + " = " + Integer.toHexString(shortWithCalc)  + " in hex");
        //
        System.out.println("\nType: int");
        int intNoInit;
        intNoInit = 43690 ;
        System.out.println("intNoInit = " + intNoInit + " = " + Integer.toHexString(intNoInit)  + " in hex");
        int intWithInit = 21845;
        System.out.printf("intWithInit = %d = %s in hex\n", intWithInit, Integer.toHexString(intWithInit));
        int intWithCalc = intNoInit / intWithInit;
        System.out.println("intNoInit / intWithInit = " + intWithCalc + " = " + Integer.toHexString(intWithCalc)  + " in hex");
        //
        System.out.println("\nType: long");
        long longNoInit;
        longNoInit = 21845;
        System.out.println("longNoInit = " + longNoInit + " = " + Long.toHexString(longNoInit)  + " in hex");
        long longWithInit = 2;
        System.out.printf("longWithInit = %d = %s in hex\n", longWithInit, Long.toHexString(longWithInit));
        long longWithCalc = longNoInit * longWithInit;
        System.out.println("longNoInit * longWithInit = " + longWithCalc + " = " + Long.toHexString(longWithCalc)  + " in hex");
        //
        System.out.println("\nType: float");
        float floatNoInit;
        floatNoInit = 1110.11F;
        System.out.println("floatNoInit = " + floatNoInit);
        float floatWithInit = 100;
        System.out.printf("floatWithInit = %f \n", floatWithInit);
        float floatWithCalc = floatNoInit * floatWithInit;
        System.out.println("floatNoInit * floatWithInit = " + floatWithCalc);
        //
        System.out.println("\nType: double");
        double doubleNoInit;
        doubleNoInit = 10;
        System.out.println("doubleNoInit = " + doubleNoInit);
        double doubleWithInit = 0.5F;
        System.out.printf("doubleWithInit = %f \n", doubleWithInit);
        double doubleWithCalc = doubleNoInit * doubleWithInit;
        System.out.println("doubleNoInit * doubleWithInit = " + doubleWithCalc);

        }

}