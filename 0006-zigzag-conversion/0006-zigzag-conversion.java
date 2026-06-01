class Solution {
    public String convert(String s, int numRows) {
                if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create rows
        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = true;

        for (char c : s.toCharArray()) {

            // Put character in current row
            rows[currentRow].append(c);

            // If bottom reached, go up
            if (currentRow == numRows - 1) {
                goingDown = false;
            }

            // If top reached, go down
            if (currentRow == 0) {
                goingDown = true;
            }

            // Move to next row
            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna