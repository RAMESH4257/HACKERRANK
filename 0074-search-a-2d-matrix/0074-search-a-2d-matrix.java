class Solution {
     static int binarySearch(int[] arr,int tar){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==tar){
                return  mid;
            }else if(arr[mid] >tar){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int rowlow=0;
        int rowhigh=row-1;
        while(rowlow<=rowhigh){
            int rowmid=rowlow+(rowhigh-rowlow)/2;
            if(target>=matrix[rowmid][0] && target<=matrix[rowmid][col-1]){
                int index=binarySearch(matrix[rowmid],target);
                return index>=0;
                    //return
                
            } else if (matrix[rowmid][0]>target) {
                rowhigh=rowmid-1;
            }else{
                rowlow=rowmid+1;
            }
        }
        return false;
    }
    }