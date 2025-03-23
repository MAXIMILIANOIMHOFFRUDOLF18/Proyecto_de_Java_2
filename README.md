# 🎮 Proyecto de Java: Estrategia multi-comportamiento en un sistema de personajes
## 📌 Descripción
Este proyecto, fué desarrollado en **Visual Studio Code**, implementa el patrón de diseño **Estrategia** en el lengüaje de Java con la finalidad de modelar diferentes tipos de personajes (**Character**). Dentro se usan **interfaces** para definir su comportamiento de ataque y movimiento, permitiendo flexibilidad y reutilización de código. Y a su vez, generando un cambio dinámico de los comportamientos en el momento de la ejecución.

## 🏗️ Estructura del Código
El código se organiza de la siguiente manera:

📂 **Proyecto_de_Java_2/**
- 📄 `Character.java` → Clase base con lógica común, en donde mandamos a llamar las 3 características creadas de cada Character, y su multi-comportamiento.
- 📄 `MoveBehavior.java` → Interfaz para el movimiento.
  - 📄 `Walk.java` → Implementación de move caminando.
  - 📄 `Run.java` → Implementación corriendo.
  - 📄 `ChestWalk.java` → Implementación de caminar con el pecho erguido.
  - 📄 `SquatWalk.java` → Implementación de movimiento en cunclillas.
- 📄 `WeaponBehavior.java` → Interfaz para los ataques.
  - 📄 `Axe.java` → Ataque con un hacha.
  - 📄 `BowAndArrow.java` → Ataque con arco y flecha.
  - 📄 `Knife.java` → Ataque con un cuchillo.
  - 📄 `Sword.java` → Ataque con una espada.
- 📄 `Knight.java` → Implementación de un caballero.
- 📄 `Queen.java` → Implementación de una Reina.
- 📄 `WarArcher.java` → Implementación de un Arquero de guerra.
- 📄 `Troll.java` → Implementación de un Troll.
- 📄 `King.java` → Implementación de un Rey.
- 📄 `App.java` → Punto de entrada del programa.

## 🛠️ Tecnologías Utilizadas
- **Lenguaje:** Java ☕
- **IDE:** Visual Studio Code 🖥️
- **Patrón de Diseño:** Estrategia 🏗️

## 🚀 Instalación y Ejecución
1. Clona este repositorio:
   ```sh
   git clone [https://github.com/usuario/Proyecto_de_Java.git](https://github.com/MAXIMILIANOIMHOFFRUDOLF18/Proyecto_de_Java_2.git)
   ```
2. Accede al directorio del proyecto:
   ```sh
   cd Proyecto_de_Java_2
   ```
3. Compila los archivos:
   ```sh
   javac src/*.java
   ```
4. Ejecuta el programa:
   ```sh
   java src.Main
   ```

## 📄 Parte del Código de mayor relevancia
```java
// Clase Character debe ser abstracta.
public abstract class Character {
    WeaponBehavior weaponBehavior;
    MoveBehavior moveBehavior;

    public abstract void display();
    //Mando a llamar los métodos de cada interface.
    public void performMove() {
        moveBehavior.move();
    }
    public void performAttack() {
        weaponBehavior.attack();
    }
    // Con esta implementación, generamos el cambio dinámico al ejecutar el programa sin modificar el movimiento original de c/personaje
    public void setWeapon(WeaponBehavior weapon) {
        this.weaponBehavior = weapon;
    }
    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }
    // Mando a llamar las 3 características de cada personaje a ser usado.
    public void showCharacter(){
        display();
        performMove();
        performAttack();
        
    }
}

// Interfaz para comportamiento de movimiento

public interface MoveBehavior {
    public void move();
}

// Interfaz para comportamiento de ataques

public interface WeaponBehavior {
    public void attack();
}

```

## ✅ Características Implementadas
- ✅ Uso del patrón **Estrategia** para comportamientos dinámicos.
- ✅ Su utiliza **interfaces** para ataque y movimiento.
- ✅ Fácil escalabilidad para agregar nuevos tipos de personajes y clases dentro de las interfaces.
- ✅ Flexibilización al momento de cambiar el movimiento y el ataque de cada personaje sin necesidad de cambiar el original.

## 📌 Contribución
Si deseas contribuir, crea un **Pull Request** o reporta un problema en **Issues**.

## 📜 Licencia
Este proyecto está bajo la licencia MIT.
