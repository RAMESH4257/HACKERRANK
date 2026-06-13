class Solution {
     public void func(int i,int j,String s,int[][] grid,ArrayList<String> ans){
       if(i==grid.length-1 && j==grid[0].length-1){
        ans.add(s);
        return;
       }
       if(grid[i][j]==0) return;
       grid[i][j]=0;
       if(i-1>=0 && grid[i-1][j]==1){
         func(i-1,j,s+"U",grid,ans);
       }
       if(i+1<grid.length  && grid[i+1][j]==1){
         func(i+1,j,s+"D",grid,ans);
       }
       if(j+1<grid[0].length && grid[i][j+1]==1){
         func(i,j+1,s+"R",grid,ans);
       }
       if(j-1>=0 && grid[i][j-1]==1){
         func(i,j-1,s+"L",grid,ans);
       }
       grid[i][j]=1;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
         int n=maze.length,m=maze[0].length;
        ArrayList<String> ans=new ArrayList<>();
        if(maze[0][0]==0 || maze[n-1][m-1]==0){
            return ans;
        }
       // List<String> ans=new ArrayList<>();
        func(0,0,"",maze,ans);
        Collections.sort(ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna