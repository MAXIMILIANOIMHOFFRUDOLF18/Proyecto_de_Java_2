public class Troll extends Character {
    public Troll() {
        weaponBehavior = new Axe();
        moveBehavior = new SquatWalk();
    }
    public void display() {
        System.out.println("Soy un Troll");
    }
}