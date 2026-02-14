class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(target>=matrix[i][0] && target<=matrix[i][matrix[0].length-1]){
                int idx=Arrays.binarySearch(matrix[i],target);
                if(idx>=0){
                    return true;
                }
            }
        }
        return false;
    }
}