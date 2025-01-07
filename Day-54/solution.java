class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
          Map<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;

            // Check if the complement exists in the map
            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }

            // Update the frequency of the current number
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
