## Chess Application

This is a Spring Boot application that simulates an empty chessboard and the movements of three types of
chess pieces on it: Pawn, King, and Queen. The application provides an API to retrieve possible moves for each piece based on its current position on the board and also validate whether it can move to a new position.

## Folder Structure

The workspace contains 
> Application class - ChessboardApplication.java
> Controller class for handling requests - ChessController.java
> Model class for Chesspiece :
  - **ChessPiece** : Abstract class for chess pieces.
  - **Pawn** : Moves one square forward.
  - **King** : Moves one square in any direction (vertical, horizontal, diagonal).
  - **Queen**: Moves any number of squares in any direction (vertical, horizontal, diagonal).
> Service class for business logic - ChessService.java
> Test class for chess functionality- ChessBoardApplicationTests.java

## Technologies Used

- Java 17
- Spring Boot
- JUnit (for testing)
- Maven (for dependency management)

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/sjain0610/myrepo
   
