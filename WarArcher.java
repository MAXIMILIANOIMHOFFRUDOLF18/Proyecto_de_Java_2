public class WarArcher extends Character {
    public WarArcher() {
        weaponBehavior = new BowAndArrow();
        moveBehavior = new Walk();
    }
    public void display() {
        System.out.println("Soy un Arquero de Guerra");
    }
}