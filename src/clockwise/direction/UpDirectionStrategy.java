package clockwise.direction;

import clockwise.BidimensionalList;

public class UpDirectionStrategy implements DirectionStategy {

    public void changeDirection(BidimensionalList bidimensionalList) {
        if (bidimensionalList.isAtTopEdge() || bidimensionalList.isNextTopCellNull()) {
            bidimensionalList.setDirection(Direction.RIGHT);
        }
        else bidimensionalList.decrementX();
    }
}
