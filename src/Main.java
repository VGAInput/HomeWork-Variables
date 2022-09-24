public class Main {
    public static void main(String[] args) {

        /// Домашнее задание - Переменные ч.2 ///

            /* Задача 1 */

        byte byte_x = 127;
        short short_x = 32767;
        int int_x = 456789444;
        long long_x = 489536312;
        float float_x = 34.89f;
        double double_x = 13.37;

        System.out.println("Значение переменной byte_x с типом byte равно: " + byte_x);
        System.out.println("Значение переменной short_x с типом short равно: " + short_x);
        System.out.println("Значение переменной int_x с типом int равно: " + int_x);
        System.out.println("Значение переменной long_x с типом long равно: " + long_x);
        System.out.println("Значение переменной float_x с типом float равно: " + float_x);
        System.out.println("Значение переменной long_x с типом long равно: " + double_x + "\n");

            /* Задача 2 */

        float num1 = 27.12f;
        long num2 = 987678965549L;
        byte num3 = 2;
        short num4 = 786;
        boolean bool1 = false;
        short num5 = 569;
        short num6 = -159;
        int num7 = 276897;
        double num8 = 67.;

            /* Задача 3 */

        short pavlovnaClass_studens = 23;
        short sergeevnaClass_studens = 27;
        short andreevnaClass_students = 30;

        short paperSheets = 480;

        int  sheetsPerStudents = paperSheets / (pavlovnaClass_studens + sergeevnaClass_studens + andreevnaClass_students);

        System.out.println("На каждого ученика рассчитано по" + sheetsPerStudents + " листов бумаги\n");

            /* Задача 4 */

        short bottlesPerMinute = 16/2;

        int bottles_20Minutes = bottlesPerMinute * 20;
        int bottles_Day = bottlesPerMinute * 1400;
        int bottles_3Days = bottles_Day * 3;
        int bottles_Month = bottles_Day * 30;

        System.out.println("За 20 минут работы машина произвела бутылок: " + bottles_20Minutes + " штук");
        System.out.println("За сутки работы машина произвела бутылок: " + bottles_Day + " штук");
        System.out.println("За 3 сутка работы машина произвела бутылок: " + bottles_3Days + " штук");
        System.out.println("За месяц работы машина произвела бутылок: " + bottles_Month + " штук\n");

            /* Задача 5 */

        short paintRequired = 120;

        byte paintPerClass_White = 2;
        byte paintPerClass_Brown = 4;

        int classrooms =  paintRequired / (paintPerClass_White + paintPerClass_Brown);

        int paintWhite_total = classrooms * paintPerClass_White;
        int paintBrown_total = classrooms * paintPerClass_Brown;

        System.out.println("В школе, где " +classrooms+ " классов, нужно " +paintWhite_total+ " банок белой краски и "
                +paintBrown_total+ " банок коричневой краски\n");

            /* Задача 6 */

        short bananaToGram = 80;
        short milkToGram = 105;
        short iceCreamToGram = 100;
        short eggToGram = 70;

        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;

        float massOfBreakfastInGram = (bananas * bananaToGram) + ((milk / 100) * milkToGram) + (iceCream * iceCreamToGram) +
                (eggs * eggToGram);

        float massOfBreakfastInKilo = massOfBreakfastInGram / 1000;

        System.out.println("Масса спортивного завтра в килограммах: " + massOfBreakfastInKilo + " кг.\n");

            /* Задача 7 */

        short looseWeightTarget = 7 * 1000;

        short looseWeightMin = 250;
        short looseWeightMax = 500;

        int minimumDays = looseWeightTarget / looseWeightMax;
        int maximumDays = looseWeightTarget / looseWeightMin;
        int mediumAmmountOfDays = (maximumDays - minimumDays)/2 + minimumDays;

        System.out.println("Минимальное время для достижение веса: " + minimumDays);
        System.out.println("Максимальное время для достижение веса: " + maximumDays);
        System.out.println("Среднее время для достижение веса: " + mediumAmmountOfDays + "\n");

                /* Задача 8 */

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int newSalaryMasha = salaryMasha + (salaryMasha / 10);
        int newSalaryDenis = salaryDenis + (salaryDenis / 10);
        int newSalaryKristina = salaryKristina + (salaryKristina / 10);

        int newYearlySalaryMasha = (newSalaryMasha / 10) * 12;
        int newYearlySalaryDenis = (newSalaryDenis / 10) * 12;
        int newYearlySalaryKristina = (newSalaryKristina / 10) * 12;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + newYearlySalaryMasha+ " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + newYearlySalaryDenis+ " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + newYearlySalaryKristina+ " рублей.");

    }
}