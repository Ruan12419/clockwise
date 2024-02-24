package clockwise.direction;

import clockwise.Direction;
import clockwise.BidimensionalList;

public class LeftDirectionStrategy implements DirectionStategy {

    public void changeDirection(BidimensionalList bidimensionalList) {
        if (bidimensionalList.isAtLeftEdge() || bidimensionalList.isNextLeftCellNull()){
            bidimensionalList.setDirection(Direction.UP);
        }
        else bidimensionalList.decrementY();
    }
}
