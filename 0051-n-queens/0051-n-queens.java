class Solution {
    public boolean isSafe(int row,int col,List<String> board,int n){
        int r=row,c=col;
        while(row>=0){
            if(board.get(row).charAt(col)=='Q') return false;
            row--;
        }
        row=r;
        col=c;
         while(row>=0 && col<n){
            if(board.get(row).charAt(col)=='Q') return false;
            row--;
            col++;
        }
        row=r;
        col=c;
         while(row>=0 && col>=0){
            if(board.get(row).charAt(col)=='Q') return false;
            row--;
            col--;
        }
        return true;
    }
    public void func(int row,List<String> board,List<List<String>> ans,int n){
        if(row==n){
            ans.add(new ArrayList<>(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(row,col,board,n)){
                char[] rowArr=board.get(row).toCharArray();
                rowArr[col]='Q';
                board.set(row,new String(rowArr));
                func(row+1,board,ans,n);
                rowArr[col]='.';
                board.set(row,new String(rowArr));
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        List<String> board=new ArrayList<>();
        String s="";
        for(int i=0;i<n;i++){
            s+=".";
        }
        for(int i=0;i<n;i++){
            board.add(s);
        }
        func(0,board,ans,n);
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna