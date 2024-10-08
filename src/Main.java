
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.
//TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
// for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter a task number (1-10) or 0 to exit:");
            switch (scanner.nextInt()) {
                case 0:
                    System.out.println("Exiting the program...");
                    return;
                case 1:
                    firstTask();
                    System.out.println("\nTask completed!...\n\n");
                    break;
                case 2:
                    secondTask();
                    System.out.println("\nTask completed!...\n\n");
                    break;
                case 3:
                    thirdTask();
                    System.out.println("\nTask completed!...\n\n");
                    break;
                case 4:
                    fourthTask();
                    System.out.println("\nTask completed!...\n\n");
                    break;
                case 5:
                    fifthTask();
                    System.out.println("\nTask completed!...\n\n");
                    break;
                case 6:
                    sixthTask();
                    System.out.println("\nTask completed!...\n\n");
                    break;
                case 7:
                    seventhTask();
                    System.out.println("\nTask completed!...\n\n");
                    break;
                case 8:
                    eighthTask();
                    System.out.println("\nTask completed!...\n\n");
                    break;
                case 9:
                    ninthTask();
                    System.out.println("\nTask completed!...\n\n");
                    break;
                case 10:
                    tenthTask();
                    System.out.println("\nTask completed!...\n\n");
                    break;
                default:
                    System.out.println("Invalid task number.");
            }
        }
    }



    static void firstTask() {
        //TIP1. Оголосити змінні всіх примітивних типів: без ініціалізації, ініціалізацією та з
//обчисленням при ініціалізації. Роздрукувати їх значення (System.out.println(),
//System.out.printf()). Цілочисленні значення вивести у десятковому та
//шістнадцятковому форматі.
        System.out.println("\n\nFirst Task");
        System.out.println("\nType: boolean");
        boolean boolNoInit;
        boolNoInit = true; //
        System.out.println("boolNoInit = " + boolNoInit);
        boolean boolWithInit = false;
        System.out.printf("boolWithInit = %b \n", boolWithInit);
        boolean boolWithCalc = boolNoInit || boolWithInit; // Операція 'або' між двома змінними типу Boolean
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
        System.out.println("\n\nSecond Task");
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
        System.out.println("\n\nThird Task");
        int localVariable;
        System.out.println("Використання локальної змінної без ініціалізації викликає помилку компіляції");
//        System.out.println("Local Variable: " + localVariable);
        System.out.println("Поле класу отримує значення за замовчення, яке можна змінити, цим значенням є нуль(0) для int");
        System.out.println("Field Class: " + fieldClass);


    }
    static void fourthTask(){
//TIP4. Оголосити масиви цілих значень та рядків. Вивести їх на друк мінімум двома
//        різними способами.
        System.out.println("\n\nFourth Task");
        int N = 26; //розмір масивів
        System.out.println("\nint array:");
        int[] a = new int[ N ];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        System.out.print("a = [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i == a.length-1){
                System.out.print("]\n");
                break;
            }
            System.out.print(", ");
        }
        System.out.println("а = " + Arrays.toString(a));
        System.out.print("a = [");
        for(int i: a){
            System.out.print(i);
            if (Arrays.binarySearch(a,i) == a.length-1){
                System.out.print("]\n");
                break;
            }
            System.out.print(", ");
        }
        //
        System.out.println("\nchar array:");
        char[] b = new char[ N ];
        for (int i = 0; i < b.length; i++) {
            b[i] = (char) ( 65 + i);
        }
        System.out.print("b = [");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i == b.length-1){
                System.out.print("]\n");
                break;
            }
            System.out.print(", ");
        }
        System.out.println("b = " + Arrays.toString(b));
        System.out.print("b = [");
        for(char i: b){
            System.out.print(i);
            if (i == b[b.length-1]){
                System.out.print("]\n");
                break;
            }
            System.out.print(", ");
        }
        //
        System.out.println("\nString array:");
        String[] c = new String[ N ];
        String[] stringArray= "I have many pencils Red and green and blue I can draw a picture And give it to you I can draw my mother I can draw my father I can draw my sister  my little brother".split(" ");
        System.arraycopy(stringArray, 0, c, 0, c.length);
        System.out.print("c = [");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i == c.length-1){
                System.out.print("]\n");
                break;
            }
            System.out.print(", ");
        }
        System.out.println("c = " + Arrays.toString(c));
        System.out.printf("c = [" + String.join(", ", c) + "]\n");
        System.out.print("c = [");
        for(String i: c){
            System.out.print(i);
            System.out.print(", ");
        }
    }
    //TIP5. Створити власний перелік (enum). Ввести з клавіатури ціле число ( Scanner in =
