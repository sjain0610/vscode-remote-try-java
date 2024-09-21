public class King extends ChessPiece{
    public King(String position){
        super(position);
    }

    @Override
    public boolean canMove(String newPosition){
        char newColumn = newPosition.charAt(0);
        int row = Character.getNumericValue(position.charAt(1));


    }

    private List<String> getNextPosition() {
        List<String> newPositions= new ArrayList<>();
        char column = position.charAt(0); // To get the column character, e.g., 'A', 'B'.
        int row = Character.getNumericValue(position.charAt(1)); //To get the row number, e.g., 1, 2, 3.
        return "" + column + (row + 1); // Return the new position

        return Math.abs(newX - x) <= 1 && Math.abs(newY - y) <= 1;
    }
}