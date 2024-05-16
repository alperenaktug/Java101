package GameProject;
import java.util.Scanner;
import java.util.Random;


        public class MayınTarlasiOyunu {
            private final int row;
            private final int col;
            private final int numMines;
            private final char[][] board;
            private final boolean[][] mineLocations;

            public MayınTarlasiOyunu (int row, int col, int numMines) {
                this.row = row;
                this.col = col;
                this.numMines = numMines;
                this.board = new char[row][col];
                this.mineLocations = new boolean[row][col];
                initializeBoard();
                placeMines();
                calculateNumbers();
            }

            private void initializeBoard() {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        board[i][j] = '-';
                    }
                }
            }

            private void placeMines() {
                Random rand = new Random();
                int minesPlaced = 0;
                while (minesPlaced < numMines) {
                    int randRow = rand.nextInt(row);
                    int randCol = rand.nextInt(col);
                    if (!mineLocations[randRow][randCol]) {
                        mineLocations[randRow][randCol] = true;
                        minesPlaced++;
                    }
                }
            }

            private void calculateNumbers() {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        if (!mineLocations[i][j]) {
                            int count = 0;
                            for (int r = i - 1; r <= i + 1; r++) {
                                for (int c = j - 1; c <= j + 1; c++) {
                                    if (r >= 0 && r < row && c >= 0 && c < col && mineLocations[r][c]) {
                                        count++;
                                    }
                                }
                            }
                            if (count > 0) {
                                board[i][j] = (char) (count + '0');
                            }
                        }
                    }
                }
            }

            private void displayBoard() {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            public void play() {
                Scanner scanner = new Scanner(System.in);
                boolean gameOver = false;
                while (!gameOver) {
                    displayBoard();
                    System.out.print("Satır girin: ");
                    int rowGuess = scanner.nextInt();
                    System.out.print("Sütun girin: ");
                    int colGuess = scanner.nextInt();
                    if (mineLocations[rowGuess][colGuess]) {
                        System.out.println("Mayına bastınız! Oyun bitti.");
                        gameOver = true;
                    } else {
                        board[rowGuess][colGuess] = ' ';
                    }
                }
                scanner.close();
            }

            public static void main(String[] args) {
                MayınTarlasiOyunu  game = new MayınTarlasiOyunu (5, 5, 5); // Örnek olarak 5x5 boyutunda ve 5 mayın içeren bir oyun oluşturuyoruz.
                game.play();
            }
        }



