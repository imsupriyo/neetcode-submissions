class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer>[] freqMap = new List[nums.length + 1]; // no num with 0 freq, so use +1

        for (int n : nums) 
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        for (int i=0; i<freqMap.length; i++) {
            freqMap[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            freqMap[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int idx = 0;

        for (int i=freqMap.length-1; i>0 && idx < k; i--) {
            for (int n : freqMap[i]) {
                res[idx++] = n;
            if (idx == k)   return res;
            }
        }
        return res;
    }
}
