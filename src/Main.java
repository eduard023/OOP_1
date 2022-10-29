public class Main {
    public static void main(String[] args){
        Human max = new Human(1987, "Максим", "Минск", "бренд-мененджер");

        max.greet();

        Human ann = new Human(1993, "Аня", "Москва", "методист");

        ann.greet();

        Human kate = new Human(1994, "Катя", "Калининград", "продакт-мененджер");
        kate.greet();

        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        artem.greet();

    }
}