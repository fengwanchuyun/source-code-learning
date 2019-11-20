package designPattern.MementoPattern;

/**
 * 备忘录模式
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        MementoCareMaker maker = new MementoCareMaker();

        Chessman juChess = new Chessman("車", 1, 1);
        Chessman soliderChess = new Chessman("兵", 1,5);

        maker.chess(juChess);
        maker.chess(soliderChess);

        juChess.setX(3);
        maker.chess(juChess);
        soliderChess.setY(6);
        maker.chess(soliderChess);

        maker.redo(juChess);
        maker.redo(soliderChess);
        maker.redo(juChess);
        maker.redo(soliderChess);

    }
}