//new Scanner( System.in ); int i = in.nextInt(); ), зіставити введене ціле зі значенням
//перерахування (використовувати switch), значення перерахування роздрукувати на
//екрані.
    public enum Day {
         MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public enum Month {
        JANUARY, FEBRUARY, MARCH,
        APRIL, MAY, JUNE, JULY, AUGUST,
        SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }
    static void fifthTask() {
        System.out.println("\n\nFifth Task");
        int i=1;
        for(Day day: Day.values()){
            System.out.println(i + ". " + day);
            i++;
        }
        Day dayWeek = null;
        boolean flag = true;
        System.out.println("Select a day of the week:");
        while(flag){
            switch (in.nextInt()) {
                case 1:
                    dayWeek = Day.MONDAY;
                    flag = false;
                    break;
                case 2:
                    dayWeek = Day.TUESDAY;
                    flag = false;
                    break;
                case 3:
                    dayWeek = Day.WEDNESDAY;
                    flag = false;
                    break;
                case 4:
                    dayWeek = Day.THURSDAY;
                    flag = false;
                    break;
                case 5:
                    dayWeek = Day.FRIDAY;
                    flag = false;
                    break;
                case 6:
                    dayWeek = Day.SATURDAY;
                    flag = false;
                    break;
                case 7:
                    dayWeek = Day.SUNDAY;
                    flag = false;
                    break;
                default:
                    System.out.println("Try again!:");
            }
        }
        System.out.println("\nOk\n");
        i=1;
        for(Month month: Month.values()){
            System.out.println(i + ". " + month);
            i++;
        }
        Month monthYear = null;
        System.out.println("Select a month of the year:");
        while(!flag){
            switch (in.nextInt()) {
                case 1:
                    monthYear = Month.JANUARY;
                    flag = true;
                    break;
                case 2:
                    monthYear = Month.FEBRUARY;
                    flag = true;
                    break;
                case 3:
                    monthYear = Month.MARCH;
                    flag = true;
                    break;
                case 4:
                    monthYear = Month.APRIL;
                    flag = true;
                    break;
                case 5:
                    monthYear = Month.MAY;
                    flag = true;
                    break;
                case 6:
                    monthYear = Month.JUNE;
                    flag = true;
                    break;
                case 7:
                    monthYear = Month.JULY;
                    flag = true;
                    break;
                case 8:
                    monthYear = Month.AUGUST;
                    flag = true;
                    break;
                case 9:
                    monthYear = Month.SEPTEMBER;
                    flag = true;
                    break;
                case 10:
                    monthYear = Month.OCTOBER;
                    flag = true;
                    break;
                case 11:
                    monthYear = Month.NOVEMBER;
                    flag = true;
                    break;
                case 12:
                    monthYear = Month.DECEMBER;
                    flag = true;
                    break;
                default:
                    System.out.println("Try again!:");
            }
        }
        System.out.println("\nOk\n");
        System.out.println("Your choice: \n\tMonth = " + monthYear + "\n\tDay = " + dayWeek);
    }
    //TIP6. Оголосити константи (на власний вибір). Зробити консольний мінікалькулятор
//(переведення дюймів у сантиметри, збільшення швидкості у вакуумі залежно від
//часу вільного падіння тощо)
    public static final double INCH_TO_CM = 2.54;
    public static final double PI = 3.14;
    static void sixthTask() {
        System.out.println("\n\nSixth Task");
        System.out.println("\n\nInches to centimeters calculator");
        System.out.println("\tInput centimetre to transfiguration in inch:");
        double cm = in.nextDouble();
        System.out.printf("\tCentimetre = %f in inch = %f\n", cm, cm*INCH_TO_CM);
        System.out.println("\nCalculator of circle characteristics");
        System.out.println("\tInput radius of circle:");
        double radius = in.nextDouble();
        System.out.printf("\tRadius = %f\n\tDiameter = %f\n\tCircle length = %f\n\tThe area of the staked circle = %f",radius, 2*radius, 2*radius*PI, PI*radius*radius);
    }
    static void seventhTask() {
        //TIP7. Оголосити цілі, ініціалізувати їх шістнадцятковими значеннями, роздрукувати,
        //виконати знакові та беззнакові зрушення, результат також роздрукувати.
        //Пояснити різницю.
        System.out.println("\n\nSeventh Task");
        int firstNumber = 0x4;
        int secondNumber = -0x4;
        // Знакове зрушення
        System.out.println("\nOriginal: number1 = " + firstNumber + " :: number1 >> 1 = " + (firstNumber >> 1 ));
        System.out.println("In Binary: number1  = " + Integer.toBinaryString(firstNumber) + " :: number1 >> 1 = " + Integer.toBinaryString(firstNumber  >> 1 ));
        System.out.println("In Hex: number1  = " + Integer.toHexString(firstNumber) + " :: number1 >> 1 = " + Integer.toHexString(firstNumber  >> 1 ));
        // Безнакове зрушення
        System.out.println("Original: number1 = " + firstNumber + " :: number1 >>> 1 = " + (firstNumber>>> 1));
        System.out.println("In Binary: number1  = " + Integer.toBinaryString(firstNumber) + " :: number1 >>> 1 = " + Integer.toBinaryString(firstNumber >>> 1));
        System.out.println("In Hex: number1  = " + Integer.toHexString(firstNumber) + " :: number1 >>> 1 = " + Integer.toHexString(firstNumber >>> 1));
        // Знакове зрушення
        System.out.println("\nOriginal: number2 = " + secondNumber + " :: number2 >> 1 = " + (secondNumber>>1));
        System.out.println("In Binary: number2  = " + Integer.toBinaryString(secondNumber) + " :: number2 >> 1 = " + Integer.toBinaryString(secondNumber>>1));
        System.out.println("In Hex: number2  = " + Integer.toHexString(secondNumber) + " :: number2 >> 1 = " + Integer.toHexString(secondNumber>>1));
        // Безнакове зрушення
        System.out.println("Original: number2 = " + secondNumber + " :: number2 >>> 1 = " + (secondNumber>>> 1));
        System.out.println("In Binary: number2  = " + Integer.toBinaryString(secondNumber) + " :: number2 >>> 1 = " + Integer.toBinaryString(secondNumber >>> 1));
        System.out.println("In Hex: number2  = " + Integer.toHexString(secondNumber) + " :: number2 >>> 1 = " + Integer.toHexString(secondNumber >>> 1));

    }
    //TIP8. Ввести ціле значення з клавіатури та перевірити допустимість у межах
    //дозволеного діапазону (наприклад, кількості поверхів у будинку, оголошених
    //константою). Надрукувати, чи правильно введене значення.
    public static final int MIN_FLOOR = 1;
    public static final int MAX_FLOOR = 50;
    static void eighthTask() {
        System.out.println("\n\nEighth Task\n");
        System.out.printf("Enter the number of floors (%d - %d): ", MIN_FLOOR, MAX_FLOOR);
        int floor = in.nextInt();
        if(floor < MIN_FLOOR || floor > MAX_FLOOR) {
            System.out.printf("\nInvalid floor: %d!", floor);
        }
        else{
            System.out.println("The floor is " + floor + ". It`s correct");
        }
    }
    static void ninthTask() {
//TIP9. Надрукувати множину невід&#39;ємних непарних чисел максимальної потужності,
//де їхній добуток менший за 10 000 (while).
        System.out.println("\n\nNinth Task");
        int product = 1;
        int number = 1;
        ArrayList<Integer> list = new ArrayList<>();
        do{
            if (number % 2 != 0){
                product *= number;
                list.add(number);

            };
            number++;
        }while(product * number <= 10000);
        System.out.println("The set of non-negative odd numbers: " + list + " their product: " + product + "< 10 000");
    }
    static void tenthTask() {
//TIP10. Реалізувати решето Ератосфена: знайти всі прості числа від 2 до n (яке ввести з
//клавіатури). Для цього формується ряд чисел від 1 до n. 1 пропускається. 2 теж
//пропускається, але викреслюється кожне друге число (кожне парне). Наступне
//число (3) пропускається, але потім викреслюється кожне третє і т.п.
//Після успішного виконання – оптимізувати алгоритм з погляду мінімізації
//обчислювальної складності (використовувати факт із теорії чисел).
        System.out.println("\n\nTenthTask - Eratosphen");
        System.out.print("Enter the number: ");
        int n = in.nextInt();

        System.out.println("Non Optimization:");
        int [] allNumbers = new int[n];
        for(int i = 0; i < n; i++) { allNumbers[i] = i + 1; }
        System.out.println("The numbers: " + Arrays.toString(allNumbers));
        long startTime = System.nanoTime();
        for( int i=1; i <n; i++){
            if(allNumbers[i] == 0) {
                continue;
            }
            for (int j = i + allNumbers[i]; j < n; j += allNumbers[i]) {
                if(allNumbers[j] == 0) {
                    continue;
                }
                allNumbers[j] = 0;
            }
        }
        long endTime = System.nanoTime();
        long nonOptimization = endTime - startTime;
        System.out.println("The numbers with primes: " + Arrays.toString(allNumbers));
        System.out.println("Optimization:");
        for(int i = 0; i < n; i++) { allNumbers[i] = i + 1; }
        System.out.println("The numbers: " + Arrays.toString(allNumbers));
        startTime = System.nanoTime();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (allNumbers[i] != 0) {
                for (int j = allNumbers[i]*allNumbers[i]; j <= n; j+=allNumbers[i]) {
                        allNumbers[j-1] = 0;
                }
            }
        }
        endTime = System.nanoTime();
        System.out.println("The numbers with primes: " + Arrays.toString(allNumbers));
        System.out.println("No Optimization time: " + nonOptimization + " nanoseconds");
        System.out.println("No Optimization time: " + nonOptimization / 1000000 + " milliseconds");
        System.out.println("Optimization time: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Optimization time: " + (endTime - startTime) / 1000000 + " milliseconds");
    }
}