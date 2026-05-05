class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> col = new HashMap<>();
        HashMap<String, HashSet<Character>> box = new HashMap<>();

        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                if(board[i][j] == '.') continue;
                if(row.containsKey(i)){ if(row.get(i).contains(board[i][j])){return false;}else{row.get(i).add(board[i][j]);}}
                else{HashSet<Character> x = new HashSet<>(); x.add(board[i][j]); row.put(i, x);}
            
                if(col.containsKey(j)){ if(col.get(j).contains(board[i][j])){return false;}else{col.get(j).add(board[i][j]);}}
                else{HashSet<Character> x = new HashSet<>(); x.add(board[i][j]); col.put(j, x);}

                String squarekey = i/3 + "-" + j/3;

                if(box.containsKey(squarekey)){if(box.get(squarekey).contains(board[i][j])){return false;}else{box.get(squarekey).add(board[i][j]);}}
                else{HashSet<Character> x = new HashSet<>(); x.add(board[i][j]); box.put(squarekey, x);}
            }
        }
    return true;
    }

}
