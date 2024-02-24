package clockwise;

public class InsertNumber {
    public BidimensionalList insertNumber(BidimensionalList bidimensionalList, int x, int y, int number) {
        String formattedNumber = String.format("%03d", number);
        bidimensionalList.getLista()[x][y] = formattedNumber;
        return bidimensionalList;
    }
}
