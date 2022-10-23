package oop2_2;

public class Main {
    public static void main(String[] args){{
        Human max = new Human(1987, "Максим", "Минск", "бренд-мененджер");

        max.greet();

        Human ann = new Human(1993, "Аня", "Москва", "методист");

        ann.greet();

        Human kate = new Human(1994, "Катя", "Калининград", "продакт-мененджер");
        kate.greet();

        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        artem.greet();

        Human vladimir = new Human(2001, "Владимир", "Казань", null);
        vladimir.greet();
    }
    Flower rose = new Flower(null,"Голландия", 35.59);
    Flower hrizantema = new Flower(null,null, 15);
    hrizantema.lifeSpan = 5;
    Flower pion = new Flower(null,"Англия", 69.9);
    pion.lifeSpan = 1;
    Flower gipsofila = new Flower(null,"Турция", 19.5);
    gipsofila.lifeSpan = 10;

    printInfo(rose);
    printInfo(hrizantema);
    printInfo(pion);
    printInfo(gipsofila);
    }
    private static void printInfo(Flower flower){
        System.out.println("Цвет: " + flower.getFlowerColor() +
                ", страна: " + flower.getCountry() +
                ", стоимость за штуку: " + flower.getCoast()+
                ", срок стояния цветка: " + flower.lifeSpan);
    }
}
