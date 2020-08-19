public class Unicorn implements Mythical {
    @Override
    public void talk() {
        System.out.println("Neigh neigh, neigh... oh here we go! Magic translator on!");
    }

    @Override
    public void useAttackMagic() {
        System.out.println("Unicorn army, CHARGE! Use magic at will!");
    }

    @Override
    public void useDefenseMagic() {
        System.out.println("Come join me in my magical defense bubble! It's safe, I promise!");
    }

    @Override
    public void useHealingMagic() {
        System.out.println("Ow! That hurt! Let me use some magic to heal that up.");
        System.out.println("Come to me if you get hurt, my friend!");
    }
}
