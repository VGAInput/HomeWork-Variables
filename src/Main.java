public class Main {
    public static void main(String[] args) {

        /// Домашнее задание - 2, 3 ///

             ///  Задача 4  ///

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend + "\n");

             ///  Задача 5  ///

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog+ "\n");

             ///  Задача 6,7 ///

        var boxerWeight_1 = 78.2;
        var boxerWeight_2 = 82.7;

        System.out.println("Общий вес боксёров: " + (boxerWeight_1 + boxerWeight_2));

        System.out.println("Разница между весами боксёров: " + (boxerWeight_2 % boxerWeight_1));
        System.out.println("Разница между весами боксёров: " + (boxerWeight_2 - boxerWeight_1) + "\n");

              ///  Задача 8  ///

        var totalWorkingHours = 640;
        var workingTime = 8;
        var ammountOfworkers = totalWorkingHours / workingTime;

        System.out.println("Всего работников в компании – "+ ammountOfworkers +" человек.");

        ammountOfworkers = ammountOfworkers + 94;

        System.out.println("Если в компании работает "+ (ammountOfworkers) +" человек," +
                "то всего "+  (totalWorkingHours / (ammountOfworkers)) + " часов работы может быть поделено " +
                "между сотрудниками");




    }
}