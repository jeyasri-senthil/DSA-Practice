// Problem Link: https://leetcode.com/problems/word-search/description/

class Solution {
    public boolean exist(char[][] board, String word) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if(board[row][col] == word.charAt(0)) {
                    if(wordSearch(word, board, row, col, 0)) return true;
                }
            }
        }
        return false;
    }
    public static boolean wordSearch(String word, char[][] board, int row, int col, int position) {
        if(position == word.length()) return true;
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(position) || board[row][col] == '-') return false;
        char temp = board[row][col];
        board[row][col] = '-';
        boolean left = wordSearch(word, board, row, col-1, position+1);
        boolean right = wordSearch(word, board, row, col+1, position+1);
        boolean top = wordSearch(word, board, row-1, col, position+1);
        boolean bottom = wordSearch(word, board, row+1, col, position+1);
        if(left || right || top || bottom) return true;
        board[row][col] = temp;
        return false;
    }
}
