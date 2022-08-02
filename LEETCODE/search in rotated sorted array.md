[Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
Solved with binary search.
```java
//Time complexity =O(logn)
class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else{
               
                if((nums[mid]>=nums[l])){
                    if((nums[mid]>=target)&&(target>=nums[l]))
                        r=mid-1;
                    else
                        l=mid+1;
                }
                else{
                     if((nums[mid]<=target)&&(target<=nums[r]))
                        l=mid+1;
                    else
                        r=mid-1;
                    
                }
            }
        }
        return -1;
    }
}
```
