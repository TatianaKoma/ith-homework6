package ua.ithillel;

public class Dog extends Animal {
    private static int count = 0;

    public Dog(double maxRun, double maxSwim) {
        super(maxRun, maxSwim, "dog");
        count++;
    }

    @Override
    public void run(double distance) {
        super.run(distance);
    }

    @Override
    public void swim(double distance) {
        super.swim(distance);
    }

    public static int getCount() {
        return count;
    }
}
