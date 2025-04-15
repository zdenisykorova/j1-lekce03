package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void nakresliDomek() {
        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
    }

    public void nakresliCtverec(int delkaStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    public void start() {
        zofka = new Turtle();

        //TODO Tady bude kód pro kreslení želví grafiky.

        nakresliDomek();
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();
        nakresliDomek();
        nakresliCtverec(10);
        nakresliCtverec(60);
        nakresliCtverec(150);
        }
}
