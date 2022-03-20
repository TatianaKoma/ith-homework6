package ua.ithillel;

public class Animal {
    private final double maxRun;
    private final double maxSwim;
    private final String name;
    protected static int animalCount = 0;

    public Animal(double maxRun, double maxSwim, String name) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.name = name;
        animalCount++;
    }

    public void run(double distance) {
        if (distance > maxRun || distance < 0) {
            System.out.println("You choose a wrong distance for your " + name + ".");
        } else {
            System.out.println("The " + name + " has run " + distance + " m.");
        }
    }

    public void swim(double distance) {
        if (distance > maxSwim || distance < 0) {
            System.out.println("You choose a wrong distance for your " + name + ".");
        } else {
            System.out.println("The " + name + " has swum " + distance + " m.");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
