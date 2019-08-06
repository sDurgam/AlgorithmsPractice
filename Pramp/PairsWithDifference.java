
/*
Pairs with Specific Difference
Given an array arr of distinct integers and a nonnegative integer k, write a function findPairsWithGivenDifference that returns an array of all pairs [x,y] in arr,
such that x - y = k. If no such pairs exist, return an empty array.
Note: the order of the pairs in the output array should maintain the order of the y element in the original array.
*/
import java.io.*;
import java.util.*;

class Solution {
	// 0, -1, -2, 2, 1
	// x-y = k
	// {y + k, y}
	// pass1: {0, -1, -2, 2 ,1} :set
	// pass2: itrerate through the array
	// {[0, -1], [-1, -2], [1, 0],[2, 1]}
	//
	static int[][] findPairsWithGivenDifference(int[] arr, int k) {
		if (arr == null)
			return new int[][] {};
		int[][] result = new int[arr.length][2];
		int arrSize = 0;
		Set<Integer> numbersSet = new HashSet<Integer>();
		for (int index = 0; index < arr.length; index++) {
			numbersSet.add(arr[index]);
		}
		for (int index = 0; index < arr.length; index++) {
			int y = arr[index];
			if (numbersSet.contains(y + k)) {
				result[arrSize][0] = y + k;
				result[arrSize][1] = y;
				arrSize++;
			}
		}
		int[][] r = new int[arrSize][2];
		for (int i = 0; i < arrSize; i++) {
			r[i][0] = result[i][0];
			r[i][1] = result[i][1];
		}
		return r;
	}

	public static void main(String[] args) {

	}

}
