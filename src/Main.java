public class Main {
    public static void main(String[] args) {

        // Домвшнее задание 1

        System.out.println("домашее задание 1");

        // Задание 1.
        System.out.println("Задание 1.");

        // Вариант 1
        System.out.println("Вариант 1");
        int age = 21;
        if (age >= 18) {
            System.out.println("Позравляю ты совершеннолетний и можешь получить ипотеку!");
        }
        if (age < 18)
        {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать!");
        }
        // вариант 2
        System.out.println("Вариант 2");
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Позравляю ты совершеннолетний и можешь получить ипотеку!");
        }
        if (age1 < 18)
        {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать!");
        }
        // Задание 2
        System.out.println("Задание 2.");
        int child = 7;
        if (child >= 7){
            System.out.println("Ребенок ходит в шолу.");
        }
        if (child < 7){
            System.out.println("Ребенку еще рано идти в школу.");
        }
        int human = 18;
        if (human >= 18){
            System.out.println("Человек уже закончил школу и может отпарвляться в университет.");
        }
        if (human < 18){
            System.out.println("Человеку еще рано идти в университет.");
        }
        int human1 = 24;
        if (human1 >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }
        if (human1 < 24){
            System.out.println("Человеку еще рано искать работу.");
        }
        // Задание 3
        System.out.println("Задание 3.");
        int wagonCapacity = 120;
        int seatingArea = 60;
        int standUp = 60;
        if (seatingArea <= 60){
            System.out.println("Сидячие места есть!");
        }
        if (seatingArea > 60){
            System.out.println("Сидячих мест нет!");
        }
        if (standUp <= 60){
            System.out.println("Стоячие меса есть!");
        }
        if (standUp > 60){
            System.out.println("Стоячих места нет!");
        }
        if (wagonCapacity <= 120){
            System.out.println("В вагоне есть места!");
        }
        if (wagonCapacity > 120){
            System.out.println("В вагоне мест нет!");
        }


        // Домашнее задание 2

        System.out.println("Домашнее задание 2");

        // Задание 1

        System.out.println("Задание 1.");
        int age2 = 11;
        if (age2 >= 18) {
            System.out.println("Позравляю ты совершеннолетний и можешь получить ипотеку!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать!");
        }

        // Задание 2

        System.out.println("Задание 2.");
        int child1 = 7;
        if (child1 >= 7) {
            System.out.println("Ребенок ходит в шолу.");
        } else {
            System.out.println("Ребенку еще рано идти в школу.");
        }

        int human2 = 18;
        if (human2 >= 18) {
            System.out.println("Человек уже закончил школу и может отпарвляться в университет.");
        } else {
            System.out.println("Человеку еще рано идти в университет.");
        }

        int human3 = 24;
        if (human3 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        } else {
            System.out.println("Человеку еще рано искать работу.");
        }

        // Задание 3

        System.out.println("Задание 3.");
        int wagonCapacity1 = 120;
        int seatingArea3 = 60;
        int standUp3 = 60;

        if (seatingArea3 <= 60) {
            System.out.println("Сидячие места есть!");
        } else {
            System.out.println("Сидячих мест нет!");
        }
        if (standUp3 <= 60) {
            System.out.println("Стоячие меса есть!");
        } else {
            System.out.println("Стоячих места нет!");
        }
        if (wagonCapacity1 <= 120) {
            System.out.println("В вагоне есть места!");
        } else {
            System.out.println("В вагоне мест нет!");
        }

        // Домашнее задание 3

        System.out.println("Домашнее задание 3");

        // задание 1

        System.out.println("Задание 1.");

        int ageMan = 25;
        if (ageMan >= 2 && ageMan < 6) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад.");
        } else if (ageMan >= 7 && ageMan < 18) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу.");
        } else if (ageMan >= 18 && ageMan < 24) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему пора бы уже ходить на работу");
        }

        // Задание 2

        System.out.println("Задание 2.");
        int childAge = 17;
        if (childAge < 5) {
            System.out.println("Возраст ребенка " + childAge + ", ему нельзя кататься на аттракционе.");
        } else if (childAge < 14) {
            System.out.println("Возраст ребенка " + childAge + ", ему можно кататься на аттракционе только в сопровождении взрослых. ");
        } else {
            System.out.println("Возраст ребенка " + childAge + ", можно кататься без взрослых.");
        }

        // Задание 3

        System.out.println("Задание 3.");
        int one = 4;
        int two = 5;
        int tfree = 35;
        if (one > two) {
            if (one >= tfree) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + tfree);
            }
        } else if (two > one) {
            if (two >= tfree) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + tfree);
            }
        } else {
            if (one > tfree) {
                System.out.println("Максимальное число - " + one);
            } else if (tfree > one) {
                System.out.println("Максимальное число - " + tfree);
            } else {
                System.out.println("Все 3 числа равны");

            }
        }

    }
}