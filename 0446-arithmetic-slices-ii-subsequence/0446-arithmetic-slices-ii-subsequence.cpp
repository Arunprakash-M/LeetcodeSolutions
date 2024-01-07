class Solution {
public:
    int numberOfArithmeticSlices(vector<int>& nums) {
        int num = nums.size();
        vector<vector<int>> dp(num, vector<int>(num, 0));
        unordered_map<long, vector<int>> map;

        for (int i = 0; i < num; i++) {
            long temp = nums[i];
            if (!map.count(temp)) {
                map[temp] = vector<int>();
            }
            map[temp].push_back(i);
        }

        int sum = 0;
        for (int i = 1; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                long a = 2L * nums[i] - nums[j];
                if (map.count(a)) {
                    for (int k : map[a]) {
                        if (k < i) {
                            dp[i][j] += dp[k][i] + 1;
                        } else {
                            break;
                        }
                    }
                }
                sum += dp[i][j];
            }
        }
        return sum;
    }
};