class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        // invert
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }

        // flip
        int[][] ans = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int k = 0;
            for (int j = image[i].length - 1; j >= 0; j--) {
                ans[i][k] = image[i][j];
                k++;
            }
        }
        return ans;
    }
}
