package clockwise.direction;

import clockwise.BidimensionalList;

public class DownDirectionStrategy implements DirectionStategy {

    public void changeDirection(BidimensionalList bidimensionalList) {
        if (bidimensionalList.isAtBottomEdge() || bidimensionalList.isNextBottomCellNull()) {
            bidimensionalList.setDirection(Direction.LEFT);
        }
        else bidimensionalList.incrementX();
    }
}
