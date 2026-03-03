class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public static void backtrack(List<List<Integer>> r, List<Integer> temp, int[] arr, int start) {
        r.add(new ArrayList<>(temp));
        
        for (int i = start; i < arr.length; i++) {
            temp.add(arr[i]);
            backtrack(r, temp, arr, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}