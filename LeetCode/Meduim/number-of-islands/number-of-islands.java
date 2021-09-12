class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0){
            return 0;
        }
        int numOfIslands=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]=='1'){
                   numOfIslands += checkIsland(grid, i, j); 
                }
            }
        }
        return numOfIslands;
        
    }
    
    public int checkIsland(char[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]=='0'){
            return 0;
        }
        
        grid[i][j]='0';
        checkIsland(grid, i-1,j);
        checkIsland(grid, i+1,j);
        checkIsland(grid, i,j-1);
        checkIsland(grid, i,j+1);
        return 1;
    }
}