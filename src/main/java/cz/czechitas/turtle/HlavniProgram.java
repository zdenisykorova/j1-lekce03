package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

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
        nakresliObdelnik(delkaStrany,delkaStrany);
        }


    public void nakresliBarevnyCtverec(int delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        nakresliCtverec(delkaStrany);
    }


    public void nakresliObdelnik(int delkaStranyA, int delkaStranyB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }

    public void nakresliTrojuhelnik(int delkaStranyC, int delkaStranyD, int delkaStranyE) {
        zofka.move(delkaStranyC);
        zofka.turnRight(90);
        zofka.move(delkaStranyD);
        zofka.turnRight(135);
        zofka.move(delkaStranyE);
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
        nakresliBarevnyCtverec(40, Color.RED);
        nakresliBarevnyCtverec(60, Color.green);
        nakresliBarevnyCtverec(150, Color.yellow);
        nakresliObdelnik(100, 50);
        nakresliTrojuhelnik(92,100,135);

    }
}
