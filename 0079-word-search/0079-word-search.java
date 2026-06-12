class Solution {
    public boolean search(int idx,int i,int j,char[][] board,String word){
        if(idx==word.length()){
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(idx)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='*';
        boolean ans=search(idx+1,i-1,j,board,word)||search(idx+1,i+1,j,board,word)||search(idx+1,i,j-1,board,word)||search(idx+1,i,j+1,board,word);
        board[i][j]=temp;
        return ans;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(0,i,j,board,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna