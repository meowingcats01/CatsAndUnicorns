public class Cat implements Animal {
    @Override
    public void happyNoise() {
        System.out.println("I am a happy kitten! Purr purr!");
    }

    @Override
    public void hungryNoise() {
        System.out.println("I'm hungry! The yummy aquarium fish are in danger!");
    }

    @Override
    public void annoyedNoise() {
        System.out.println("Leave me alone! I'm annoyed.");
    }

    @Override
    public void madNoise() {
        System.out.println("Back off or these claws will come out!");
    }
}
