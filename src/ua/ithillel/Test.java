package ua.ithillel;

public class Test {
    public static void main(String[] args) {
        Animal catMurzik = new Cat(200);
        Animal catBarsik = new Cat(200);
        Animal dogSharik = new Dog(500, 10);
        Animal dogTuzik = new Dog(500, 10);
        catMurzik.run(-150);
        catBarsik.swim(128);
        dogSharik.run(350);
        dogTuzik.swim(9);
        System.out.println("There are " + Dog.getCount() + " dogs in the class.");
        System.out.println("There are " + Cat.getCount() + " cats in the class.");
        System.out.println("There are " + Dog.getAnimalCount() + " animals in the class.");
    }
}
