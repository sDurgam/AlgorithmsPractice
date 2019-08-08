package src;

/*
A Toeplitz matrix is a matrix where every left-to-right-descending diagonal has the same element. Given a non-empty matrix arr, write a function that returns true if and only if it is a Toeplitz matrix. The matrix can be any dimensions, not necessarily square.

For example,[[1,2,3,4],
 [5,1,2,3],
 [6,5,1,2]]
is a Toeplitz matrix, so we should return true, while
[[1,2,3,4],
 [5,1,9,3],
 [6,5,1,2]]
isn’t a Toeplitz matrix, so we should return false.
Constraints:

    [time limit] 5000ms
    [input] array.array.integer arr
        0 ≤ arr.length ≤ 20
        0 ≤ arr[i].length ≤ 20
        0 ≤ arr[i][j] ≤ 20
    [output] boolean
*/
import java.io.*;
import java.util.*;

class Toeplitz {

	// r * c
	// [0][0][1][1][2][2]...[r-1][k]
	// [0][1],

	// [1, 2, 3, 4]
	static boolean isToeplitz(int[][] arr) {
		if (arr == null || arr.length == 0)
			return false;
		boolean isToeplitz = true;
		int rows = arr.length;
		int cols = arr[0].length;
		for (int r = 1; r < rows; r++) {
			for (int c = 1; c < cols; c++) {
				if (!isToeplitz)
					return false;
				isToeplitz = isToeplitz && (arr[r - 1][c - 1] == arr[r][c]);
			}
		}
		return isToeplitz;
	}

	public static void main(String[] args) {
	}
}
