

class GetCommoneLeast {
    static int getCommon(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    return nums1[i]; // immediately return the first match (smallest)
                }
                if (nums2[j] > nums1[i]) break; // since arrays are sorted, no need to check further
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {2, 4};
        System.out.println(getCommon(nums1, nums2)); // Output: 2 ✅
    }
}
