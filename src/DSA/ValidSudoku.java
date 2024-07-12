package DSA;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] != '.'){
                    if(!isValid(board,i,j,board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean isValid(char[][] board,int i,int j,char c) {
        for (int k = 0; k < 9; k++) {
            if (k != j && board[i][k] == c) return false;
            if (k != i && board[k][j] == c) return false;
            if (i / 3 * 3 + k / 3 != i && j / 3 * 3 + k % 3 != j && board[i / 3 * 3 + k / 3][j / 3 * 3 + k % 3] == c)
                return false;
        }
        return true;
    }

    public static int printSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}};
                ;
        System.out.println(isValidSudoku(board));

    }
}
