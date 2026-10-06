import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> result = new ArrayList<>();

        for (int[] current : intervals) {

            if (result.isEmpty()) {
                result.add(current);
            }
            else {
                int[] last = result.get(result.size() - 1);

                if (current[0] > last[1]) {
                    result.add(current);
                }
                else {
                    last[1] = Math.max(last[1], current[1]);
                }
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}