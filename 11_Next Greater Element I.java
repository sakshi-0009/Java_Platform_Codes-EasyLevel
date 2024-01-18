/* Problem Statement :-
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
*/

// Answer :-

class Solution {
    public int find(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i] = -1;
        }
        for(int i=0;i<nums1.length;i++){
            int idx = find(nums2,nums1[i]);
            for(int j=idx;j<nums2.length;j++){
                if(nums2[idx] < nums2[j] && ans[i] == -1){
                    ans[i] = nums2[j];
                }
            }
        }
        return ans;
    }
}
