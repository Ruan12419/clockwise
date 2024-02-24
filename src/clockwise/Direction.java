package clockwise;

import clockwise.direction.*;

public enum Direction implements DirectionStategy {
    LEFT(new LeftDirectionStrategy()),
    UP(new UpDirectionStrategy()),
    RIGHT(new RightDirectionStrategy()),
    DOWN(new DownDirectionStrategy());

    private final DirectionStategy directionStategy;

    Direction(DirectionStategy directionStategy) {
        this.directionStategy = directionStategy;
    }

    public void changeDirection(BidimensionalList bidimensionalList) {
        directionStategy.changeDirection(bidimensionalList);
    }
}
