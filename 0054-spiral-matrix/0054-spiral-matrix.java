class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li=new ArrayList<>();
    
     int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        //System.out.println("Spiral Order:");

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int i = left; i <= right; i++) {
               li.add(matrix[top][i]);
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom; i++) {
               li.add(matrix[i][right]);
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                   li.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    li.add(matrix[i][left]);
                }
                left++;
            }
        }
        return li;
    }
}