class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        // Base case: 10^0 = 1, only the number 0 exists in range [0, 1)
        if (n == 0) {
            return 1;
        }

        int total = 10; // Count for n = 1 (0, 1, 2...9)
        int currentOptions = 9; // Choices for the first digit (1-9)
        int availableDigits = 9; // Choices for the next digits (starts at 9)

        //Beyond n=10, unique digits are impossible.
        for (int i = 2; i <= Math.min(n, 10); i++) {
            currentOptions = currentOptions * availableDigits;
            total += currentOptions;
            availableDigits--;
        }

        return total;
    }
}