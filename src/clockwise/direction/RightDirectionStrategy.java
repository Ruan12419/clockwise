package clockwise.direction;

import clockwise.BidimensionalList;

public class RightDirectionStrategy implements DirectionStategy {

    public void changeDirection(BidimensionalList bidimensionalList) {
        if (bidimensionalList.isAtRightEdge() || bidimensionalList.isNextRightCellNull()) {
            bidimensionalList.setDirection(Direction.DOWN);
        }
        else bidimensionalList.incrementY();
    }
}
