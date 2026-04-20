class Solution {
    public boolean isValidSudoku(char[][] board) {
        // int[] row_1 = new int[9];
        // int[] row_2 = new int[9];
        // int[] row_3 = new int[9];
        // int[] row_4 = new int[9];
        // int[] row_5 = new int[9];
        // int[] row_6 = new int[9];
        // int[] row_7 = new int[9];
        // int[] row_8 = new int[9];
        // int[] row_9 = new int[9];

        // int[] col_1 = new int[9];
        // int[] col_2 = new int[9];
        // int[] col_3 = new int[9];
        // int[] col_4 = new int[9];
        // int[] col_5 = new int[9];
        // int[] col_6 = new int[9];
        // int[] col_7 = new int[9];
        // int[] col_8 = new int[9];
        // int[] col_9 = new int[9];

        // int[] block_1 = new int[9];
        // int[] block_2 = new int[9];
        // int[] block_3 = new int[9];
        // int[] block_4 = new int[9];
        // int[] block_5 = new int[9];
        // int[] block_6 = new int[9];
        // int[] block_7 = new int[9];
        // int[] block_8 = new int[9];
        // int[] block_9 = new int[9];
        
        // int[][] rows = {row_1, row_2, row_3, row_4, row_5, row_6, row_7, row_8, row_9};
        // int[][] cols = {col_1, col_2, col_3, col_4, col_5, col_6, col_7, col_8, col_9};
        // int[][] blocks = {block_1, block_2, block_3, block_4, block_5, block_6, block_7, block_8, block_9};

        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] blocks = new int[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                
                int val = board[r][c] - '1'; 
                
                int block = (r / 3) * 3 + (c / 3);
                
                if (rows[r][val] == 1 || cols[c][val] == 1 || blocks[block][val] == 1) {
                    return false;
                }
                
                rows[r][val] = 1;
                cols[c][val] = 1;
                blocks[block][val] = 1;
            }
        }
        
        return true;
    }
}