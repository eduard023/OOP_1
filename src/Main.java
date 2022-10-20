public class Main {
    public static void main(String[] args){
        Human max = new Human(1987, "Максим", "Минск", "бренд-мененджер");
//        max.name = "Максим";
//        max.yearOfBirth = 1987;
//        max.town = "Минск";
//        max.job = "бренд-мененджер";
        max.greet();

        Human ann = new Human(1993, "Аня", "Москва", "методист");
//        ann.name = "Аня";
//        ann.yearOfBirth = 1993;
//        ann.town = "Москва";
//        ann.job = "методист";
        ann.greet();

        Human kate = new Human(1994, "Катя", "Калининград", "продакт-мененджер");
//        kate.name = "Катя";
//        kate.yearOfBirth = 1994;
//        kate.town = "Калининград";
//        kate.job = "продакт-мененджер";
        kate.greet();

        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
//        artem.name = "Артем";
//        artem.yearOfBirth = 1995;
//        artem.town = "Москва";
//        artem.job = "директор по развитию бизнеса";
        artem.greet();

    }
}