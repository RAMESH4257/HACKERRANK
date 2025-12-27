/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
//  int x[2]={1,1};
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    // printf("%d",sizeof(returnSize));
    int* result = (int*)malloc(2 * sizeof(int));
    *returnSize = 2;
    int i=0;
    int j;
    
    for(i;i<numsSize;i++){
        for(j=i+1;j<numsSize;j++){
            int l = 0;
            l = nums[i]+nums[j];
            int c=0;
            if(l==target){
                result[c++]=i;
                result[c]=j;
            }
        }
    }
    return result;
}