package clockwise;

import clockwise.direction.Direction;

public class BidimensionalList {
    private String[][] lista;
    private int x;
    private int y;
    private Direction direction;

    private final int HALF = 2;

    public BidimensionalList(int tamanho) {
        this.lista = new String[tamanho][tamanho];
        this.x = tamanho / HALF;
        this.y = tamanho / HALF;
        this.direction = Direction.DOWN;
    }

    public String[][] getLista() {
        return lista;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
        switch (direction) {
            case LEFT:
                decrementY();
                break;
            case UP:
                decrementX();
                break;
            case RIGHT:
                incrementY();
                break;
            case DOWN:
                incrementX();
                break;
            case null:
                break;
        }
    }

    public void showLista() {
        for (String[] strings : lista) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    public void decrementY() {
        y -= 1;
    }
    public void incrementY() {
        y += 1;
    }
    public void decrementX() {
        x -= 1;
    }
    public void incrementX() {
        x += 1;
    }

    public boolean isAtLeftEdge() {
        return y == 0;
    }

    public boolean isAtRightEdge() {
        return y == lista.length-1;
    }

    public boolean isAtTopEdge() {
        return x == 0;
    }

    public boolean isAtBottomEdge() {
        return x == lista.length-1;
    }

    public boolean isNextLeftCellNull() {
        return lista[x-1][y] == null;
    }

    public boolean isNextRightCellNull() {
        return lista[x+1][y] == null;
    }

    public boolean isNextTopCellNull() {
        return lista[x][y+1] == null;
    }

    public boolean isNextBottomCellNull() {
        return lista[x][y-1] == null;
    }

}
