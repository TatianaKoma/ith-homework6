package ua.ithillel;

public class Cat extends Animal {
    private static int count = 0;

    public Cat(double maxRun) {
        super(maxRun, 0, "cat");
        count++;
    }

    @Override
    public void run(double distance) {
        super.run(distance);
    }

    @Override
    public void swim(double distance) {
        System.out.println("Cat can't swim.");
    }

    public static int getCount() {
        return count;
    }
}
