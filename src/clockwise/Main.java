package clockwise;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = new Random().nextInt(32);
        BidimensionalList list = new BidimensionalList(size);
        InsertNumber insertNumber = new InsertNumber();

        for (int i = 1; i < (size*size)+1; i++) {
            insertNumber.insertNumber(list, list.getX(), list.getY(), i);
            list.getDirection().changeDirection(list);
        }
        list.showLista();

    }
}