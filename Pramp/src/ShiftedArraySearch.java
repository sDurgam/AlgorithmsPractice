package src;

public class ShiftedArraySearch {

	public static int findPivot(int[] arr, int start, int end) {
		if (arr == null || arr.length <= 1 || start >= end)
			return -1;
		int mid = (start + end) / 2;
		if (arr[mid] < arr[mid - 1])
			return mid - 1;
		if (arr[mid] < arr[0])
			return findPivot(arr, start, mid - 1);
		return findPivot(arr, mid + 1, end);
	}

	public static int shiftedArrSearch(int[] shiftArr, int num) {
		int pivotIndex = findPivot(shiftArr, 0, shiftArr.length);
		if (pivotIndex == -1)
			return searchNumber(shiftArr, 0, shiftArr.length, num);
		int index = -1;
		if (num < shiftArr[pivotIndex]) {
			index = searchNumber(shiftArr, pivotIndex + 1, shiftArr.length, num);
		} else {
			index = searchNumber(shiftArr, 0, pivotIndex, num);
		}
		return index;
	}

	public static int searchNumber(int[] arr, int start, int end, int num) {
		if (start > end)
			return -1;
		int mid = (start + end) / 2;
		if (arr[mid] == num) {
			return mid;
		} else if (num < arr[mid]) {
			return searchNumber(arr, start, mid - 1, num);
		}
		return searchNumber(arr, mid + 1, end, num);
	}

	public static void main(String[] args) {

	}

}