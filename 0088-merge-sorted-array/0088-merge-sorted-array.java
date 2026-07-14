class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        int[] arr= new int[n+m];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            arr[j+m]=nums2[j];
        }
        Arrays.sort(arr);
         for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
         }
    }
}