class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - nums2.length - 1;
        int j = nums2.length - 1;
        int k = nums1.length - 1;

        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
              nums1[k] = nums1[i];
              i--;
            }else{
               nums1[k] = nums2[j];
               j--;
            }
            k--;
        }
        return nums1;
    }
}