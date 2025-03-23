// Clase principal para probar el sistema

public class App {
    public static void main(String[] args) {
        Character Character1 = new Knight();
        Character1.showCharacter();
        
        System.out.println("\nCambiando movimiento y arma del Caballero...");
        
        Character1.setMoveBehavior(new Walk());
        Character1.setWeapon(new Axe());
        
        Character1.performMove();
        Character1.performAttack();

        System.exit(0);
    }
}