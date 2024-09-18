import java.text.StringCharacterIterator;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.
//TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
// for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
public class Main {
    public static void main(String[] args) {
        /*firstTask();
        secondTask();
        thirdTask();
        fourthTask();*/
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
    static void secondTask(){
        //TIP2. Виконати приведення цілих типів з допустимим розширенням діапазону.
        //Виконати приведення double до float, float до int з некоректним перетворенням (переповненням).
        byte byteNum = 0x7F; // 0111 1111
        System.out.println("byteNum = " + byteNum);
        System.out.println("byteNum in byte : " + byteNum + "; byteNum in short : " + (short)byteNum  + "; byteNum in int : " + (int)byteNum  + "; byteNum in long : " + (long)byteNum);
        short shortNum = 0x7FFF; // 0111 1111 1111 1111
        System.out.println("shortNum = " + shortNum);
        System.out.println("shortNum in byte : " + (byte)shortNum + "; shortNum in short : " + shortNum  + "; shortNum in int : " + (int)shortNum  + "; shortNum in long : " + (long)shortNum);
        // Коли ми приводимо short(16 бітів)  до byte(8 бітів) то з 32767 = 0111 1111 1111 1111 після приведення залишаються молодші 8 бітів 1111 1111 = -1, бо найстарша одиничка є доповняльним кодом
        int intNum = 0x7FFFFFFF;
        System.out.println("intNum = " + intNum);
        System.out.println("intNum in byte : " + (byte)intNum + "; intNum in short : " + (short)intNum  + "; intNum in int : " + intNum  + "; intNum in long : " + (long)intNum);
        // Аналогічно, в int 0111 1111 1111 1111 1111 1111 1111 1111 в short залишається 1111 1111 1111 1111 = -1 та в byte 1111 1111 = -1
        long longNum = 0x7FFFFFFFFFFFFFFFL;
        System.out.println("longNum = " + longNum);
        System.out.println("longNum in byte : " + (byte)longNum + "; longNum in short : " + (short)longNum  + "; longNum in int : " + (int)longNum  + "; longNum in long : " + longNum);
        // Так само як з вище приведеними прикладами(int, short)
        float floatNum = 3.4E38F;
        System.out.println("floatNum = " + floatNum);
        System.out.println("floatNum in int : " + (int) floatNum + "; floatNum in float : " + floatNum + "; floatNum in double : " + (double)floatNum);
        // При приведенні floatNum = 3.4E38F до int, java округлює 3.4E38F до 2147483647, оскільки це число є максимальним для int.
        // При приведенні floatNum = 3.4E38F до double, java записує 3.4E38F як 3.3999999521443642E38 це зв'язано з тим що система перетворює число у двійкове представлення мантиси,
                                        // порядку та знаку у пам'яті, у double кількість бітів у мантисі більша ніж у float
                                        // тому double представляє більш точну мантису, яка при переводі з десяткової системи може бути нескінченна
        double doubleNum = 1.7E308D;
        System.out.println("doubleNum = " + doubleNum);
        System.out.println("doubleNum in int : " + (int) doubleNum + "; doubleNum in float : " + (float) doubleNum + "; doubleNum in double : " + doubleNum);

    }
    //TIP3. Оголосити дві змінні без ініціалізації: як поле класу та як локальну змінну у
    //методі. Вивести їх на друк та пояснити відмінність.
    static int fieldClass;
    static void thirdTask() {
        int localVariable;
//        System.out.println("Local Variable: " + localVariable); // Використання локальної змінної без ініціалізації викликає помилку компіляції
        System.out.println("Field Class: " + fieldClass); // Поле класу отримує значення за замовчення, яке можна змінити, цим значенням є нуль(0) для int


    }
    static void fourthTask(){
//TIP4. Оголосити масиви цілих значень та рядків. Вивести їх на друк мінімум двома
//        різними способами.
        int N = 26; //розмір масивів
        System.out.println("\nint array:");
        int[] a = new int[ N ];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        System.out.printf("a = [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i == a.length-1){
                System.out.printf("]\n");
                break;
            }
            System.out.printf(", ");
        }
        System.out.println("а = " + Arrays.toString(a));
        System.out.printf("a = [");
        for(int i: a){
            System.out.print(i);
            if (Arrays.binarySearch(a,i) == a.length-1){
                System.out.printf("]\n");
                break;
            }
            System.out.printf(", ");
        }
//
        System.out.println("\nchar array:");
        char[] b = new char[ N ];
        for (int i = 0; i < b.length; i++) {
            b[i] = (char) ( 65 + i);
        }
        System.out.printf("b = [");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i == b.length-1){
                System.out.printf("]\n");
                break;
            }
            System.out.printf(", ");
        }
        System.out.println("b = " + Arrays.toString(b));
        System.out.printf("b = [");
        for(char i: b){
            System.out.print(i);
            if (i == b[b.length-1]){
                System.out.printf("]\n");
                break;
            }
            System.out.printf(", ");
        }
        //
        System.out.println("\nString array:");
        String[] c = new String[ N ];
        String[] stringArray= "I have many pencils Red and green and blue I can draw a picture And give it to you I can draw my mother I can draw my father I can draw my sister  my little brother".split(" ");
        System.arraycopy(stringArray, 0, c, 0, c.length);
        System.out.printf("c = [");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i == c.length-1){
                System.out.printf("]\n");
                break;
            }
            System.out.printf(", ");
        }
        System.out.println("c = " + Arrays.toString(c));
        System.out.printf("c = [" + String.join(", ", c) + "]\n");
        System.out.printf("c = [");
        for(String i: c){
            System.out.print(i);
            System.out.printf(", ");
        }
    }
}