/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevent integer overflow
            int res = guess(mid); // Call the pre-defined API
            if (res == 0) {
                return mid; // The guessed number is correct
            } else if (res < 0) {
                right = mid - 1; // The picked number is smaller
            } else {
                left = mid + 1; // The picked number is larger
            }
        }
        return -1;
        
    }
    
   
}