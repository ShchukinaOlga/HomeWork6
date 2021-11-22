/**
 * Java 1. HomeWork 6
 *
 @ autor Shchukina Olga
 @ version 22.11.2021
*/

class Lesson6HomeWork {

    public static void main(String[] args) {
        Cat catVasya = new Cat ("Vasya");
        System.out.print(catVasya);
        catVasya.run(150);
        catVasya.swim(0);

        Cat catBarsik = new Cat ("Barsik");
        System.out.print(catBarsik);
        catBarsik.run(180);
        catBarsik.swim(0);

        Cat catManya = new Cat ("Manya");
        System.out.print(catManya);
        catManya.run(190);
        catManya.swim(0);

        Dog dogBobik = new Dog ("Bobik");
        System.out.print(dogBobik);
        dogBobik.run(420);
        dogBobik.swim(8);

        Dog dogRex = new Dog ("Rex");
        System.out.print(dogRex);
        dogRex.run(500);
        dogBobik.swim(10);
    }
}

abstract class Animals {
    protected String name;

    Animals(String name) {
        this.name = name;
    }

    public void run(int run) {
        System.out.print("animal ran");
    }
    
    public void swim(int swim) {
    System.out.print("animal swam");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Cat extends Animals {

    Cat (String name) {
        super(name);
    }

    @Override
    public void run(int run) {
        if (run <= 200)
        System.out.print(" ran " + run + " m, ");
    }

    @Override
    public void swim(int swim) {
        System.out.println("can not swim");
    }
}

class Dog extends Animals {

    Dog (String name) {
        super(name);
    }

    @Override
    public void run(int run) {
        if (run <= 500)
        System.out.print(" ran " + run + " m, ");
    }

    @Override
    public void swim(int swim) {
        if (swim <= 10)
        System.out.println("swam " + swim + " m");
    }
}